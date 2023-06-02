
public class staticmet {//static method
	int rollno;
	String name;
	static String college="LJ";
	
	
	static void change() {
		college="LJ Institue";
		
	}
	staticmet(int r,String n){
		rollno=r;
		name=n;
	}
	void display() {
		System.out.println(rollno+""+name+""+college);
	}
}
