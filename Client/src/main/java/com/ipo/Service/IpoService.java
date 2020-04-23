package com.ipo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ipo.Dao.DaoList;
import com.ipo.Model.Details;

@Service
public class LService {
	@Autowired
	DaoList dao;
	
	
	
	public List<Details> getAll(){
		return dao.getDetails();
	}
	

}
