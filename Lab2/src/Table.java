
public class Table implements Element{
	
	private String title;

	public Table(String title) {
		super();
		this.title = title;
	}

	@Override
	public void print() {
		System.out.println(title);
	}
	
	public void add(Element e) {
		
	}
	
	public Element get(int p) {
		return null;
	}
	
	public void remove(Element e) {
		
	}
	
}
