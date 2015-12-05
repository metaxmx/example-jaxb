package jaxbdemo;

import javax.xml.bind.annotation.XmlElement;

public class Book {
	
	private String title;
	private String publisher;
	private String abstractText;
	private Author author;
	private Author coauthor;
	private Date published;
	
	/**
	 * Leerer Konstruktor (für JAXB)
	 */
	public Book() {
		this.title = "";
		this.publisher = "";
		this.abstractText = null;
		this.author = null;
		this.coauthor = null;
		this.published = null;
	}

	/**
	 * Datenkonstruktor
	 */
	public Book(String title, String publisher, String abstractText,
			Author author, Author coauthor, Date published) {
		this.title = title;
		this.publisher = publisher;
		this.abstractText = abstractText;
		this.author = author;
		this.coauthor = coauthor;
		this.published = published;
	}
	
	/* Setter und Getter */
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	
	public String getPublisher() {
		return publisher;
	}
	
	@XmlElement (name = "abstract")
	public void setAbstractText(String abstractText) {
		this.abstractText = abstractText;
	}
	
	public String getAbstractText() {
		return abstractText;
	}
	
	public void setAuthor(Author author) {
		this.author = author;
	}
	
	public Author getAuthor() {
		return author;
	}
	
	public void setCoauthor(Author coauthor) {
		this.coauthor = coauthor;
	}
	
	public Author getCoauthor() {
		return coauthor;
	}
	
	public void setPublished(Date published) {
		this.published = published;
	}
	
	public Date getPublished() {
		return published;
	}

}
