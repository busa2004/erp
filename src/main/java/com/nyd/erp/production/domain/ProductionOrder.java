package com.nyd.erp.production.domain;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import com.nyd.erp.production.domain.base.Item;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class ProductionOrder {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderNo;
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "item_no")
	private Item item;
	private Long orderQt;
}
