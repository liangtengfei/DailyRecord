package com.calf.daily.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.calf.daily.interf.RecorderMapper;
import com.calf.daily.model.Recorder;

@Controller
@RequestMapping("/user")
public class RecorderController {
	private RecorderMapper recordService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String toIndex(){
		return "redirect:index.html";
	}
	@RequestMapping(params="m=login", method = RequestMethod.POST)
	public String userLogin(Recorder user){
		Recorder r=recordService.selectByNamePass(user);
		if(r==null){
			return "redirect:login.html";
		}
		return "index";
	}
	@RequestMapping(params="m=regist", method = RequestMethod.POST)
	public String userRegist(Recorder user){
		int result=recordService.insertSelective(user);
		if(result==0){
			return "redirect:regist.html";
		}
		return "index";
	}
	/*@RequestMapping(params="m=login", method = RequestMethod.POST)
	public String userLogin(Recorder user){
		Recorder r=recordService.selectByNamePass(user);
		if(r==null){
			return "redirect:index.html";
		}
		return "index";
	}
	@RequestMapping(params="m=login", method=RequestMethod.POST)
	public String userRegist(){
		return "";
	}*/
	@RequestMapping(value="/record/{record_id}", method=RequestMethod.GET)
	public String getRecordById(@PathVariable("record_id")String id){
		return "";
	}
	public RecorderMapper getRecordService() {
		return recordService;
	}
	@Resource
	public void setRecordService(RecorderMapper recordService) {
		this.recordService = recordService;
	}
}
