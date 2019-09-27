import java.util.List;
import java.util.Optional;

public class ShoppingCart {

    private final List<Item> itemList; // list of items customer wants to buy
    private final String couponCode; // discount on final invoice - can be null if not specified

    public ShoppingCart(List<Item> itemList, String couponCode) {
        this.itemList = itemList;
        this.couponCode = couponCode;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public Optional<String> getCouponCode() {
        return Optional.ofNullable(couponCode);
    }
}
