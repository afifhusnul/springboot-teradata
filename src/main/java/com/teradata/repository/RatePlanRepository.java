/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teradata.repository;

import com.teradata.entity.RatePlan;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author NUSNAFIF
 */
public interface RatePlanRepository extends JpaRepository<RatePlan, Long>{
    
}
