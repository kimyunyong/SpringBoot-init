package com.kyy.blog.test;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpController {
	private static final String TAG = "HttpController";
	
	@GetMapping("/http/lombok")
	public String lombokTest(){
		Member m = new Member(1, "kyy", "1111", "kyy3326@gmail.com");
		System.out.println(TAG + "getter : " + m.getId());
		m.setId(5000);
		System.out.println(TAG + "setter : " + m.getId());
		Member.builder().id(1).username("yy").password("2222").email("gmail");
		System.out.println(TAG + "getter : " + m.getId());
		
		return "lombok test 완료";
	}
	
	// http://localhost:8080/http/get
	@GetMapping("/http/get")
	public String getTest(Member m) {
		return "get요청 : " + m.getId() + ", " + m.getUsername() + ", " + m.getEmail();
	}
	
	@PostMapping("/http/post")
	public String postTest() {
		return "post요청";
	}
	
	@PutMapping("/http/put")
	public String putTest() {
		return "puts요청";
	}
	
	@DeleteMapping("/http/delete")
	public String deleteTest() {
		return "delete요청";
	}
}
