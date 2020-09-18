package Business;

public class Product {
    private String name;
    private String price;
    private String availibilityNumber;
    private String description;

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getAvailibilityNumber() {
        return availibilityNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setAvailibilityNumber(String availibilityNumber) {
        this.availibilityNumber = availibilityNumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
}
