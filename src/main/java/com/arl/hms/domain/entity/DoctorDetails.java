/**
 * 
 */
package com.arl.hms.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.envers.Audited;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Sribalagan
 *
 */
@Entity
@Table(name = "doctor_details")
@Builder
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Audited
public class DoctorDetails extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "doctor_id")
	private Long doctorId;
	
	@Column(name = "doctor_name")
	private String doctorName;
	
	@Column(name = "doctor_address")
	private String doctorAddress;

	@Column(name = "shift")
	private String shift;
	
	@Column(name = "doctor_contact")
	private String doctorContact;
}
   
