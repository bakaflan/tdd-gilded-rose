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
        if(this.name.equals("Sulfuras")){
            return;
        }

        if(this.getName().equals("Backstage pass")){
            if(this.getSellIn()<=0){
                this.setSellIn(this.sellIn - 1);
                this.setQuality(0);
                return;
            }

            if(this.getSellIn()<=5){
                this.setSellIn(this.sellIn - 1);
                this.setQuality(this.quality+3);
                return;
            }

            if(this.getSellIn()<=10){
                this.setSellIn(this.sellIn - 1);
                this.setQuality(this.quality+2);
                return;
            }
            this.setSellIn(this.sellIn - 1);
            this.setQuality(this.quality+1);
            return;
        }

        if(this.getName().equals("Aged Brie")){
            this.setSellIn(this.sellIn - 1);
            this.setQuality(this.quality+1);
            return;
        }

        if(this.sellIn<=0){
            this.setSellIn(this.sellIn - 1);
            this.setQuality(this.quality-2);

        }else{
            this.setSellIn(this.sellIn - 1);
            this.setQuality(this.quality - 1);
        }

    }
}
