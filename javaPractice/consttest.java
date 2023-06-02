
public class consttest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		constructor c1=new constructor();
		c1.name="Palak";
		c1.age=20;
		c1.gender="Female";
		constructor c2=new constructor(c1);
		c2.printinfo();

	}

}
