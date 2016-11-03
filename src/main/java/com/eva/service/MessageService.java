package com.eva.service;

import java.util.List;

import com.eva.pojo.Message;
import com.eva.pojo.MessageCustom;
import com.eva.pojo.MessageQueryVo;

public interface MessageService {
	//查询message列表，根据name like %%
	List<MessageCustom> findMessageList(MessageQueryVo messageQueryVo) throws Exception;
	//根据id查询
	 Message selectByPrimaryKey(Integer id);
}
