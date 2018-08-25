/**
 * 
 */
package com.niranjan.rxp.messenger.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Message {
	private long messageId;
	private String message;
	private Date createdDate;
	private String author;
	
	public Message() {
		super();
	}
	public Message(long messageId, String message, String author) {
		super();
		this.messageId = messageId;
		this.message = message;
		this.createdDate = new Date();
		this.author = author;
	}
	public long getMessageId() {
		return messageId;
	}
	public void setMessageId(long messageId) {
		this.messageId = messageId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Message [messageId=" + messageId + ", message=" + message + ", createdDate=" + createdDate + ", author="
				+ author + "]";
	}
}