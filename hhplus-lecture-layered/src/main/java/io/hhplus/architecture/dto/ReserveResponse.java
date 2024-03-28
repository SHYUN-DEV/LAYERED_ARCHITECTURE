package io.hhplus.architecture.dto;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReserveResponse {
	private Long   reservationId;
    private Long   lectureId;
    private Long   userId;
    private String reserveDate;
}
