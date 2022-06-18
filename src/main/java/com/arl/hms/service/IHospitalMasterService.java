package com.arl.hms.service;

import java.util.List;

import com.arl.hms.service.dto.HospitalMasterDto;

public interface IHospitalMasterService {

	List<HospitalMasterDto> getAllHospitalMaster();

	HospitalMasterDto insertHospitalDetails(HospitalMasterDto hospitalMasterDto);
}
