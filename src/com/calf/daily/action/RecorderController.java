package com.calf.daily.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.calf.daily.interf.RecorderMapper;
import com.calf.daily.model.Recorder;

@Controller
@RequestMapping("/user")
@SessionAttributes({"username","result"})
public class RecorderController {
	private RecorderMapper recordService;
	
	@RequestMapping(value="/", method=RequestMethod.GET)
	public String toIndex(){
		return "redirect:index.html";
	}
	@RequestMapping(params="m=login", method = RequestMethod.POST)
	@ResponseBody
	public Recorder userLogin(HttpSession session, @RequestBody Recorder user){
		Recorder r=recordService.selectByNamePass(user);
		if(r==null){
			return r;
		}
		session.setAttribute("username", r.getUsername());
		return r;
	}
	@RequestMapping(params="m=regist", method = RequestMethod.POST)
	public @ResponseBody int userRegist(@RequestBody Recorder user){
		int result=recordService.insertSelective(user);
		return result;
	}
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
