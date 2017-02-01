package fr.duchess;

public enum Fruit {
	POMMES(100,0), CERISES(75,20), BANANES(150,150), APPLES(100,0), MELE(100,0);

	private int price;

	private int discount;
	
	Fruit(int price, int discount) {
		this.price = price;
		this.discount = discount;
	}

	public int getPrice() {
		return price;
	}

	public static Fruit getByName(String name) {
		for (Fruit fruit : Fruit.values()) {
			if (fruit.name().equalsIgnoreCase(name))
				return fruit;
		}
		return null;
	}

	public int getDiscount() {
		return discount;
	}

}
