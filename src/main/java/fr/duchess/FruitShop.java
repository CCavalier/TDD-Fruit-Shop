package fr.duchess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FruitShop {

	int total = 0;
	
	public FruitShop() {
		
	}
	
    public static void main (String args[]){
    	FruitShop fruitShop = new FruitShop();
        BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (true){
                final String myFruit = entree.readLine();
                fruitShop.add(Fruit.getByName(myFruit));
            }
        } catch (IOException e) {
            System.out.println("An error occurred: "+e.getMessage());
        }

    }

	public void add(Fruit fruit) {
		total+=fruit.getPrice();
		
	}

	public int getTotal() {
		return total;
	}

}
