package com.bw.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bw.beans.T_info;
import com.bw.beans.T_teacher;
import com.bw.mapper.T_infoMapper;
@Service
public class T_infoServiceImpl implements T_infoService {
	@Autowired
	private T_infoMapper tMapper;
	
	public List<T_info> selectInfoAll(Map<String, Object> map) {
		// TODO Auto-generated method stub
		return tMapper.selectInfoAll(map);
	}

	public List<T_teacher> selectTeacherAll() {
		// TODO Auto-generated method stub
		return tMapper.selectTeacherAll();
	}

	public int  upradeInfo(Integer id) {
		
		return tMapper.upradeInfo(id);
		
	}

	public int addInfo(T_info info) {
		// TODO Auto-generated method stub
		return tMapper.addInfo(info);
	}

	public T_info selectById(Integer id) {
		// TODO Auto-generated method stub
		return tMapper.selectById(id);
	}

}
