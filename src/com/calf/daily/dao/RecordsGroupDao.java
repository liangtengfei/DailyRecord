package com.calf.daily.dao;

import java.util.List;

import com.calf.daily.model.RecordsGroup;

public interface RecordsGroupDao {
	
	 	int deleteByPrimaryKey(String id);

	    int insert(RecordsGroup record);

	    int insertSelective(RecordsGroup record);

	    RecordsGroup selectByPrimaryKey(String id);

	    int updateByPrimaryKeySelective(RecordsGroup record);

	    int updateByPrimaryKey(RecordsGroup record);
	    
	    List<RecordsGroup> getAllRecordsGroup();
}
