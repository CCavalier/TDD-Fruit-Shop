package fr.duchess;

import org.junit.Before;
import org.junit.Test;

import junit.framework.Assert;

public class FruitShopTest {

	FruitShop fruitShop;
	
	@Before
	public void setUp() {
		fruitShop = new FruitShop();
	}
	
	
	@Test
	public void should_add_100_when_apple() {
		
		fruitShop.add(Fruit.POMMES);
		Assert.assertEquals(100, fruitShop.getTotal());
		
		fruitShop.add(Fruit.POMMES);
		Assert.assertEquals(200, fruitShop.getTotal());
	}
	
	@Test 
	public void get_fruit_by_name(){
		Assert.assertEquals(Fruit.CERISES, Fruit.getByName("cerises"));
		Assert.assertEquals(Fruit.CERISES, Fruit.getByName("CerIses"));
	}
   
}
