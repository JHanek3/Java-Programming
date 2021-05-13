package Part9;

import java.util.HashMap;
import java.util.Map;

public class ShoppingCart {
    private Map<String, Item01> cart;

    public ShoppingCart() {
        this.cart = new HashMap<>();
    }

    public void add(String product, int price) {
        if (this.cart.containsKey(product)) {
            this.cart.get(product).increaseQuantity();
        } else {
            this.cart.put(product, new Item01(product, price));
        }
    }

    public int price() {
        int sum = 0;
        for (Item01 item: cart.values()) {
            sum += item.price();
        }
        return sum;
    }

    public void print() {
        for (Item01 item: cart.values()) {
            System.out.println(item);
        }
    }
}
