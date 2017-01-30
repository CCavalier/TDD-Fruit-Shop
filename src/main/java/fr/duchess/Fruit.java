package fr.duchess;

public enum Fruit {
	POMMES(100),
	CERISES(175);
	
	private int price;
	
	Fruit(int price) {
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}
}
