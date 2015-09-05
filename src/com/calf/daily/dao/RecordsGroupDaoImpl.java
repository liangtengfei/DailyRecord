package com.calf.daily.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.calf.daily.model.RecordsGroup;

@Repository("recordsGroupDao")
public class RecordsGroupDaoImpl implements RecordsGroupDao {
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
	public int insert(RecordsGroup record) {
		return sqlSessionTemplate.insert("insertGroup", record);
	}

	@Override
	public int insertSelective(RecordsGroup record) {
		return sqlSessionTemplate.insert("insertSelectiveGroup", record);
	}

	@Override
	public RecordsGroup selectByPrimaryKey(String id) {
		return sqlSessionTemplate.selectOne("selectGroupByPrimaryKey", id);
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
		return sqlSessionTemplate.selectList("getAllRecordsGroup");
	}

}
