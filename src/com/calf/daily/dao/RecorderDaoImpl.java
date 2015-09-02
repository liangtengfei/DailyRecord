package com.calf.daily.dao;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.calf.daily.model.Recorder;

@Repository("recorderDao")
public class RecorderDaoImpl implements RecorderDao {

	private SqlSessionTemplate sqlSessionTemplate;
	public SqlSessionTemplate getSqlSessionTemplate() {
		return sqlSessionTemplate;
	}
	@Resource
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

	@Override
	public int deleteByPrimaryKey(String id) {
		return 0;
	}

	@Override
	public int insert(Recorder record) {
		return sqlSessionTemplate.insert("insert",record);
	}

	@Override
	public int insertSelective(Recorder record) {
		//return sqlSessionTemplate.insert("insertSelective", record);
		return 0;
	}

	@Override
	public Recorder selectByPrimaryKey(String id) {
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Recorder record) {
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Recorder record) {
		return 0;
	}

	@Override
	public Recorder selectByNamePass(Recorder record) {
		
		return sqlSessionTemplate.selectOne("selectByNamePass", record);
	}

}
