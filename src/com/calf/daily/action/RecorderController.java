package com.calf.daily.action;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.calf.daily.model.Recorder;

@Controller
@RequestMapping("/user")
public class RecorderController {
	private Recorder record;
	
	public String getOneByNameAndpass(String name,String pass){
		return "";
	}
	public String userLogin(){
		return "";
	}
	
	
	public Recorder getRecord() {
		return record;
	}
	public void setRecord(Recorder record) {
		this.record = record;
	}
}
