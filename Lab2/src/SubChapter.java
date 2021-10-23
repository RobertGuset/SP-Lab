import java.util.ArrayList;
import java.util.List;

public class SubChapter {
	
	private String name;
	//private List<Image> imagesList = new ArrayList<>();
	//private List<Paragraph> paragraphsList = new ArrayList<>();
	//private List<Table> tablesList = new ArrayList<>();
	
	private List<Element> elementsList = new ArrayList<>();
	
	public SubChapter(String name) {
		this.name = name;
	}
	
	public void print() {
		System.out.println("Subchapter:"  + name);
		
		for(Element e: this.elementsList) {
			e.print();
		}
			
	}; 
	
	/*public void createNewImage(String name) {
		Image img = new Image(name);
		imagesList.add(img);
	}
	
	public void createNewParagraph(String name) {
		Paragraph pgr = new Paragraph(name);
		paragraphsList.add(pgr);
	}
	
	public void createNewTable(String name) {
		Table table = new Table(name);
		tablesList.add(table);
	}*/
	
	public void addElement(Element e) {
		elementsList.add(e);
	}
}
