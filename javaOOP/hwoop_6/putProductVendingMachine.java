/*
 * Принцип DIP
 * Разбили наш один интерфейс VendingMachine на два
 * интерфейса putProductVendingMachine и 
 * getProductVendingMachine, которые стали нашими
 * абстракциями.
 * 
 * Так же в какой-то степени здесь принцип разделения
 * интерфейсов (ISP).
 */

public interface putProductVendingMachine {
    public void putProduct();
}
