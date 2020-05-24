package com.bw.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import org.aspectj.bridge.MessageWriter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bw.beans.T_info;
import com.bw.beans.T_teacher;
import com.bw.service.T_infoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;

@Controller
public class T_infoController {
	@Autowired
	private T_infoService tService;
	
	@RequestMapping("list.do")
	public String sayList(Model model,
			String tname,
			Integer status,
			String susheid,
			@RequestParam(defaultValue="1")Integer pageNum){
		PageHelper.startPage(pageNum, 2);
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("tname", tname);
		map.put("status", status);
		map.put("susheid", susheid);
		List<T_info> list = tService.selectInfoAll(map);
		
		PageInfo<T_info> plist = new PageInfo<T_info>(list);
		model.addAttribute("plist",plist);
		return "list";
	}
	
	@RequestMapping("list2.do")
	@ResponseBody
	public List<T_teacher> sayList2(){
		List<T_teacher> list = tService.selectTeacherAll();
		return list;
	}
	@RequestMapping("sb.do")
	@ResponseBody
	public boolean saysb(Integer id){
		
		int i = tService.upradeInfo(id);
		if(i>0){
			return true;
			
		}
		return false;
	}
	@RequestMapping("add.do")
	public String sayAdd(String name,Integer tname){
		T_info info = new T_info();
		info.setTc(tname);
		info.setName(name);
		info.setUptime(""+new Date());
		info.setStatus(1);
		tService.addInfo(info);
		return "redirect:list.do";
	}
	@RequestMapping("xq.do")
	public String sayXq(Integer id,Model model){
		T_info info = tService.selectById(id);
		model.addAttribute("user", info);
		return "xq";
	}
}
