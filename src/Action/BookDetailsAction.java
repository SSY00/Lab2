package Action;

import com.opensymphony.xwork2.ActionSupport;

import db.DownloadSQL;
import model.Author;
import model.Book;

public class BookDetailsAction extends ActionSupport{
	public String ISBN;
	public Author author;
	public Book books;
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public Author getAuthor() {
		return author;
	}
	public void setAuthor(Author author) {
		this.author = author;
	}
	public Book getBooks() {
		return books;
	}
	public void setBooks(Book books) {
		this.books = books;
	}
	
	
	public String execute(){
		try {
			DownloadSQL down = new DownloadSQL();
			setBooks(down.getBookByISBN(getISBN()));
			setAuthor(down.getAuthorByID(books.getAuthorID()));
			return SUCCESS;
		} catch (Exception e) {
			return ERROR;
		}
	}
	
}
