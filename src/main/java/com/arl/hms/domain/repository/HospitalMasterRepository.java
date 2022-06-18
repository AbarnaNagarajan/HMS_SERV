/**
 * 
 */
package com.arl.hms.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arl.hms.domain.entity.HospitalMaster;

/**
 * @author ABARNA NAGARAJAN
 *
 */
@Repository
public interface HospitalMasterRepository extends JpaRepository<HospitalMaster, Long> {

}
