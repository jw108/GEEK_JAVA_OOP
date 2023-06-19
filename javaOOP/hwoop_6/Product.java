/*
 * По принципу подстановки Барбары Лисков 
 * в базовый (родительский) класс внесена только общая
 * логика, характерная для классов наследников,
 * которые будут ее реализовывать.
 * Например, в классе HotDrink добавлены только те методы,
 * которые использует только он.
 */

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
