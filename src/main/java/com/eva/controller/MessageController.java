package com.eva.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.eva.pojo.Message;
import com.eva.pojo.MessageCustom;
import com.eva.pojo.MessageQueryVo;
import com.eva.service.MessageService;

@Controller
@RequestMapping("/message")
public class MessageController {
	@Resource
	MessageService messageService;
	
	//信息查询
	@RequestMapping("queryMessage")
     public String findMessageList(Model model,MessageQueryVo messageQueryVo) throws Exception{	
		System.out.println("----->");	
		List<MessageCustom> messageList=messageService.findMessageList(messageQueryVo);
		model.addAttribute("messageList", messageList);  
        return "showStudentMessage"; 
     }
	
	@RequestMapping("querySingle")	
	public String selectByPrimaryKey(Integer id,Model model){
		Message message=messageService.selectByPrimaryKey(id);
		System.out.println(message);
		model.addAttribute("message", message);
		return "showById";
	}

}
