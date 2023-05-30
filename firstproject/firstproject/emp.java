package firstproject;

public class emp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		employee e1=new employee("Alex",1997,"64-C wall street");		
		employee e2=new employee("Lucy",1994,"65-D wall street");
		employee e3=new employee("Sam",1997,"70-E wall street");
		System.out.println("Name\tYear of joining\tAddress");
		System.out.println(e1.getName()+"\t"+e1.getYear()+"\t"+e1.getAddress());
		System.out.println(e2.getName()+"\t"+e2.getYear()+"\t"+e2.getAddress());
		System.out.println(e3.getName()+"\t"+e3.getYear()+"\t"+e3.getAddress());
	}

}
