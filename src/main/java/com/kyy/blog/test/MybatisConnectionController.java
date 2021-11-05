package com.kyy.blog.test;

import java.sql.Connection;
import java.sql.Timestamp;

import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MybatisConnectionController {
	@Autowired
    private SqlSessionFactory sqlSessionFactory;
	@Autowired
	private MybatisConnectionService service;
	
	// DBConnection 테스트
	@GetMapping("/test/hello")
	public String hello() {
		  try(Connection con = sqlSessionFactory.openSession().getConnection()){
	            System.out.println("커넥션 성공");
	        }catch(Exception e){
	            e.printStackTrace();
	        }
		  
		return "<h1>hello</h1>";
	}
	
	@GetMapping("/test/mybatis")
	public String connectionMybatis() {
		String dateTime = "2020-12-12 01:24:23";
		Timestamp timestamp = Timestamp.valueOf(dateTime);
		
		EduVo edu = new EduVo("", "이름", "10", "내용", "200", timestamp, "2021110712", "");
		service.insertEdu(edu);
		System.out.println(edu.getEduNo());
		System.out.println(service.getEdu(edu));
		return "실행완료";
	}
}
