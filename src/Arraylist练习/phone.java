package Arraylist练习;
public class phone {
	private String brand;
	private int price;

	public phone(){
	}
	
	public phone(String  brand,int  price) {
		this.brand = brand;
		this.price = price;
	}
	
	public String getBrand() {
		return  brand;
	}
	
	public int getPrice() {
		return  price;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public void setPrice(int price) {
		this.price = price;
	}
}
