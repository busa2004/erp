package com.nyd.erp.production.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import com.nyd.erp.production.domain.base.Warehouse;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class ProductionReceive {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ReceiveNo;
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "inspection_no")
	private ProductionInspection inspection;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "warehouse_no")
	private Warehouse warehouse;
	private Long receiveQt;
	
}

