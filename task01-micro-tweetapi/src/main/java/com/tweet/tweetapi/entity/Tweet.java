package com.tweet.tweetapi.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Tweet {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String username;
	
	@Column
	private String description;
	@Column
	private LocalDate date;
	@Column
	private int likes;
	@Column
	private String reply;
	
	
	
	public Tweet() {
		super();
	}
	public Tweet(String username, String description, LocalDate date, int likes, String reply) {
		super();
		this.username = username;
		this.description = description;
		this.date = date;
		this.likes = likes;
		this.reply = reply;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	public String getReply() {
		return reply;
	}
	public void setReply(String reply) {
		this.reply = reply;
	}
	@Override
	public String toString() {
		return "Tweet [id=" + id + ", username=" + username + ", description=" + description + ", date=" + date
				+ ", likes=" + likes + ", reply=" + reply + "]";
	}
	
	
	
}
