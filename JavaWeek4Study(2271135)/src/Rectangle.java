import java.util.Scanner;

public class Rectangle {
	int width;
	int height;
	
	public int getArea() {
		
		return width*height;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Rectangle paper = new Rectangle();
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ");
		
		paper.width = scanner.nextInt();
		paper.height = scanner.nextInt();
		
		System.out.println("사각형의 면적은 "+paper.getArea());
		
		scanner.close();
	}

}
