package com.calf.daily.interf;

import com.calf.daily.model.Recorder;

public interface RecorderMapper {
    int deleteByPrimaryKey(String id);

    int insert(Recorder record);

    int insertSelective(Recorder record);

    Recorder selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(Recorder record);

    int updateByPrimaryKey(Recorder record);
}