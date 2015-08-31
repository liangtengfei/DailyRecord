package com.calf.daily.action;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.calf.daily.interf.RecorderMapper;
import com.calf.daily.model.Recorder;

@Controller
@RequestMapping("/user.sm")
public class RecorderController {
	private RecorderMapper recordService;
	
	@RequestMapping(value="/")
	public String toIndex(){
		return "redirect:index.html";
	}
	@RequestMapping(params="m=login", method = RequestMethod.POST)
	public String userLogin(Recorder user){
		Recorder r=recordService.selectByNamePass(user);
		if(r==null){
			return "redirect:index.html";
		}
		return "index";
	}
	
	
	public RecorderMapper getRecordService() {
		return recordService;
	}
	@Resource
	public void setRecordService(RecorderMapper recordService) {
		this.recordService = recordService;
	}
}
