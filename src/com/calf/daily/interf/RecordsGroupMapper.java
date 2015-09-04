package com.calf.daily.interf;

import com.calf.daily.model.RecordsGroup;

public interface RecordsGroupMapper {
    int deleteByPrimaryKey(String id);

    int insert(RecordsGroup record);

    int insertSelective(RecordsGroup record);

    RecordsGroup selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RecordsGroup record);

    int updateByPrimaryKey(RecordsGroup record);
}