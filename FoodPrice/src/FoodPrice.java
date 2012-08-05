
public class FoodPrice {
	private int menuPrice;
	private int quantity;
	
	public FoodPrice(int menuPrice){
		this(menuPrice,1);
		
	}
	
	public FoodPrice(int menuPrice, int quantity){
		this.menuPrice = menuPrice;
		this.quantity = quantity;
	}
	
	public int getTotalPrice(){
		return menuPrice * quantity;
	}
}
