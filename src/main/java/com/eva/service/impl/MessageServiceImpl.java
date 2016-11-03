package com.eva.service.impl;

import java.util.List;

import javax.annotation.*;

import org.springframework.stereotype.Service;

import com.eva.dao.MessageMapper;
import com.eva.dao.MessageCustomMapper;
import com.eva.pojo.Message;
import com.eva.pojo.MessageCustom;
import com.eva.pojo.MessageQueryVo;
import com.eva.service.MessageService;
@Service("messageService")
public class MessageServiceImpl implements MessageService{
	@Resource
	private MessageCustomMapper messageMapperCustom;
	@Resource
	private MessageMapper messageMapper;
	
	public List<MessageCustom> findMessageList(MessageQueryVo messageQueryVo) throws Exception {
		//通过messageMapperCustom查询数据库
		return messageMapperCustom.findMessageList(messageQueryVo);
	}

	public Message selectByPrimaryKey(Integer id) {
		return messageMapper.selectByPrimaryKey(id);
	}
}
