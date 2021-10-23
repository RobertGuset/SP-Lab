import java.util.ArrayList;
import java.util.List;

public class Chapter {
	
	private String name;
	private List<SubChapter> subChaptersList = new ArrayList<>();
	
	public Chapter(String name) {
		this.name = name;
	}
	
	public String toString() {
		return "Chapter: " + name + " Subchapter: " + subChaptersList;
	}
	
	public int createSubChapter(String title) {
		SubChapter sch = new SubChapter(title);
		subChaptersList.add(sch);
		return subChaptersList.indexOf(sch);
	}
	
	public SubChapter getSubChapter(int index) {
		return subChaptersList.get(index);
	}
	
}
