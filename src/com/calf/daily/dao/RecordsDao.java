package com.calf.daily.dao;

import java.util.List;

import com.calf.daily.model.Records;

public interface RecordsDao {
    int deleteByPrimaryKey(String id);

    int insert(Records record);

    int insertSelective(Records record);

    Records selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Records record);

    int updateByPrimaryKey(Records record);
    
    List<Records> getAllRecords();
    
    List<Records> selectByKeywords(String recordTitle);
}