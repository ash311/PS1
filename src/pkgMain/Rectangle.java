package pkgMain;

public class Rectangle {

	private double Length;
	private double Width;
	public Rectangle(double length, double width) {
		Length = length;
		Width = width;
		length = 4.6;
		width = 8.7;
	}
	public double getLength() {
		return Length;
	}
	public double getWidth() {
		return Width;
	}
	
	public double Area()
	{
		area = Length*Width;
		// TODO Implement Area() function with the correct formula
		System.out.println("The area for the rectangle of length "+length+" and width "+width+" is "+area);
	}	
}
