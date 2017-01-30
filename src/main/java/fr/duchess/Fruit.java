package fr.duchess;

public enum Fruit {
	POMMES(100),
	CERISES(75),
	BANANES(150);
	
	private int price;
	
	Fruit(int price) {
		this.price=price;
	}
	
	public int getPrice() {
		return price;
	}
	
	public static Fruit getByName(String name){
		for(Fruit fruit :Fruit.values()){
			if(fruit.name().equalsIgnoreCase(name)) return fruit;
		}
		return null;
	}
	
	
}
