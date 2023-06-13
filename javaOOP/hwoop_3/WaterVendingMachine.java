import java.util.LinkedList;

public class WaterVendingMachine implements VendingMachine {

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