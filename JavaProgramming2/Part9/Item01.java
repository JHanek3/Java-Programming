package Part9;

public class Item01 {
    private String product;
    private int qty;
    private int unitPrice;

    public Item01(String product, int qty, int unitPrice) {
        this.product = product;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    public Item01(String product, int unitPrice) {
        this.product = product;
        this.qty = 1;
        this.unitPrice = unitPrice;
    }

    public int price() {
        return this.unitPrice * this.qty;
    }

    public void increaseQuantity() {
        this.qty++;
    }

    @Override
    public String toString() {
        return String.format("%s: %d", this.product, this.qty);
    }

    @Override
    public boolean equals(Object comparedObject) {

        //located in same place?
        if (this == comparedObject) {
            return true;
        }

        // typeOf?
        if (!(comparedObject instanceof Item01)) {
            return false;
        }

        //convert the object to the desired object
        Item01 comparedItem = (Item01) comparedObject;

        if (this.product.equals(comparedItem.product)) {
            return true;
        } else {
            return false;
        }
    }
}
