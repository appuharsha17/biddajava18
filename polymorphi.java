package labtest;

class Shape {
	void draw() {
		System.out.println("Drawing");
	}
	void erase() {
		System.out.println("Erasing");
	}
}

class Circle extends Shape {
	void draw() {
		System.out.println("Drawing a circle");
	}
	void erase() {
		System.out.println("Erasing the circle");
	}
}

class Triangle extends Shape {
	void draw() {
		System.out.println("Drawing a Triangle");
	}
	void erase() {
		System.out.println("Erasing the Triangle");
	}
}

class Square extends Shape {
	void draw() {
		System.out.println("Drawing a Square");
	}
	void erase() {
		System.out.println("Erasing the Square");
	}
}

public class polymorphi {

	public static void main(String[] args) {
		Circle obj1 = new Circle();
		Triangle obj2 = new Triangle();
		Square obj3 = new Square();
		obj1.draw();
		obj1.erase();
		obj2.draw();
		obj2.erase();
		obj3.draw();
		obj3.erase();
	}
		
}

