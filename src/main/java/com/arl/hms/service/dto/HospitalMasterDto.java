package com.arl.hms.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class HospitalMasterDto {

	private Long hospitalId;

	private String hospitalName;

	private String description;
}
