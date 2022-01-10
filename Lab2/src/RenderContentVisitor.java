import java.util.List;

public class RenderContentVisitor implements Visitor{

	@Override
	public void visitBook(Book book) {
		System.out.println("Book: " + book.getTitle() + "\n");
		System.out.println("Author: ");
		List<Author> authors = book.getAuthors();
		List<Element> content = book.getContent();
		
		for (Author a : authors) {
			a.print();
		}
		System.out.println("\n");
		for(Element el : content) {
			if (el instanceof Visitee) {
				Visitee viz = (Visitee) el;
				viz.accept(this);
			}
		}
	}

	@Override
	public void visitSection(Section section) {
		System.out.println(Section.getName());
		List<Element> elements = Section.getSubElements();
		for (Element el : elements) {
			if (el instanceof Visitee) {
				Visitee viz = (Visitee) el;
				viz.accept(this);
			}
		}
		
	}

	@Override
	public void visitTableOfContents(TableOfContents tableOfContents) {
		System.out.println(tableOfContents.getName());
		
	}

	@Override
	public void visitParagraph(Paragraph paragraph) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitImageProxy(ImageProxy imageProxy) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitImage(Image image) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void visitTable(Table table) {
		// TODO Auto-generated method stub
		
	}
	
}
