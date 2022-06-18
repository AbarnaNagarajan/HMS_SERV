/**
 * 
 */
package com.arl.hms.domain.entity;

import java.io.Serializable;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.TimeZone;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;

import org.hibernate.envers.Audited;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import com.arl.hms.util.Constants;

import lombok.Data;

/**
 * @author ABARNA NAGARAJAN
 *
 */
@Audited
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public abstract class AbstractEntity implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@CreatedBy
	@Column(name = "created_by", nullable = false, length = 50, updatable = false)
	private Long createdBy = 1L;

	@CreatedDate
	@Column(name = "created_date", updatable = false)
	private Instant createdDate = Instant.now().plus(TimeZone.getTimeZone(Constants.TIME_ZONE).getOffset(new Date().getTime()), ChronoUnit.MILLIS);

	@LastModifiedBy
	@Column(name = "last_modified_by", length = 50)
	private Long lastModifiedBy;

	@LastModifiedDate
	@Column(name = "last_modified_date")
	private Instant lastModifiedDate = Instant.now().plus(TimeZone.getTimeZone(Constants.TIME_ZONE).getOffset(new Date().getTime()), ChronoUnit.MILLIS);

	@Column(name = "is_active", columnDefinition = "boolean default true", nullable = false)
	private Boolean isActive = true;

}
