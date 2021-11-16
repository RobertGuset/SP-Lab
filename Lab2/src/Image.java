
public class Image implements Element{
	
	private String imageName;
	
	public Image(String imageName) {
		this.imageName = imageName;
	}
	
	public void print() {
		System.out.println(imageName);
	}
	
    public void add(Element e) {

    }
    public void remove(Element e) {

    }

	@Override
	public Element get(int p) {
		// TODO Auto-generated method stub
		return null;
	}

   
	
}
