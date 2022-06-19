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
@Table(name = "patient_details")
@Builder
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Audited
public class PatientDetails extends AbstractEntity {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "patient_id")
	private Long patientId;

	@Column(name = "patient_name")
	private String patientName;

	@Column(name = "patient_address")
	private String patientAddress;

	@Column(name = "patient_contact")
	private String patientContact;
	
	@Column(name = "patient_details")
	private String patientDetails;
}

