package com.eva.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.eva.pojo.MessageCustom;
@Controller
public class JsonTestController {
	//输入JSON,返回JSON
	@RequestMapping("requestJson")
	public @ResponseBody MessageCustom requestJson(@RequestBody MessageCustom messageCustom){
		System.out.println("requestJson---->"+messageCustom);
		return messageCustom;
	}
	//输入key/value,返回JSON
	@RequestMapping("responseJson")
	public @ResponseBody MessageCustom responseJson(MessageCustom messageCustom){
		System.out.println("responseJson---->"+messageCustom);
		return messageCustom;
	}
}
