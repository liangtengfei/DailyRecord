package com.calf.daily.interf;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.calf.daily.dao.RecordsDao;
import com.calf.daily.model.Records;

@Service("recordsService")
public class RecordsService implements RecordsMapper {
	private RecordsDao recordsDao;
	public RecordsDao getRecordsDao() {
		return recordsDao;
	}
	@Resource
	public void setRecordsDao(RecordsDao recordsDao) {
		this.recordsDao = recordsDao;
	}

	@Override
	public int deleteByPrimaryKey(String id) {
		return 0;
	}

	@Override
	public int insert(Records record) {
		return recordsDao.insert(record);
	}

	@Override
	public int insertSelective(Records record) {
		return recordsDao.insert(record);
	}

	@Override
	public Records selectByPrimaryKey(String id) {
		return recordsDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Records record) {
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Records record) {
		return 0;
	}

	@Override
	public List<Records> getAllRecords() {
		return recordsDao.getAllRecords();
	}
	@Override
	public List<Records> selectByKeywords(String recordTitle) {
		return recordsDao.selectByKeywords(recordTitle);
	}

}
