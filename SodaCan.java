
public class SodaCan {
	private int height;
	private int radius;
	
	public void setHeight(int inputHeight) {
		height = inputHeight;
	}
	
	public void setRadius(int inputRadius) {
		radius = inputRadius;
	}
	
	public double getSurfaceArea() {
		return (2 * Math.PI * radius * height) + (2 * Math.PI * Math.pow(radius, 2));		
	}
	
	public double getVolume() {
		return Math.PI * Math.pow(radius, 2) * height; 
	}
	
}