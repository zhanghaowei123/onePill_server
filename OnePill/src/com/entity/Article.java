package com.entity;

public class Article {
	private int id;
	private String title;
	private String content;
	private String tag;
	private User user_id;
	private User comment_id;
	
	
	public Article(int id, String title, String content, String tag, User user_id, User comment_id) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.tag = tag;
		this.user_id = user_id;
		this.comment_id = comment_id;
	}
	public int getId() {
		
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public User getUser_id() {
		return user_id;
	}
	public void setUser_id(User user_id) {
		this.user_id = user_id;
	}
	public User getComment_id() {
		return comment_id;
	}
	public void setComment_id(User comment_id) {
		this.comment_id = comment_id;
	}
	

}
