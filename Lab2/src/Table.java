
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
	
}
