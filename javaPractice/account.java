public class account {
	private String holdername;
	private int balance;
	public String getname() {
		return holdername;
	}
	public void setname(String name) {
		this.holdername= name;
	}
	public int getbalance() {
		return balance;
	}
	public void setbalance(int balance) {
		this.balance= balance;
	}
	public int withdrawl(int amt) {
		if(amt>balance)
		{
			System.out.println("insufficient amount");
			return -1;
		}
		balance-=amt;
		if(balance<1000) {
			balance+=amt;
			return balance;
		}
		return balance;
	}
	public int deposit(int amt) {
		balance+=amt;
		return balance;
	}
	public account() {
		this.holdername="palak";
		this.balance=2000;
	}
	public account(String holdername, int balance) {
		this.holdername=holdername;
		this.balance=balance;
	}
	
}
