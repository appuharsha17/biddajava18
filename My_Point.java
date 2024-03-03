package labtest;

	public class My_Point {
		public static void main(String[] args) {
		MyPoint p1 = new MyPoint();
		MyPoint p2 = new MyPoint(3, 4);
		System.out.println("point1: " + p1.toString());
		System.out.println("point2: " + p2.toString());
		p1.setXY(1, 2);
		System.out.println("point1 after setXY: " + p1.toString());
		int[] coordinates = p2.getXY();
		System.out.println("Coordinates of point2: (" + coordinates[0] + ", " + coordinates[1] + ")");
		System.out.println("Distance from point1 to (5, 6): " + p1.distance(5, 6));
		System.out.println("Distance from point2 to point1: " + p2.distance(p1));
		System.out.println("Distance from point1 to origin: " + p1.distance());
		}
		}
	
		class MyPoint {
			private int x;
			private int y;
			public MyPoint() {
				this(0, 0);
			}
			public MyPoint(int x, int y) {
				this.x = x;
				this.y = y;
			}
			public void setXY(int x, int y) {
				this.x = x;
				this.y = y;
			}
			public int[] getXY() {
				return new int[] { x, y };
			}
			@Override
			public String toString() {
				return "(" + x + ", " + y + ")";
			}
			public double distance(int x, int y) {
				int xDiff = this.x - x;
				int yDiff = this.y - y;
				return Math.sqrt(xDiff * xDiff + yDiff * yDiff);
			}
			public double distance(MyPoint another) {
				return distance(another.x, another.y);
			}
			public double distance() {
				return distance(0, 0);
		}
}



