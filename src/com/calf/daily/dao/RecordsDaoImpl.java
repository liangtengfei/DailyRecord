package com.calf.daily.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.calf.daily.model.Records;

@Repository("recordsDao")
public class RecordsDaoImpl implements RecordsDao {
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
	public int insert(Records record) {
		return sqlSessionTemplate.insert("insertRecord", record);
	}

	@Override
	public int insertSelective(Records record) {
		return sqlSessionTemplate.insert("insertSelectiveRecord", record);
	}

	@Override
	public Records selectByPrimaryKey(String id) {
		return sqlSessionTemplate.selectOne("selectRecordByPrimaryKey", id);
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
		return sqlSessionTemplate.selectList("getAllRecords");
	}
	@Override
	public List<Records> selectByKeywords(String recordTitle) {
		return sqlSessionTemplate.selectList("selectByKeywords", recordTitle);
	}

}
