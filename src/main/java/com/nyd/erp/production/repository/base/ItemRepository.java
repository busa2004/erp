package com.nyd.erp.production.repository.base;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nyd.erp.production.domain.base.Item;

public interface ItemRepository extends JpaRepository<Item,Long> {
}

