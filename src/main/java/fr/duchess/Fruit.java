package fr.duchess;

public enum Fruit {
	POMMES(100,0, 1), CERISES(75,20, 2), BANANES(150,150, 2), APPLES(100,100, 3), MELE(100,100, 2);

	private int price;

	private int discount;
	
	private int number;
	
	Fruit(int price, int discount, int number) {
		this.price = price;
		this.discount = discount;
		this.setNumber(number);
	}

	public int getPrice() {
		return price;
	}

	public static Fruit getByName(String name) {
		for (Fruit fruit : Fruit.values()) {
			if (fruit.name().equalsIgnoreCase(name.trim()))
				return fruit;
		}
		return null;
	}

	public int getDiscount() {
		return discount;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

}
