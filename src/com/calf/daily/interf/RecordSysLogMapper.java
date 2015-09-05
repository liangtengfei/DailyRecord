package com.calf.daily.interf;

import java.util.List;

import com.calf.daily.model.RecordSysLog;

public interface RecordSysLogMapper {
    int deleteByPrimaryKey(String id);

    int insert(RecordSysLog record);

    int insertSelective(RecordSysLog record);

    RecordSysLog selectByPrimaryKey(String id);

    int updateByPrimaryKeySelective(RecordSysLog record);

    int updateByPrimaryKey(RecordSysLog record);
    
    List<RecordSysLog> getAllRecordSysLogs();
}