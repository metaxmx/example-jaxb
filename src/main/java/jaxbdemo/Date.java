package jaxbdemo;

public class Date {

	// Diese Klasse nutzt öffentliche Attribute
	
	public int year;
	public int month;
	public int day;
	
	/**
	 * Leerer Konstruktor (für JAXB)
	 */
	public Date() {	}
	
	/**
	 * Daten-Konstruktor
	 */
	public Date(int day, int month, int year) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
}
