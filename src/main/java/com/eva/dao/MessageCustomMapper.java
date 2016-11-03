package com.eva.dao;

import java.util.List;

import com.eva.pojo.MessageCustom;
import com.eva.pojo.MessageQueryVo;
//重新写mapper方法
public interface MessageCustomMapper {
		List<MessageCustom> findMessageList(MessageQueryVo messageQueryVo) throws Exception;
}
