package Action;

import com.opensymphony.xwork2.ActionSupport;

import db.DownloadSQL;

public class DeleteBookAction extends ActionSupport{
	public String ISBN;

	@Override
	public String execute(){
		DownloadSQL down = new DownloadSQL();
		if(down.deleteBook(getISBN())){
			return SUCCESS;
		}else {
			return ERROR;
		}
	}
	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		this.ISBN = iSBN;
	}
	
}
