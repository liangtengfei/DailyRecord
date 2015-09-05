package com.calf.daily.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.calf.daily.interf.RecordsMapper;
import com.calf.daily.model.Records;

@Controller
@RequestMapping("/records.htm")
public class RecordsController {
	private RecordsMapper recordsService;
	
	@RequestMapping(params="m=getRecords", method=RequestMethod.GET)
	public String getRecordsById(@RequestParam("record_id") String id){
		Records record=recordsService.selectByPrimaryKey(id);
		if(record==null){
			return "404";
		}
		return "recordDetails";
	}
	
	@RequestMapping(params="m=getall", method=RequestMethod.GET)
	public String getListRecords(){
		List<Records> records=recordsService.getAllRecords();
		if(records==null){
			return "404";
		}
		return "recordsList";
	}
	@RequestMapping(params="m=add", method=RequestMethod.POST)
	public @ResponseBody String addRecord(@RequestBody Records record){
		int result=recordsService.insert(record);
		String id="";
		if(result==0){
			return "adderror";
		}else{
			id=record.getId();
		}
		return id;
	}
	
	/*
	 * getset方法
	 */
	public RecordsMapper getRecordsService() {
		return recordsService;
	}
	@Resource
	public void setRecordsService(RecordsMapper recordsService) {
		this.recordsService = recordsService;
	}
}
