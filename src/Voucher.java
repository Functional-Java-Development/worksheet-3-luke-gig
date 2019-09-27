import java.util.function.Predicate;

public final class Voucher {

    private final String description;
    private final String code;
    private final Float discount;
    private final Predicate<Invoice> isApplicable; // check if voucher is applicable to invoice

    public Voucher(String description, String code, Float discount, Predicate<Invoice> isApplicable) {
        this.description = description;
        this.code = code;
        this.discount = discount;
        this.isApplicable = isApplicable;
    }

    public String getDescription() {
        return description;
    }

    public String getCode() {
        return code;
    }

    public Float getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Voucher{" +
                "description='" + description + '\'' +
                ", code='" + code + '\'' +
                ", discount=" + discount +
                '}';
    }

    public Invoice apply(Invoice invoice){
        if(isApplicable.test(invoice)){
            return new Invoice(invoice.getTotalCost()*(1.0f-getDiscount()),invoice.getTotalTax()*(1.0f-getDiscount()), invoice.getTotalItems());
        }
        return invoice;
    }
}
