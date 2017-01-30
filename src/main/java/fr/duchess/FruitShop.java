package fr.duchess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class FruitShop {
	private Map<Fruit, Integer> fruitMap;
	
	public FruitShop() {
		fruitMap = new HashMap<Fruit,Integer>();
	}
	
    public static void main (String args[]){
    	FruitShop fruitShop = new FruitShop();
        BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (true){
                final String myFruit = entree.readLine();
                fruitShop.add(Fruit.getByName(myFruit));
                System.out.println("> "+fruitShop.getTotal());
            }
        } catch (IOException e) {
            System.out.println("An error occurred: "+e.getMessage());
        }

    }

	public void add(Fruit fruit) {
		fruitMap.put(fruit, fruitMap.get(fruit)==null?1:fruitMap.get(fruit)+1);
	}

	public int getTotal() {
		int total = 0;
		for( Entry<Fruit, Integer> entry : fruitMap.entrySet()) {
			total += entry.getValue()*entry.getKey().getPrice();
			if(entry.getKey().name().equalsIgnoreCase("cerises")) {
				total -= entry.getValue() / 2 * 20;
			}
		}
		return total;
	}

}
