public class acctest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//account[]arr=new account[10];
		account a1=new account();
		a1.setname("Palak");
		a1.setbalance(2500);
		System.out.println(a1.getname());
		System.out.println(a1.getbalance());
		a1.deposit(5000);
		System.out.println(a1.deposit(5000));
		a1.withdrawl(1500);
		System.out.println(a1.withdrawl(1500));
		
		
		/*arr[0]=new acctest("alex",35000);
		arr[1]=new acctest("sofia",5000);
		arr[2]=new acctest("james",7000);
		arr[3]=new acctest("braian",8500);
		System.out.println(arr[0].display);
		System.out.println(arr[1].display);
		System.out.println(arr[2].display);
		System.out.println(arr[3].display);*/
	}
	
}
