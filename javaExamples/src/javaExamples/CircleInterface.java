package javaExamples;

public class CircleInterface implements IShape {
     float radius, area;
     
	     @Override
	     public void computeArea() {
		 radius = 2.5f;
		 area = (float)(Math.PI*radius*radius);
	}

	@Override
	    public void showArea() {
		System.out.println("Area of circle = "+ area);
	}

}
