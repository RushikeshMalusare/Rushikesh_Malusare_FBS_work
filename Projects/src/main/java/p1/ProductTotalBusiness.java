package p1;

public class ProductTotalBusiness {
	public int totalCardVal(String[] products) {
		int total=0;
		DatabaseConnectivity connectivity=new DatabaseConnectivity();
		for (String productName : products) {
            int price = connectivity.getPrice(productName);   // fetch price from DB
            total += price;
        }
	
		//return connectivity.getTotalAmount(products);
		return total;	
	}
}
