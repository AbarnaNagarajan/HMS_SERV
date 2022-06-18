package com.arl.hms.service;

import java.util.List;

import com.arl.hms.service.dto.UserDetailsMasterDto;

public interface IUserDetailsMasterService {

	List<UserDetailsMasterDto> getAllUserDetails();

	UserDetailsMasterDto insertUserDetails(UserDetailsMasterDto userDetailsMasterDto);

}
