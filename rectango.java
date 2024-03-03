package labtest;

interface Resizable {
	void resizeHeight(int height);
	void resizeWidth(int width);
}
class Rectangle implements Resizable {
	int height, width;
	public Rectangle(int h, int w) {
		height = h;
		width = w;
	}
	@Override
	public void resizeHeight(int h) {
		height = h;
	}
	@Override
	public void resizeWidth(int w) {
		width = w;
	}
}
public class rectango {

	public static void main(String[] args) {
		Rectangle ob = new Rectangle(10, 20);
		System.out.println("Initial height is: " + ob.height + " and width is: " + ob.width);
		ob.resizeHeight(30);
		ob.resizeWidth(40);
		System.out.println("After resized heightis: " + ob.height + " and width is: " + ob.width);
	}
}
