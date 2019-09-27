public final class Invoice {

    private final Float totalCost; // cost of invoice exc tax
    private final Float totalTax; // cost of tax on items
    private final Float totalItems; // total item count - 1 item entry with quantity 3 totalItems = 3

    public Float getGrandTotal(){
        return totalCost + totalTax;
    }

    public Float getTotalCost() {
        return totalCost;
    }

    public Float getTotalTax() {
        return totalTax;
    }

    public Float getTotalItems() {
        return totalItems;
    }

    public Invoice() {
        this.totalCost = 0.0f;
        this.totalTax = 0.0f;
        this.totalItems = 0.0f;
    }

    public Invoice(Float totalCost, Float totalTax, Float totalItems) {
        this.totalCost = totalCost;
        this.totalTax = totalTax;
        this.totalItems = totalItems;
    }

    @Override
    public String toString() {
        return "Invoice{" +
                " totalItems=" + totalItems +
                String.format(", totalCost== %.2f", totalCost) +
                String.format(", totalTax= %.2f", totalTax) +
                String.format(", grandTotal= %.2f", this.getGrandTotal()) +
                '}';
    }
}
