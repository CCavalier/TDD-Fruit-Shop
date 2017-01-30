package fr.duchess;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FruitShop {

	
	public FruitShop() {
		
	}
	
    public static void main (String args[]){

        BufferedReader entree = new BufferedReader(new InputStreamReader(System.in));

        try {
            while (true){
                final String myFruit = entree.readLine();
             
            }
        } catch (IOException e) {
            System.out.println("An error occurred: "+e.getMessage());
        }

    }

}
