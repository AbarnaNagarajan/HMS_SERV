package com.arl.hms.service.mapper;

import org.mapstruct.Mapper;

import com.arl.hms.domain.entity.HospitalMaster;
import com.arl.hms.service.dto.HospitalMasterDto;

@Mapper(componentModel = "spring")
public interface HospitalMasterMapper {

	HospitalMaster toEntity(HospitalMasterDto hospitalMasterDto);

	HospitalMasterDto toDto(HospitalMaster hospitalMaster);
}
