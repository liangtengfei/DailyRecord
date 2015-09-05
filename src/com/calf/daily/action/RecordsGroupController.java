package com.calf.daily.action;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.calf.daily.interf.RecordsGroupMapper;
import com.calf.daily.model.RecordsGroup;

@Controller
@RequestMapping("/recordgroups.shtml")
public class RecordsGroupController {
	private RecordsGroupMapper recordsGroupService;

	public RecordsGroupMapper getRecordsGroupService() {
		return recordsGroupService;
	}

	@Resource
	public void setRecordsGroupService(RecordsGroupMapper recordsGroupService) {
		this.recordsGroupService = recordsGroupService;
	}

	@RequestMapping(params = "m=getgroups", method = RequestMethod.GET)
	public @ResponseBody List<RecordsGroup> getAllGroup() {
		List<RecordsGroup> groups = recordsGroupService.getAllRecordsGroup();
		return groups;
	}
	@RequestMapping(params = "m=getgroup", method = RequestMethod.GET)
	public @ResponseBody RecordsGroup getGroup() {
		RecordsGroup groups = recordsGroupService.selectByPrimaryKey("EA27B008034D41F19D3BEED5FE9B8809");
		return groups;
	}
}
