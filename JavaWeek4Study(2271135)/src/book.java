//4-4, 4-5
public class book {
	
	String title;
	String author;
	
	public book() {	// 첫번째 생성자(매개변수가 하나도 없는 생성자)
		this("","");
		System.out.println("생성자 호출됨");
	}
	
	public book(String title) {	//두번째 생성자(매개변수를 하나 받는 생성자)
		this(title,"작자미상");
	}
	
	public book(String title, String author) {	//세번째 생성자
		this.title = title; this.author = author;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		book littlePrince = new book("어린완자","생택쥐");	//세번째 생성자 사용
		book loveStory = new book("춘향전");	//두번째 생성자 사용
		book idk = new book();	// 첫번째 생성자 사용
		
		System.out.println(littlePrince.title+" "+littlePrince.author);
		System.out.println(loveStory.title+" "+loveStory.author);
		System.out.println(idk.title+" "+idk.author);
	}
}

//계발자가 생성자를 만들지 않으면 자동으로 기본생성자(매개변수를 받지 않는)를 자동으로 만듬
//그러나 계발자가 생성자를 하나라도 만들면 기본 생성자는 자동으로 안 만듬

/*
  
 * this.radius = int radius(클래스에서 선언된)
 * this가 붙은게 클래스의 것
 
  */
