//4-1, 4-3
public class Circle {
	
	int radius;
	String name;
	
	public Circle() {	//매개변수가 없는 생성자
		radius = 1; name = "";	//radius의 초기값은 1
	}
	
	public Circle(int r, String n) {	//매개변수가 있는 생성자
		radius = r; name = n;	//입력받은 값으로  지정됨
	}
	
	public double getArea() {
		return radius*radius*3.14;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//피자라는 이름을 가진 한개의 객체
		Circle pizza;
		pizza = new Circle(10,"치즈피자");
		double area = pizza.getArea();
		
		/*
		pizza.radius = 10;
		pizza.name = "치즈피자";
		
		*/
		
		System.out.println(pizza.name+"의 면적은 "+area);
		
		//도넛이라는 이름을 가진 또 다른 객체
		Circle donut;
		donut = new Circle();
		
		donut.name = "치즈도넛";
		
		area = donut.getArea();
		
		System.out.println(donut.name+"의 면적은 "+area);
	}

}
