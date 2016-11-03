package com.eva.pojo;
import java.util.List;
//Meaage的封装类，用于对Message的进一步封装

public class MessageQueryVo {
	private Message message;
	private MessageCustom messageCustom;
	private List<MessageCustom> messageList;
	
	public Message getMessage() {
		return message;
	}
	public void setMessage(Message message) {
		this.message = message;
	}
	public MessageCustom getMessageCustom() {
		return messageCustom;
	}
	public void setMessageCustom(MessageCustom messageCustom) {
		this.messageCustom = messageCustom;
	}
	public List<MessageCustom> getMessageList() {
		return messageList;
	}
	public void setMessageList(List<MessageCustom> messageList) {
		this.messageList = messageList;
	}  
}
