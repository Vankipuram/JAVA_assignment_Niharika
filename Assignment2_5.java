abstract class Shape{
	public abstract void draw(); 
}

  class Line extends Shape{
	 public void draw(){
		 System.out.println("Line------------");
	 }
}
 class Rectangle extends Shape{
	public void draw() {
		System.out.println("Rectangle");
	}
}
 class Cube extends Shape{
	public void draw() {
		System.out.println("Cube");
	}
}
public class Assignment2_5 {
	public static void main(String[] args) {
		Line m1 = new Line();
		m1.draw();
		Rectangle m2 = new Rectangle();
		m2.draw();
		Cube m3 = new Cube();
		m3.draw();
	
	
	}
}
