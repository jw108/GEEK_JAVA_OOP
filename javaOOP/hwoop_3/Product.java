public abstract class Product {

    protected String name;
    protected Long price;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(long price) {
        this.price = price;
    }
    
    @Override
    public String toString() {
        return "Product [Имя =" + name + ", Цена =" + price + "]";
    }



    





}
