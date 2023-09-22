//4-6
public class CircleArray {

	int radius;
	
	public CircleArray(int radius) {
		this.radius = radius;
	}
	public double getArea() {
		return radius*radius*3.14;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CircleArray [] c;
		c = new CircleArray[5];
		
		for(int i =0; i<c.length; i++) {
			c[i] = new CircleArray(i);
		}
		
		for(int i = 0; i<c.length; i++) {
			System.out.println((int)(c[i].getArea())+"");
		}
	}
}
