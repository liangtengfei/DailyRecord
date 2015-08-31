package com.calf.daily.dao;


import com.calf.daily.model.Recorder;

public interface RecorderDao {
	int deleteByPrimaryKey(String id);

    int insert(Recorder record);

    int insertSelective(Recorder record);

    Recorder selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Recorder record);

    int updateByPrimaryKey(Recorder record);
    
    Recorder selectByNamePass(Recorder record);
}
