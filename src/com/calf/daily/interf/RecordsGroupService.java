package com.calf.daily.interf;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.calf.daily.dao.RecordsGroupDao;
import com.calf.daily.model.RecordsGroup;

@Service("recordsGroupService")
public class RecordsGroupService implements RecordsGroupMapper {

	private RecordsGroupDao recordsGroupDao;
	public RecordsGroupDao getRecordsGroupDao() {
		return recordsGroupDao;
	}
	@Resource
	public void setRecordsGroupDao(RecordsGroupDao recordsGroupDao) {
		this.recordsGroupDao = recordsGroupDao;
	}

	@Override
	public int deleteByPrimaryKey(String id) {
		return 0;
	}

	@Override
	public int insert(RecordsGroup record) {
		return recordsGroupDao.insert(record);
	}

	@Override
	public int insertSelective(RecordsGroup record) {
		return recordsGroupDao.insertSelective(record);
	}

	@Override
	public RecordsGroup selectByPrimaryKey(String id) {
		return recordsGroupDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(RecordsGroup record) {
		return 0;
	}

	@Override
	public int updateByPrimaryKey(RecordsGroup record) {
		return 0;
	}

	@Override
	public List<RecordsGroup> getAllRecordsGroup() {
		return recordsGroupDao.getAllRecordsGroup();
	}

}
