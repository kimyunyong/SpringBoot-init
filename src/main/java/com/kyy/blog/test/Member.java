package com.kyy.blog.test;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data			// getter, setter
//@AllArgsConstructor	// 모든 args 생성자
@NoArgsConstructor 	// 빈 생성자
public class Member {
	private int id;
	private String username;
	private String password;
	private String email;
	
	@Builder
	public Member(int id, String username, String password, String email) {
		this.username = username;
		this.password = password;
		this.email = email;
	}
}
