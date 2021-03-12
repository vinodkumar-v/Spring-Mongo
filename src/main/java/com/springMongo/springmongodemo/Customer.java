package com.springMongo.springmongodemo;

public class Customer {

	private final long id;
	private final String content;

	public Customer(long id, String content) {
		this.id = id;
		this.content = content;
	}

	public long getId() {
		return id;
	}

	public String getContent() {
		return content;
	}
}