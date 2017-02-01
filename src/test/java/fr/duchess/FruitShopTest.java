package fr.duchess;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.Before;
import org.junit.Ignore;
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
		Assert.assertEquals(Fruit.BANANES, Fruit.getByName("BANANES"));
	}
	
	@Test
	public void when_2_cherry_20_discount(){
		fruitShop.add(Fruit.CERISES);
		fruitShop.add(Fruit.CERISES);
		
		Assert.assertEquals(130, fruitShop.getTotal());
		fruitShop.add(Fruit.CERISES);
		Assert.assertEquals(205, fruitShop.getTotal());
		
	}
   
	@Test
	public void discount_banana(){
		fruitShop.add(Fruit.BANANES);
		fruitShop.add(Fruit.BANANES);
		
		Assert.assertEquals(150, fruitShop.getTotal());
	}
	
	@Test
	public void discount_multiple_bananas(){
		fruitShop.add(Fruit.BANANES);
		Assert.assertEquals(150, fruitShop.getTotal());
		fruitShop.add(Fruit.BANANES);
		
		Assert.assertEquals(150, fruitShop.getTotal());
		fruitShop.add(Fruit.BANANES);
		
		Assert.assertEquals(300, fruitShop.getTotal());
		fruitShop.add(Fruit.BANANES);
		
		Assert.assertEquals(300, fruitShop.getTotal());
	}

	@Ignore("reported")
	@Test
	public void readFruit(){
		
		List listFruits = null;
		listFruits = fruitShop.readFruitLine("Pommes, Cerises, Bananes");
		Assert.assertNotNull(listFruits);
		Assert.assertEquals(3, listFruits.size());
	}
	
	@Test
	public void should_add_100_when_apples() {
		fruitShop.add(Fruit.APPLES);
		
		Assert.assertEquals(100, fruitShop.getTotal());
	}
	

	@Test
	public void should_add_100_when_mele() {
		fruitShop.add(Fruit.MELE);
		
		Assert.assertEquals(100, fruitShop.getTotal());
	}
	
	@Test
	public void computeDiscount(){
		int valueCerises = fruitShop.computeDiscount(2, Fruit.CERISES);
	
		int valueBananes = fruitShop.computeDiscount(2, Fruit.BANANES);

		Assert.assertEquals(20, valueCerises);
		Assert.assertEquals(150, valueBananes);
	}
}
