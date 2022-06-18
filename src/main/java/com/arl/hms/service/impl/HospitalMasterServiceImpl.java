package com.arl.hms.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.arl.hms.domain.entity.HospitalMaster;
import com.arl.hms.domain.repository.HospitalMasterRepository;
import com.arl.hms.service.IHospitalMasterService;
import com.arl.hms.service.dto.HospitalMasterDto;
import com.arl.hms.service.mapper.HospitalMasterMapper;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class HospitalMasterServiceImpl implements IHospitalMasterService {

	private HospitalMasterMapper hospitalMasterMapper;

	private HospitalMasterRepository hospitalMasterRepo;

	public HospitalMasterServiceImpl(HospitalMasterMapper hospitalMasterMapper,
			HospitalMasterRepository hospitalMasterRepo) {
		this.hospitalMasterMapper = hospitalMasterMapper;
		this.hospitalMasterRepo = hospitalMasterRepo;
	}

	@Override
	public List<HospitalMasterDto> getAllHospitalMaster() {
		try {
			return hospitalMasterRepo.findAll().stream().map(hospitalMasterMapper::toDto).collect(Collectors.toList());
		} catch (Exception ex) {
			log.debug("Exception occurred in getAllHospitalMaster: {}", ex.getMessage());
			return null;
		}
	}

	@Override
	public HospitalMasterDto insertHospitalDetails(HospitalMasterDto hospitalMasterDto) {
		try {
			HospitalMaster hospitalData = hospitalMasterRepo.save(hospitalMasterMapper.toEntity(hospitalMasterDto));
			return hospitalMasterMapper.toDto(hospitalData);
		} catch (Exception ex) {
			log.debug("Exception occurred in getAllHospitalMaster: {}", ex.getMessage());
			return null;
		}
	}
}
