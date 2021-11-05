package com.kyy.blog.test;

import java.sql.Timestamp;

import javax.persistence.Column;

import org.hibernate.annotations.CreationTimestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor 	// 빈 생성자
@ToString
// ToString(exclude = "password") // password를 제외한다.
public class EduVo {
	private String eduNo;
	@Column(nullable=false, length=20)
	private String name;
	private String numLimit;
	private String contents;
	private String price;
	private Timestamp startDate;
	private String endDate;
//	@CreationTimestamp // 시간이 자동으로 들어간다.
	private String regDate;
}
