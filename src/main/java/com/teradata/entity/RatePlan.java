/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.teradata.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author NUSNAFIF
 */
@Entity
@Table(name="DCC_QRB_RT_PLN")
public class RatePlan {
    @Id
    @Column(name="RT_PLN_DESC", nullable = false)
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "RatePlan{" + "id=" + id + '}';
    }
    
    
}
