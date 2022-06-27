package s12_java_collection_framwork.excercise.arraylist.models;

public class Product {
    private String productCode;
    private String productName;
    private String manufacturingDay;
    private String producer;
    private double productPrice;

    public Product() {
    }

    public Product(String productCode, String productName, String manufacturingDay, String producer, double productPrice) {
        this.productCode = productCode;
        this.productName = productName;
        this.manufacturingDay = manufacturingDay;
        this.producer = producer;
        this.productPrice = productPrice;
    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getManufacturingDay() {
        return manufacturingDay;
    }

    public void setManufacturingDay(String manufacturingDay) {
        this.manufacturingDay = manufacturingDay;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", manufacturingDay='" + manufacturingDay + '\'' +
                ", producer='" + producer + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
