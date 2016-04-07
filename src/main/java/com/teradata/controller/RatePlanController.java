/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teradata.controller;

import com.teradata.entity.RatePlan;
import com.teradata.repository.RatePlanRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author NUSNAFIF
 */
@RestController
@RequestMapping("/rate")
public class RatePlanController {
    
    @Autowired
    RatePlanRepository rpr;
    
     @RequestMapping(value = "/list", method = RequestMethod.GET)
    public List<RatePlan> cariPlan(Pageable page) {
        return rpr.findAll();
    }
    
//    @RequestMapping(method = RequestMethod.GET)
//	public List<User> findItems() {
//		return userService.listAll();
//	}
            
    
}
