package unicorp.com.mynewapp.Models;

/**
 * Created by Hima on 11/5/2018.
 */

public class ModelProduct {

    private String title,price,ratePercent,rateCount;
    private int img;

    public ModelProduct(String title, String price, String ratePercent, String rateCount, int img) {
        this.title = title;
        this.price = price;
        this.ratePercent = ratePercent;
        this.rateCount = rateCount;
        this.img = img;
    }

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return price;
    }

    public String getRatePercent() {
        return ratePercent;
    }

    public String getRateCount() {
        return rateCount;
    }

    public int getImg() {
        return img;
    }
}
