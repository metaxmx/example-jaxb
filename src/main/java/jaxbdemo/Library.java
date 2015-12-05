package jaxbdemo;

import java.util.LinkedList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Library {
	
	private List<Book> books;
	
	private List<Journal> journals;
	
	private List<Author> featured;
	
	/**
	 * Leerer Konstruktor (für JAXB)
	 */
	public Library() {
		this.books = new LinkedList<Book>();
		this.journals = new LinkedList<Journal>();
		this.featured = new LinkedList<Author>();
	}
	
	/* 
	 * Setter und Getter 
	 */

	@XmlElementWrapper (name = "books")
	@XmlElement (name = "book")
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	
	public List<Book> getBooks() {
		return books;
	}
	
	@XmlElementWrapper (name = "journals")
	@XmlElement (name = "journal")
	public void setJournals(List<Journal> journals) {
		this.journals = journals;
	}
	
	public List<Journal> getJournals() {
		return journals;
	}
	
	@XmlElementWrapper (name = "featuredAuthors")
	@XmlElement (name = "author")
	public void setFeatured(List<Author> featured) {
		this.featured = featured;
	}
	
	public List<Author> getFeatured() {
		return featured;
	}
	
	// --- Hilfsmethoden ---
	
	public void addBook(Book book) {
		this.books.add(book);
	}
	
	public void addJournal(Journal journal) {
		this.journals.add(journal);
	}
	
	public void addFeatured(Author featured) {
		this.featured.add(featured);
	}
	
}
