package labtest;

public class Employees {
		
	    int id;
	    String name;
	    double salary;

	    Employees(int id, String name, double salary) {
	        this.id = id;
	        this.name = name;
	        this.salary = salary;
	    }

	    void raiseSalary(double percent) {
	        double increaseAmount = salary * (percent / 100);
	        salary= salary+increaseAmount;
	    }

	    void displayDetails() {
	        System.out.println("Employee ID: " + id);
	        System.out.println("Employee Name: " + name);
	        System.out.println("Employee Salary: " + salary);
	    }

	    public static void main(String[] args) {
	        Employees ob = new Employees(1, "virat", 50000);
	        ob.displayDetails();
	        ob.raiseSalary(10);
	        System.out.println("After salary raise:");
	        ob.displayDetails();
	    }

}


