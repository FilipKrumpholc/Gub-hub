
public class Paper {
	
	int height;
	int width;
	public int getHeight() {
		return height;
	}
	
	
	public static Paper factoryA4() {
	return new Paper (297,210);
	
	
	
	
	
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public Paper(int height, int width) {
		super();
		this.height = height;
		this.width = width;
	
	
	}
	@Override
	public String toString() {
		return "Paper [height=" + height + ", width=" + width + "]";
	}
	
}
