/**
 * 
 */
package com.arl.hms.service.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ABARNA NAGARAJAN
 *
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserDetailsMasterDto {

	private Long userId;

	private String applicantName;

	private String username;

	private String password;

	private Long hospitalId;

}
