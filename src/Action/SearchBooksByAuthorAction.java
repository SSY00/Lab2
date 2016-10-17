package Action;

import java.util.ArrayList;

import com.opensymphony.xwork2.ActionSupport;

import db.DownloadSQL;
import model.Book;

public class SearchBooksByAuthorAction extends ActionSupport {
	public String name;
	public ArrayList<Book> books;
	
	public ArrayList<Book> getBooks() {
		return books;
	}

	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
	public String execute(){
		
			DownloadSQL down = new DownloadSQL();
			int authorID = down.getAuthorByName(getName()).getAuthorID();
			setBooks(down.getBooksByAuthor(authorID));
			return SUCCESS;
		
	}
}
