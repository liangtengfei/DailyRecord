package com.calf.daily.interf;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.calf.daily.dao.RecordSysLogDao;
import com.calf.daily.model.RecordSysLog;

@Service("recordSysLogService")
public class RecordSysLogService implements RecordSysLogMapper {

	private RecordSysLogDao recordSysLogDao;
	public RecordSysLogDao getRecordSysLogDao() {
		return recordSysLogDao;
	}
	@Resource
	public void setRecordSysLogDao(RecordSysLogDao recordSysLogDao) {
		this.recordSysLogDao = recordSysLogDao;
	}

	@Override
	public int deleteByPrimaryKey(String id) {
		return 0;
	}

	@Override
	public int insert(RecordSysLog record) {
		return recordSysLogDao.insert(record);
	}

	@Override
	public int insertSelective(RecordSysLog record) {
		return recordSysLogDao.insertSelective(record);
	}

	@Override
	public RecordSysLog selectByPrimaryKey(String id) {
		return recordSysLogDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(RecordSysLog record) {
		return 0;
	}

	@Override
	public int updateByPrimaryKey(RecordSysLog record) {
		return 0;
	}

	@Override
	public List<RecordSysLog> getAllRecordSysLogs() {
		return recordSysLogDao.getAllRecordSysLogs();
	}

}
