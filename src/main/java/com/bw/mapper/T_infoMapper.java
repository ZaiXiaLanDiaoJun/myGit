package com.bw.mapper;

import java.util.List;
import java.util.Map;

import com.bw.beans.T_info;
import com.bw.beans.T_teacher;

public interface T_infoMapper {
	//��ѯ����
	public List<T_info> selectInfoAll(Map<String, Object> map);
	//��ѯ������ʦ
	public List<T_teacher> selectTeacherAll();
	//�ձ���
	public int  upradeInfo(Integer id);
	//������
	public int addInfo(T_info info);
	//��һ��
	public T_info selectById(Integer id);
}
