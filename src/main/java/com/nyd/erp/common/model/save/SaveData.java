package com.nyd.erp.common.model.save;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
public class SaveData<T> {
	private List<T> updated;
	private List<T> created;
	private List<T> deleted;
	
	public void save(JpaRepository<T,Long> repository) {
		
		for(T createData : created) {
			repository.save(createData);
		}
		
		for(T updateData : updated) {
			repository.save(updateData);		
		}
		
		for(T deletedData : deleted) {
			repository.delete(deletedData);
		}
		
	}
	
}
