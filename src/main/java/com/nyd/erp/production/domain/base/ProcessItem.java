package com.nyd.erp.production.domain.base;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@Entity
@NoArgsConstructor
public class ProcessItem implements Serializable {
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "process_no")
	private Process process;
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "item_no")
	private Item item;
	private Long itemQt;
}