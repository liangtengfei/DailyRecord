package com.calf.daily.syslog;

import java.util.Date;

import javax.annotation.Resource;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

import com.calf.daily.interf.RecordSysLogService;
import com.calf.daily.model.RecordSysLog;
import com.calf.daily.model.Recorder;

@Aspect
@Component
public class SsyLogInterceptor {
	private RecordSysLogService recordSysLogService;
	public RecordSysLogService getRecordSysLogService() {
		return recordSysLogService;
	}
	@Resource
	public void setRecordSysLogService(RecordSysLogService recordSysLogService) {
		this.recordSysLogService = recordSysLogService;
	}
	
	@Pointcut("execution(* com.calf.daily.dao.*.*(..))")
	public void myMethod(){
		
	}
	@After("execution(* com.calf.daily.dao.RecorderDaoImpl.insert(com.calf.daily.model.Recorder)) && args(recorder,..)")
	public void doAddAfter(Recorder recorder){
		RecordSysLog log=new RecordSysLog();
		log.setLogmethod("com.calf.daily.dao.RecorderDaoImpl.insert");
		log.setContent("新增了一个用户:"+recorder.getUsername());
		log.setLogtime(new Date());
		recordSysLogService.insert(log);
	}
}
