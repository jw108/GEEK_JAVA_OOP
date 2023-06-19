/*
 * В классе HotDrink добавлены только те методы,
 * которые использует только он.
 * По принципу подстановки Барбары Лисков 
 * в базовый (родительский) класс внесена только общая
 * логика, характерная для классов наследников,
 * которые будут ее реализовывать.
 */

public class HotDrink extends Product implements Comparable<HotDrink> {

    private int temperature;
    private double volume;

    public HotDrink(String name, long price, int temperature, double volume) {
        super.name = name;
        super.price = price;
        this.temperature = temperature;
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "HotDrink{" + "Имя = " + name +
        "; Цена = " + price + "; Температура = " + temperature + "; Объем = " + volume + "}";
    }

    // public String toStringList() {
    //     return "HotDrink{" + "Имя = " + name +
    //     "; Цена = " + price + "; Температура = " + temperature + "; Объем = " + volume + "}\n";
    // }

    public int getTemperature() {
        return this.temperature;
    }

    public double getVolume() {
        return this.volume;
    }

    public int compareTo(HotDrink o) {
        return this.price.compareTo(o.price);
    }
    
}