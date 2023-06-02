
public class constructor {
	String name;
	int age;
	String gender;
	public void printinfo() {
		System.out.println(this.name);
		System.out.println(this.age);
	}
	constructor(constructor s2){
		this.name=s2.name;
		this.age=s2.age;
		this.gender=s2.gender;
	}
	constructor(){
		
	}
}
