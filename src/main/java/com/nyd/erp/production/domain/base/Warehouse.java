package com.nyd.erp.production.domain.base;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class Warehouse {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long warehouseNo;
	private String warehouseNm;
}