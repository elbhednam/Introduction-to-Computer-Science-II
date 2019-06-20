public class Rectangle {
	private double width;
	private double height;
	
	public Rectangle() throws InvalidSpecificationException{
		
	}
	public Rectangle(double newWidth, double newHeight) throws InvalidSpecificationException{
		setWidth(newWidth);
		setHeight(newHeight);
	}
	
	public double getWidth() {
		return width;
	}
	
	public void setWidth(double width) throws InvalidSpecificationException {
		if (width >= 0) {
			this.width = width;
		}
		else
			throw new InvalidSpecificationException(width);
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double height) throws InvalidSpecificationException {
		if (height >= 0) {
			this.height = height;
		}
		else
			throw new InvalidSpecificationException(height);
		
	}
	
	public double getArea() {
		double area = width * height;
		return area;
	}
	
	public double getPerimeter() {
		return 2 * (width + height);
	}
}
