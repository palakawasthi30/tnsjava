public class aca_stu extends per_stu {
	String rollno,result;
	public String getRollno() {
		return rollno;
	}
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	public String getResult() {
		return result;
	}
	public void setResult(String result) {
		this.result = result;
	}
	@Override
	public String toString() {
		return("rollno"+getRollno()+"result"+getResult()+super.getName()+super.getaddress()+super.getemail());
	}
	
}
