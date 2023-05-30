package firstproject;

public class employee {
	private String name;
	private String address;
	private int year;
	public employee(String n,int y,String add) {
		name=n;
		year=y;
		address=add;
	}
	public String getName() {
		return name;
	}
	public int getYear() {
		return year;
	}
	public String getAddress() {
		return address;
	}
}
