
public class Paragraph implements Element{

	private String text;

	public Paragraph(String text) {
		super();
		this.text = text;
	}
	
	public void print() {
		System.out.println(text);
	}
}
