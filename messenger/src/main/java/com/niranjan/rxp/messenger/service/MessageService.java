/**
 * 
 */
package com.niranjan.rxp.messenger.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.niranjan.rxp.messenger.database.DatabaseManager;
import com.niranjan.rxp.messenger.model.Message;

public class MessageService {
	private static Map<Long, Message> messages = DatabaseManager.getAllMessages();
	
	public List<Message> getAllMessages(){
		return new ArrayList<Message>(messages.values());
	}
	
	public Message getMessage(long id){
		return messages.get(id);
	}
	
	public Message addMessage(Message message){
		message.setMessageId(messages.size() + 1);
		messages.put(message.getMessageId(), message);
		return message;
	}
	
	public Message updateMessage(Message message){
		if(message.getMessageId() < 1)
			return null;
		messages.put(message.getMessageId(), message);
		return message;
	}
	
	public Message removeMessage(long id){
		return messages.remove(id);
	}
}