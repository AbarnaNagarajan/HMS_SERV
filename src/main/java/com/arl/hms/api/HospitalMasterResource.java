package com.arl.hms.api;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arl.hms.service.IHospitalMasterService;
import com.arl.hms.service.dto.HospitalMasterDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@RequestMapping("/api/hospital")
public class HospitalMasterResource {

	private IHospitalMasterService hospitalMasterService;

	public HospitalMasterResource(IHospitalMasterService hospitalMasterService) {
		this.hospitalMasterService = hospitalMasterService;
	}

	@GetMapping("/getAllHospitalDetails")
	public ResponseEntity<List<HospitalMasterDto>> getAllHospitalDetails() {
		log.debug("--Requesting to get hospital Details--");
		try {
			List<HospitalMasterDto> hospitalDetails = hospitalMasterService.getAllHospitalMaster();
			return new ResponseEntity<>(hospitalDetails, HttpStatus.OK);
		} catch (Exception ex) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/insertHospitalDetails")
	public ResponseEntity<HospitalMasterDto> insertHospitalDetails(@RequestBody HospitalMasterDto hospitalMasterDto) {
		log.debug("--Requesting to save hospital Details--");
		log.debug("params: {}", hospitalMasterDto);
		try {
			HospitalMasterDto hospitalDetails = hospitalMasterService.insertHospitalDetails(hospitalMasterDto);
			return new ResponseEntity<>(hospitalDetails, HttpStatus.OK);
		} catch (Exception ex) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
