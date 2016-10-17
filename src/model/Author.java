package model;

public class Author {
	public String Country;
	public String Age;
	public String Name;
	public int AuthorID;
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		this.Country = country;
	}
	public String getAge() {
		return Age;
	}
	public void setAge(String age) {
		this.Age = age;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		this.Name = name;
	}
	public int getAuthorID() {
		return AuthorID;
	}
	public void setAuthorID(int authorID) {
		this.AuthorID = authorID;
	}
}
