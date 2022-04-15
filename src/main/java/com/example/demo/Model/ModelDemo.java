package com.example.demo.Model;

public class ModelDemo 
{

	private int boook_id;
	private String book_name;
	private String book_author;
	@Override
	public String toString() {
		return "ModelDemo [boook_id=" + boook_id + ", book_name=" + book_name + ", book_author=" + book_author + "]";
	}
	public int getBoook_id() {
		return boook_id;
	}
	public void setBoook_id(int boook_id) {
		this.boook_id = boook_id;
	}
	public String getBook_name() {
		return book_name;
	}
	public void setBook_name(String book_name) {
		this.book_name = book_name;
	}
	public String getBook_author() {
		return book_author;
	}
	public void setBook_author(String book_author) {
		this.book_author = book_author;
	}
	
	
}
