//4-7
import java.util.Scanner;

public class bookArray {
	String title, author;
	
	public bookArray(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		bookArray [] library = new bookArray[2];
		
		Scanner scanner = new Scanner(System.in);
		
		for(int i = 0; i < library.length; i++) {
			System.out.print("제목>> ");
			String title = scanner.nextLine();
			System.out.print("저자>> ");
			String author = scanner.nextLine();
			library[i] = new bookArray(title, author);
		}
		
		for(int i = 0; i<library.length; i++) {
			System.out.print("("+ library[i].title+ ","+ library[i].author + ")");
		}
		
		scanner.close();
	}

}
