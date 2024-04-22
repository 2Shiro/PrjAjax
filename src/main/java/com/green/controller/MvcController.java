package com.green.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


// @Controller + @RequestMapping    :  .jsp, .mustache츨 찾고
// @Controller + @RequestMapping + @responseBody 
//   : .jsp, .mustache츨 찾지않고 data를 출력한다 : 새로운 페이지에
// @Controller +  @ResponseBody : @RestController
//  모든 함수에 @ResponseBody 가 적용된다
//  @Controller     : view 파일을 리턴하고
//  @RestController : data를 리턴한다
@Controller
public class MvcController {
	@RequestMapping("/Mvc")
	public String mvc(Model model) {
		model.addAttribute("username", "옐미");
		return "mvc";	// src/main/resources/templates  mvc.mustache
	}
	
	@RequestMapping("/Ajax1")
	public String ajax1(Model model) {
		String username = "옐미";		
		return username;	// 옐미.mustache  404 : No static resource 옐미  
	}
	
	@RequestMapping("/Ajax2")
	@ResponseBody
	public String ajax2() {
		String username = "<h2>옐미</h2>"; 
		return username;	// http://localhost:8080/ajax2 페이지에 옐미출력   
	}

}





