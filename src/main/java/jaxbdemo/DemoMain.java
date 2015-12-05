package jaxbdemo;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class DemoMain {
	
	/**
	 * Main Methode.
	 */
	public static void main(String[] args) {
		
		try {
		
			// Marshal
			
			JAXBContext context = JAXBContext.newInstance(Library.class);
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
			
			Library demoLib = makeDemoLibrary();
			
			marshaller.marshal(demoLib, new File("demoLib.xml"));
			
			// Unmarshal
			
			// Der context ist der selbe wie beim marshalling ...
			Unmarshaller unmarshaller = context.createUnmarshaller();
			
			Object obj = unmarshaller.unmarshal(new File("demoLib.xml"));
			if (obj instanceof Library) {
				Library anotherLib = (Library) obj;
				System.out.println("Library erfolgreich wiederhergestellt: " + anotherLib);
			} else {
				System.out.println("Unmarshalling nicht erfolgreich...");
			}
		
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		
	}
	
	/**
	 * Erstelle Demo Daten
	 */
	public static Library makeDemoLibrary() {
		Library library = new Library();
		
		Author johnSmith = new Author("John", "Smith", new Date(27, 4, 1965));
		Author joeMiller = new Author("Joe F.", "Miller", new Date(16, 1, 1943));
		Author jimMeyers = new Author("Jim", "Meyers", new Date(20, 11, 1973));
		Author hubertCameron = new Author("Hubert", "Cameron", null);
		
		Book book1 = new Book("The Art of Programming", "Springer Verlag",
				"Es war einmal ...", johnSmith, null, new Date(11, 10, 2003));
		
		Book book2 = new Book("Buch der Sinnlosigkeit", "Ravensburger", null,
				joeMiller, johnSmith, new Date(3, 5, 1999));
		
		Book book3 = new Book("Termodynamik von kristallinem Wasser",
				"Springer Verlag", "Eine toole Einleitung ...",
				jimMeyers, null, new Date(6, 12, 2005));
		
		Journal journal1 = new Journal("Spektrum der Wissenschaft",
				"Spektrum Verlag", new Date(1, 6, 2010));
		
		Journal journal2 = new Journal("Spektrum der Wissenschaft",
				"Spektrum Verlag", new Date(1, 8, 2010));
	
		Journal journal3 = new Journal("Der Spiegel", "Spiegel Verlag",
				new Date(15, 3, 2005));
		
		library.addBook(book1);
		library.addBook(book2);
		library.addBook(book3);
		
		library.addJournal(journal1);
		library.addJournal(journal2);
		library.addJournal(journal3);
		
		library.addFeatured(johnSmith);
		library.addFeatured(hubertCameron);
		
		return library;
	}

}
