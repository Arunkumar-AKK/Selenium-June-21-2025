package week1.day2;

public class Library {

	public String addBook(String bookTitle) {
		// TODO Auto-generated method stub
		System.out.println("Book added successfully" + " \n");
		return bookTitle;

	}

	public void issueBook() {
		// TODO Auto-generated method stub
		System.out.println("Book issued successfully" + " \n");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library objA = new Library();
		System.out.println(objA.addBook("Selenium Practice Book"+ " \n"));
		objA.issueBook();

	}

}
