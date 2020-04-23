package com.ipo.Dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.ipo.Model.Details;
@Repository
public class DaoList {
	List<Details> list;
	
	public List<Details> getDetails(){
		list=new ArrayList<Details>();
		list.add(new Details(1,"Shivam"));
		list.add(new Details(2,"Sanchit"));
		return list;
	}

}
