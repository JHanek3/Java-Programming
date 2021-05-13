package Part9;

import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Warehouse01 {
    private Map<String, Integer> productPrices;
    private Map<String, Integer> productStocks;

    public Warehouse01() {
        this.productPrices = new HashMap<>();
        this.productStocks = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        this.productPrices.put(product, price);
        this.productStocks.put(product, stock);
    }

    public int price(String product) {
        if (this.productPrices.containsKey(product)) {
            return this.productPrices.get(product);
        } else {
            return -99;
        }
    }

    public int stock(String product) {
        if (this.productStocks.containsKey(product)) {
            return this.productStocks.get(product);
        } else {
            return 0;
        }
    }

    public boolean take(String product) {
        if (this.productStocks.containsKey(product)) {
            if (this.productStocks.get(product) >= 1) {
                this.productStocks.put(product, this.productStocks.get(product) - 1);
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public Set<String> products() {
        return this.productPrices.keySet();
    }
}
