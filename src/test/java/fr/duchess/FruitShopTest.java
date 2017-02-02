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
		Assert.assertEquals(Fruit.BANANES, Fruit.getByName("BANANES"));
		Assert.assertEquals(Fruit.POMMES, Fruit.getByName(" pommes"));
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
	
	@Test
	public void computeDiscount_et_total() {
		int expected = Fruit.CERISES.getPrice()*2-Fruit.CERISES.getDiscount();
		fruitShop.add(Fruit.CERISES);
		fruitShop.add(Fruit.CERISES);
		
		Assert.assertEquals(expected, fruitShop.getTotal());
	}
	
	@Test
	public void should_add_200_when_3_apples() {
		fruitShop.add(Fruit.APPLES);
		fruitShop.add(Fruit.APPLES);
		fruitShop.add(Fruit.APPLES);
		
		Assert.assertEquals(200, fruitShop.getTotal());
	}
	
	@Test
	public void should_add_100_when_2_mele() {
		fruitShop.add(Fruit.MELE);
		fruitShop.add(Fruit.MELE);
		
		Assert.assertEquals(100, fruitShop.getTotal());
	}
	
	@Test
	public void should_create_list_from_csv(){
		String csv = "apples, apples, cerises";
		fruitShop.readFruitLine(csv);
		Assert.assertEquals(275, fruitShop.getTotal());
	}
	
	@Test
	public void should_cost_300_when_4_mele() {
		String csv = "apples, mele, apples, mele";
		fruitShop.readFruitLine(csv);
		
		Assert.assertEquals(300, fruitShop.getTotal());
	}
}
