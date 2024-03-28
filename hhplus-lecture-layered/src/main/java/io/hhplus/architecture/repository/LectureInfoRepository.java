package io.hhplus.architecture.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import io.hhplus.architecture.domain.LectureInfo;
import jakarta.persistence.LockModeType;

@Repository
public interface LectureInfoRepository extends JpaRepository<LectureInfo, Long> {

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Query("SELECT l FROM LectureInfo l WHERE l.lectureId = :lectureId")
    Optional<LectureInfo> findByLectureIdWithWriteLock(@Param("lectureId") Long lectureId);



 

}
