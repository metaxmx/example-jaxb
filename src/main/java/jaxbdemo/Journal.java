package jaxbdemo;

public class Journal {

	private String title;
	private String publisher;
	private Date published;
	
	/**
	 * Leerer Konstruktor (für JAXB)
	 */
	public Journal() {
		this.title = "";
		this.publisher = "";
		this.published = null;
	}
	
	/**
	 * Datenkonstruktor
	 */
	public Journal(String title, String publisher, Date published) {
		this.title = title;
		this.publisher = publisher;
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
	
	public void setPublished(Date published) {
		this.published = published;
	}
	
	public Date getPublished() {
		return published;
	}
	
}
