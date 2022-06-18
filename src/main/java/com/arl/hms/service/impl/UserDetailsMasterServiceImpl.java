/**
 * 
 */
package com.arl.hms.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.arl.hms.domain.entity.UserDetailsMaster;
import com.arl.hms.domain.repository.UserDetailsMasterRepository;
import com.arl.hms.service.IUserDetailsMasterService;
import com.arl.hms.service.dto.UserDetailsMasterDto;
import com.arl.hms.service.mapper.UserDetailsMasterMapper;

import lombok.extern.slf4j.Slf4j;

/**
 * @author WDSI
 *
 */
@Slf4j
@Service
public class UserDetailsMasterServiceImpl implements IUserDetailsMasterService {

	private UserDetailsMasterMapper userDetailsMasterMapper;

	private UserDetailsMasterRepository userDetailsMasterRepo;

	public UserDetailsMasterServiceImpl(UserDetailsMasterMapper userDetailsMasterMapper,
			UserDetailsMasterRepository userDetailsMasterRepo) {
		this.userDetailsMasterMapper = userDetailsMasterMapper;
		this.userDetailsMasterRepo = userDetailsMasterRepo;
	}

	@Override
	public List<UserDetailsMasterDto> getAllUserDetails() {
		try {
			return userDetailsMasterRepo.findAll().stream().map(userDetailsMasterMapper::toDto)
					.collect(Collectors.toList());
		} catch (Exception ex) {
			log.debug("Exception occurred in getAllUserDetails: {}", ex.getMessage());
			return null;
		}
	}

	@Override
	public UserDetailsMasterDto insertUserDetails(UserDetailsMasterDto userDetailsMasterDto) {
		try {
			UserDetailsMaster userData = userDetailsMasterRepo
					.save(userDetailsMasterMapper.toEntity(userDetailsMasterDto));
			return userDetailsMasterMapper.toDto(userData);
		} catch (Exception ex) {
			log.debug("Exception occurred in insertUserDetails: {}", ex.getMessage());
			return null;
		}
	}

}
