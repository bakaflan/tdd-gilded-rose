package cn.xpbootcamp.gilded_rose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GlobalTest {

    @Test
    void product_should_have_SellIn_and_Quality() {
        Product product = new Product();
        product.setName("product");
        product.setQuality(1);
        product.setSellIn(2);
        assertEquals(1, product.getQuality());
        assertEquals(2, product.getSellIn());
        assertEquals("product", product.getName());

    }

    @Test
    void product_quality_should_between_0_and_50() {
        Product product = new Product("product", 3, 24);
        Product product1 = new Product("product", -1, 51);

        assertEquals(3, product.getSellIn());
        assertEquals(24, product.getQuality());

        assertEquals(-1, product1.getSellIn());
        assertEquals(50, product1.getQuality());

    }

    @Test
    void update_product() {
        Product product = new Product("product", 3, 24);
        Product product1 = new Product("product", -1, 51);

        Store store = new Store();
        store.addProduct(product);
        store.addProduct(product1);
        store.updateProduct();

        assertEquals(2, product.getSellIn());
        assertEquals(23, product.getQuality());

        assertEquals(-2, product1.getSellIn());
        assertEquals(48, product1.getQuality());

    }

    @Test
    void when_Sellin_smaller_than_0_double_update_quality(){
        Product product = new Product("product",0,24);
        product.updateProduct();
        assertEquals(22,product.getQuality());

        Product product1 = new Product("product",0,0);
        product1.updateProduct();
        assertEquals(0,product1.getQuality());

    }

    @Test
    void AgedBrie_should_increase_quality_when_update(){
        Product product = new Product("Aged Brie",3,8);
        product.updateProduct();
        assertEquals(9,product.getQuality());
    }

    @Test
    void Sulfuras_is_legend(){
        Product product = new Product("Sulfuras",3,8);
        product.updateProduct();
        assertEquals(3,product.getSellIn());
        assertEquals(8,product.getQuality());
    }

    @Test
    void BackstagePass_should_increase(){
        Product product = new Product("Backstage pass",15,20);
        product.updateProduct();
        assertEquals(21,product.getQuality());
    }

    @Test
    void BackstagePass_should_inc_2_when_last_10days(){
        Product product = new Product("Backstage pass",10,20);
        product.updateProduct();
        assertEquals(22,product.getQuality());
    }

    @Test
    void BackstagePass_should_inc_3_when_last_5days(){
        Product product = new Product("Backstage pass",5,20);
        product.updateProduct();
        assertEquals(23,product.getQuality());
    }

    @Test
    void BackstagePass_should_be_0_when_pass_the_day(){
        Product product = new Product("Backstage pass",0,20);
        product.updateProduct();
        assertEquals(0,product.getQuality());
    }

}
