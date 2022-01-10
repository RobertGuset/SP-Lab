
public class BookStatistics implements Visitor{
	
	private int books = 0;
	private int sections = 0;
	private int table_of_contents = 0;
	private int paragraphs = 0;
	private int image_proxy = 0;
	private int images = 0;
	private int tables = 0;
	
	@Override
	public void visitBook(Book book) {
		books++;
		for (Element el : book.getContent()) {
			Visitee viz = (Visitee) el;
			viz.accept(this);
		}
		
	}

	@Override
	public void visitSection(Section section) {
		sections++;
		for (Element el : section.getSubElements()) {
			Visitee viz = (Visitee) el;
			viz.accept(this);
		}
		
	}

	@Override
	public void visitTableOfContents(TableOfContents tableOfContents) {
		table_of_contents++;
		
	}

	@Override
	public void visitParagraph(Paragraph paragraph) {
		paragraphs++;
		
	}

	@Override
	public void visitImageProxy(ImageProxy imageProxy) {
		image_proxy++;
		
	}

	@Override
	public void visitImage(Image image) {
		images++;
		
	}

	@Override
	public void visitTable(Table table) {
		tables++;
		
	}
	
	public void printStatistics() {
		
		System.out.println("Number of books:" + books);
		System.out.println("Number of sections:" + sections);
		System.out.println("Number of tables of contents:" + table_of_contents);
		System.out.println("Number of paragraphs:" + paragraphs);
		System.out.println("Number of images proxy:" + image_proxy);
		System.out.println("Number of images:" + images);
		System.out.println("Number of tables:" + tables);
	}

}
