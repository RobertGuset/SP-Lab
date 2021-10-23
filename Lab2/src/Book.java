import java.util.ArrayList;
import java.util.List;



public class Book {
	
	private String title;
	private TableOfContents tableOfContents;
	private List<Author> authorsList = new ArrayList<>();
	private List<Chapter> chapterList = new ArrayList<>();
	
	Book(String title){
		this.title = title;
	}
	
	public void addAuthor(Author author) {
		authorsList.add(author);
	}
	
	public int createChapter(String title) {
		Chapter chapter = new Chapter(title);
		chapterList.add(chapter);
		return chapterList.indexOf(chapter);
	}
	
	public Chapter getChapter(int index) {
		return chapterList.get(index);
	}
	public String toString() {
		return title;
	}
	
	
	
}
