import java.util.ArrayList;
import java.util.List;



public class Book {
	
	private String title;
	private List<Author> authorsList = new ArrayList<>();
	private List<Element> sectionsList = new ArrayList<>();
	
	Book(String title){
		this.title = title;
	}
	
	public void addAuthor(Author a) {
		this.authorsList.add(a);
	}
	
	public void addContent(Element e) {
		this.sectionsList.add(e);
	}
	
	public void print() {
		System.out.println(title);
		this.authorsList.forEach(a ->{
			a.print();
		});
		
		this.sectionsList.forEach(s->{
			s.print();
		});
	}
	
	
}
