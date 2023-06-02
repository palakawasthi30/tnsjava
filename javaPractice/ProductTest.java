class Product{
	String name;
	double price;
	int quantity;
	static int totalsold;
	void sell(int quantity) {
		this.quantity=quantity;
		totalsold+=quantity;
	}
	static int gettotalsold() {
		return totalsold;
	}
}

public class ProductTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product p1=new Product();
		Product p2=new Product();
		Product p3=new Product();
		p1.name="Product 1";
		p1.price=9.99;
		p1.quantity=10;
		
		p2.name="Product 2";
		p2.price=19.99;
		p2.quantity=20;
		
		p3.name="Product 3";
		p3.price=29.99;
		p3.quantity=30;
		
		p1.sell(2);
		p2.sell(5);
		p3.sell(15);
		
		System.out.println("Total products sold:"+Product.gettotalsold());
		
	}

}
