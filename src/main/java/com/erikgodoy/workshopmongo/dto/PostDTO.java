package com.erikgodoy.workshopmongo.dto;

import java.util.Date;

import com.erikgodoy.workshopmongo.domain.Post;

public class PostDTO {

	private String id;
	private Date date;
	private String title;
	private String body;
	private AuthorDTO authorDTO;
	
	public PostDTO() {
	}
	
	public PostDTO(Post obj) {
		id = obj.getId();
		date = obj.getDate();
		title = obj.getTitle();
		body = obj.getBody();
		authorDTO = obj.getAuthor();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public AuthorDTO getAuthorDTO() {
		return authorDTO;
	}

	public void setAuthorDTO(AuthorDTO authorDTO) {
		this.authorDTO = authorDTO;
	}
	
	
}
