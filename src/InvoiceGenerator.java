public class InvoiceGenerator {


    private static Invoice addItemToInvoice(Invoice invoice, Item item){

        var totalCost = invoice.getTotalCost() + item.getCostPerUnit()*item.getQuantity();
        var totalTax = invoice.getTotalTax() + TaxRates.getTaxRate(item.getItemType()).orElse(0.18f)*item.getCostPerUnit()*item.getQuantity();

        var totalItems = invoice.getTotalItems() + item.getQuantity();

        return new Invoice(totalCost, totalTax, totalItems);

    }

    private static Invoice accumulateInvoices(Invoice inv1, Invoice inv2){

        return new Invoice(inv1.getTotalCost()+inv2.getTotalCost(),
                           inv1.getTotalTax()+inv2.getTotalTax(),
                           inv1.getTotalItems()+inv2.getTotalItems());
    }

    public static Invoice generateInvoice(ShoppingCart shoppingCart){

        var inv = shoppingCart.getItemList().stream().reduce(new Invoice(),
                                                             // (Invoice inv, Item itm) -> addItemToInvoice(inv, itm)
                                                             InvoiceGenerator::addItemToInvoice,
                                                             InvoiceGenerator::accumulateInvoices);

        return shoppingCart.getCouponCode().flatMap(Vouchers::getVoucher).map(voucher -> voucher.apply(inv)).orElse(inv);

    }
}
