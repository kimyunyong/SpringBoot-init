package com.kyy.blog.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MybatisConnectionService {
	@Autowired
	private MyBatisConnectionMapper mapper;
	
	public void insertEdu(EduVo edu) {
		mapper.insertEdu(edu);
	}
	
	public EduVo getEdu(EduVo edu) {
		return mapper.getEdu(edu);
	}
}
