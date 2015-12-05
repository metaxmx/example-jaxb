package jaxbdemo;

public class Author {

	// Diese Klasse verwendet Properties
	
	private String firstname;
	private String name;
	private Date birthday;
	
	/**
	 * Leerer Konstruktor (für JAXB)
	 */
	public Author() {
		this.firstname = "";
		this.name = "";
		this.birthday = null;
	}
	
	/**
	 * Daten-Konstruktor
	 */
	public Author(String firstname, String name, Date birthday) {
		this.firstname = firstname;
		this.name = name;
		this.birthday = birthday;
	}
	
	/* Setter und Getter */
	
	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}
	
	public Date getBirthday() {
		return birthday;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public String getFirstname() {
		return firstname;
	}
	
}
