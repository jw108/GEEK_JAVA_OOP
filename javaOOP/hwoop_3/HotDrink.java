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

    public String toStringList() {
        return "HotDrink{" + "Имя = " + name +
        "; Цена = " + price + "; Температура = " + temperature + "; Объем = " + volume + "}\n";
    }

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