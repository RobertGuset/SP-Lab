import java.util.ArrayList;
import java.util.List;

public class Section implements Element{
	
	private String title;
	private List<Element> elementslist = new ArrayList<>();
	Element clone;
	
	public Section(String title) {
		this.title = title;
	}
	
	public void print() {
		System.out.println(title);
		this.elementslist.forEach(e ->{
			e.print();
		});	
	}
	
	public void add(Element e) {
		try {
			this.clone = (Element) this.clone();
		}catch (CloneNotSupportedException e1) {
			e1.printStackTrace();
		}
		this.elementslist.add(e);
	}
	
	public Element get(int p) {
		return this.elementslist.get(p);
	}
	
	public void remove(Element e) {
		
		this.elementslist.remove(e);
	}
	
	@Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
