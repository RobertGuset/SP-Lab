
public class Paragraph implements Element{

	private String text;

	public Paragraph(String text) {
		super();
		this.text = text;
	}
	
	public void setAlignStrategy(AlignStrategy as) {
	   as.render(this.text);
	    
	}
	
	public void print() {
		System.out.println(text);
	}
	
	public void add(Element e) {

    }
	
    public void remove(Element e) {

    }

    public Element get(int position) {
        return null;
    }
}
