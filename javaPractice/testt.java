
public class testt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employe emp=new employe("john",25,"555-9854","123 main st",500000,"marketing");
		manager mgr=new manager("jane",35,"555-98474","123 main st",100000,"sales");
		emp.printsalary();
		mgr.printsalary();
		System.out.println(emp);
		System.out.println(mgr);
		System.out.println("Employee Details:");
		System.out.println("Name: " + emp.name);
		System.out.println("Age: " + emp.age);
		System.out.println("Phone Number: " + emp.phoneno);
		System.out.println("Address: " + emp.address);
		System.out.println("Salary: " + emp.salary);
		System.out.println("Specialization: " + emp.speciallization);
		emp.printsalary();

		System.out.println("\nManager Details:");
		System.out.println("Name: " + mgr.name);
		System.out.println("Age: " + mgr.age);
		System.out.println("Phone Number: " + mgr.phoneno);
		System.out.println("Address: " + mgr.address);
		System.out.println("Salary: " + mgr.salary);
		System.out.println("Department: " + mgr.department);
		mgr.printsalary();

	}

}
