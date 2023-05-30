package firstproject;

public class student_info {
		String name;
		int rollno;
		int mobile;
		
		public String getname() {
			return name;
		}
		public void setname(String name) {
			this.name=name;
		}
		public int getrollno() {
			return rollno;
		}
		public void setrollno(int rollno) {
			this.rollno=rollno;
		}
		public int getmobile() {
			return mobile;
		}
		public void setname(int mobile) {
			this.mobile=mobile;
		}
		@Override
		public String toString() {
			return("name" +getname()+"rollno"+getrollno());
		}
}
