package cn.xpbootcamp.gilded_rose;

public class Product {

    private String name;
    private int sellIn;
    private int quality;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSellIn() {
        return sellIn;
    }

    public void setSellIn(int sellIn) {
        this.sellIn = sellIn;
    }

    public int getQuality() {
        return quality;
    }

    public void setQuality(int quality) {
        if(quality<0){
            this.quality = 0;
            return;
        }
        if(quality>50){
            this.quality =50;
            return;
        }
        this.quality = quality;
    }

    public Product() {
    }

    public Product(String name, int sellIn, int quality) {
        this.setName(name);
        this.setSellIn(sellIn);
        this.setQuality(quality);
    }


    public void updateProduct() {
        this.setSellIn(this.sellIn - 1);
        if(this.sellIn<0){
            this.setQuality(this.quality-2);

        }else{
            this.setQuality(this.quality - 1);

        }

    }
}
