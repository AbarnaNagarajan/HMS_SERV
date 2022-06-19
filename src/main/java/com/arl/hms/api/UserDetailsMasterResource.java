/**
 * 
 */
package com.arl.hms.api;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.arl.hms.service.IUserDetailsMasterService;
import com.arl.hms.service.dto.UserDetailsMasterDto;

/**
 * @author ABARNA NAGARAJAN
 *
 */
@RestController
@RequestMapping("/api/user")
public class UserDetailsMasterResource {

	public static Logger log = LoggerFactory.getLogger(UserDetailsMasterResource.class);
	
	private IUserDetailsMasterService userDetailsMasterService;

	public UserDetailsMasterResource(IUserDetailsMasterService userDetailsMasterService) {
		this.userDetailsMasterService = userDetailsMasterService;
	}

	@GetMapping("/getAllUserDetails")
	public ResponseEntity<List<UserDetailsMasterDto>> getAllUserDetails() {
		log.debug("--Requesting to get user Details--");
		try {
			List<UserDetailsMasterDto> userDetails = userDetailsMasterService.getAllUserDetails();
			return new ResponseEntity<>(userDetails, HttpStatus.OK);
		} catch (Exception ex) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

	@PostMapping("/insertUserDetails")
	public ResponseEntity<UserDetailsMasterDto> insertUserDetails(
			@RequestBody UserDetailsMasterDto userDetailsMasterDto) {
		log.debug("--Requesting to save user Details--");
		log.debug("params: {}", userDetailsMasterDto);
		try {
			UserDetailsMasterDto userDetails = userDetailsMasterService.insertUserDetails(userDetailsMasterDto);
			return new ResponseEntity<>(userDetails, HttpStatus.OK);
		} catch (Exception ex) {
			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}

}
