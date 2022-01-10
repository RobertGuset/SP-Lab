import java.util.ArrayList;
import java.util.List;



public class Book extends Section{
	
	private String title;
	private List<Author> authorsList = new ArrayList<>();
	private List<Element> sectionsList = new ArrayList<>();
	private ArrayList<Element> content = new ArrayList<>();
	
	Book(String title){
		super(title);
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

	public ArrayList<Element> getContent() {
		return content;
	}

	public String getTitle() {
		return title;
	}

	public  List<Author> getAuthors() {
		return authorsList;
	}
	
}
