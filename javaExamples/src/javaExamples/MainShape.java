package javaExamples;

public class MainShape {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Circle circle = new Circle();
			circle.ComputeArea(2.0f);
			System.out.println("Area of circle")
			circle.showArea();
			
			Square square= new Square();
			System.out.println("Area of Square")
			square.ComputeArea(6.0f);
			square.showArea();
	}

}
