/**
 * 
 */
package com.arl.hms.service.mapper;

import org.mapstruct.Mapper;

import com.arl.hms.domain.entity.UserDetailsMaster;
import com.arl.hms.service.dto.UserDetailsMasterDto;

/**
 * @author ABARNA NAGARAJAN
 *
 */
@Mapper(componentModel = "spring")
public interface UserDetailsMasterMapper {
	
	UserDetailsMaster toEntity(UserDetailsMasterDto userDetailsMasterDto);

	UserDetailsMasterDto toDto(UserDetailsMaster userDetailsMaster);

}
