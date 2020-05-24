package com.bw.mapper;

import java.util.List;
import java.util.Map;

import com.bw.beans.T_info;
import com.bw.beans.T_teacher;

public interface T_infoMapper {
	//查询所有
	public List<T_info> selectInfoAll(Map<String, Object> map);
	//查询所有老师
	public List<T_teacher> selectTeacherAll();
	//收被子
	public int  upradeInfo(Integer id);
	//晾被子
	public int addInfo(T_info info);
	//查一个
	public T_info selectById(Integer id);
}
