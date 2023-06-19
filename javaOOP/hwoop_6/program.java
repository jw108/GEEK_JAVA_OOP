import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class program {

    public static void main(String[] args) {

        WaterVendingMachine wvm = new WaterVendingMachine();

        Product bonAqua = new Water("bonAqua", 50);
        Product hotKey = new Water("hotKey", 60);

        LinkedList<Product> water_list = new LinkedList<>();
        water_list.add(bonAqua);
        water_list.add(hotKey);

        wvm.putProduct(water_list);
        
        System.out.println("\n////////////////////////////////////////////\n");
        System.out.println(wvm.getProduct());
        System.out.println(wvm.getProduct());
        System.out.println("\n////////////////////////////////////////////\n");
        
        
        HotDrinkVendingMachine hdwm = new HotDrinkVendingMachine();

        HotDrink latte = new HotDrink("Латте", 80, 75, 0.5);
        HotDrink espresso = new HotDrink("Эспрессо", 100, 80, 0.3);
        HotDrink hotTea = new HotDrink("Горячий чай", 40, 95, 0.2);
        HotDrink americano = new HotDrink("Американо", 80, 90, 0.2);
        HotDrink capuchino = new HotDrink("Капусино", 90, 90, 0.3);
        HotDrink mokka = new HotDrink("Мокка", 120, 85, 0.5);
        
        LinkedList<HotDrink> hotDrinks_list = new LinkedList<>();
        hotDrinks_list.add(latte);
        hotDrinks_list.add(espresso);
        hotDrinks_list.add(hotTea);
        hotDrinks_list.add(americano);
        hotDrinks_list.add(capuchino);
        hotDrinks_list.add(mokka);

        hdwm.putProduct(hotDrinks_list);
        
        // if (hdwm.getProduct("Эспрессо", 100, 80, 0.3) != null) {
        //     System.out.println(hdwm.getProduct("Эспрессо", 100, 80, 0.3));
        // } else {
        //     System.out.println("Такого напитка нет в наличии!");
        // }

        Iterator<HotDrink> iterator = hdwm.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("\n////////////////////////////////////////////\n");
        
        List<HotDrink> sortHotDrinksList = hotDrinks_list.stream().sorted().
            collect(Collectors.toList());
        for (int i = 0; i < sortHotDrinksList.size(); i++) {
            System.out.println(sortHotDrinksList.get(i));
        }

    }
}