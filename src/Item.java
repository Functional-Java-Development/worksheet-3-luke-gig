public class Item {

    enum Type {

//        ART(5.0f),
//        CONFECTIONARY(6.0f),
//        REPAIRS(7.5f),
//        PHARMACEUTICAL(0.0f),
//        GOODS(18f);
//
//        private final Float taxRate;
//
//        Type(Float taxRate){
//            this.taxRate = taxRate;
//        }
//
//        public Float getTaxRate() {
//            return taxRate;
//        }

        ART,
        CONFECTIONARY,
        REPAIRS,
        PHARMACEUTICAL,
        GOODS;

    }

    private final Type itemType;
    private final String name;
    private final Float costPerUnit;
    private final Float quantity;

    public Item(Type itemType, String name, Float costPerUnit, Float quantity) {
        this.itemType = itemType;
        this.name = name;
        this.costPerUnit = costPerUnit;
        this.quantity = quantity;
    }

    public Type getItemType() {
        return itemType;
    }

    public String getName() {
        return name;
    }

    public Float getCostPerUnit() {
        return costPerUnit;
    }

    public Float getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Item{" +
                "itemType=" + itemType +
                ", name='" + name + '\'' +
                ", costPerUnit=" + costPerUnit +
                ", quantity=" + quantity +
                '}';
    }
}
