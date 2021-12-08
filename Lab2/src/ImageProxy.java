import java.awt.Dimension;

public class ImageProxy implements Element{
	
	String url;
	Dimension dim;
	Image realImage;
	
	public ImageProxy(String url) {
		this.url = url;
		this.realImage = null;
		
	}
	
	public void loadImage() {
		if(realImage == null) {
			realImage = new Image(url);
		}
	}
	
	public void add(Element e){
		
	}
	public Element get(int p) {
		return null;
	}
	
	public void remove(Element e) {
		
	}


	@Override
	public void print() {
		loadImage();
		realImage.print();
		
	}
	
}
