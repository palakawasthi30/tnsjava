
public class staticvar {//static variable
	int rollno;
	String name;
	static String college="LJ";
	staticvar(int r,String n){
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println(rollno+""+name+""+college);
	}
}
