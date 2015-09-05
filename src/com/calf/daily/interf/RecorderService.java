package com.calf.daily.interf;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.calf.daily.dao.RecorderDao;
import com.calf.daily.model.Recorder;

@Service("recorderService")
public class RecorderService implements RecorderMapper {
	
	private RecorderDao recorderDao;
	public RecorderDao getRecorderDao() {
		return recorderDao;
	}
	@Resource
	public void setRecorderDao(RecorderDao recorderDao) {
		this.recorderDao = recorderDao;
	}
	@Override
	public int deleteByPrimaryKey(String id) {
		return recorderDao.deleteByPrimaryKey(id);
	}

	@Override
	public int insert(Recorder record) {
		return recorderDao.insert(record);
	}

	@Override
	public int insertSelective(Recorder record) {
		return recorderDao.insertSelective(record);
	}

	@Override
	public Recorder selectByPrimaryKey(String id) {
		return recorderDao.selectByPrimaryKey(id);
	}

	@Override
	public int updateByPrimaryKeySelective(Recorder record) {
		return recorderDao.updateByPrimaryKey(record);
	}

	@Override
	public int updateByPrimaryKey(Recorder record) {
		return recorderDao.updateByPrimaryKey(record);
	}

	@Override
	public Recorder selectByNamePass(Recorder record) {
		return recorderDao.selectByNamePass(record);
	}

}
