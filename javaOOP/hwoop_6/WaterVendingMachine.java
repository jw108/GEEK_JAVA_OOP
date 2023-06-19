/*
 * В определенной мере здесь использован принцип
 * разделения интерфейсов, потому что в какой-то
 * абстрактной ситуации, клиенту может не понадобиться
 * например метод получения или добавления продукта.
 */

import java.util.LinkedList;

public class WaterVendingMachine implements putProductVendingMachine, getProductVendingMachine {

    private LinkedList<Product> waters;

    public void putProduct(LinkedList<Product> item) {
        this.waters = item;
    }

    @Override
    public Product getProduct() {
        return waters.pollLast();
    }

    public void putProduct() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'putProduct'");
    }

}