import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Item> items = List.of(
                                   new Item(Item.Type.CONFECTIONARY, "Cake", 3.5f, 1f),
                                   new Item(Item.Type.CONFECTIONARY, "Flour", 0.8f, 2.5f),
                                   new Item(Item.Type.ART, "Painting", 100.0f, 2f),
                                   new Item(Item.Type.GOODS, "TV", 350.0f, 1f),
                                   new Item(Item.Type.PHARMACEUTICAL, "Paracetamol", 2.1f, 4f),
                                   new Item(Item.Type.REPAIRS, "Computer Repair", 35.0f, 1f)
                                  );

        var voucherNull = InvoiceGenerator.generateInvoice(new ShoppingCart(items, null));
        var voucher10POFF50E = InvoiceGenerator.generateInvoice(new ShoppingCart(items, "10POFF50E"));
        var voucher5POFF10I = InvoiceGenerator.generateInvoice(new ShoppingCart(items, "5POFF10I"));
        var voucher12312412 = InvoiceGenerator.generateInvoice(new ShoppingCart(items, "12312412"));


        System.out.println("voucherNull" + voucherNull.toString());
        System.out.println("voucher10POFF50E" + voucher10POFF50E.toString());
        System.out.println("voucher5POFF10I" + voucher5POFF10I.toString());
        System.out.println("voucher12312412" + voucher12312412.toString());
    }

}
