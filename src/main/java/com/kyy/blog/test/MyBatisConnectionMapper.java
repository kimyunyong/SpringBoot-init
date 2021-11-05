package com.kyy.blog.test;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MyBatisConnectionMapper {
	public void insertEdu(EduVo edu);	
	public EduVo getEdu(EduVo edu);	
}
