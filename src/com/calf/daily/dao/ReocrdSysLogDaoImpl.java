package com.calf.daily.dao;

import java.util.List;

import javax.annotation.Resource;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import com.calf.daily.model.RecordSysLog;

@Repository("recordSysLogDao")
public class ReocrdSysLogDaoImpl implements RecordSysLogDao {

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
	public int insert(RecordSysLog record) {
		return sqlSessionTemplate.insert("insertSysLog", record);
	}

	@Override
	public int insertSelective(RecordSysLog record) {
		return sqlSessionTemplate.insert("insertSelectiveSysLog", record);
	}

	@Override
	public RecordSysLog selectByPrimaryKey(String id) {
		return sqlSessionTemplate.selectOne("selectSysLogByPrimaryKey", id);
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
		return sqlSessionTemplate.selectList("getAllRecordSysLogs");
	}

}
