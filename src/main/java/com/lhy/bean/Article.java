package com.lhy.bean;

public class Article {
	
	private Integer id;
	
	private String title;
	
	private String content;
	
	
	private String created;

	

	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
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



	public String getCreated() {
		return created;
	}



	public void setCreated(String created) {
		this.created = created;
	}

	

	public Article(Integer id, String title, String content, String created) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		this.created = created;
	}



	public Article() {
		// TODO Auto-generated constructor stub
	}

}
