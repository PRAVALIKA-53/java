/*⦁	Create a class called Invoice that a hardware store might
 *  use to represent an invoice for an item sold  at  the  store.
 *    An  Invoice  should  include  four  pieces  of  information  as  
 *    instance variables-a part number(type String),a part description(type String),
 *    a quantity of the item being purchased (type int) and a price per item (double).
 *     Your class should have a constructor that initializes the four instance variables. In addition, provide a method named getInvoiceAmount that calculates the invoice amount.
 */

package lab_projects;
 class Invoice {
     String partNumber;
     String partDescription;
     int quantity;
     double pricePerItem;

     Invoice(String partNumber, String partDescription, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        this.quantity = quantity;
        this.pricePerItem = pricePerItem;
    }
     
    double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    public static void main(String[] args) {
        Invoice invoice = new Invoice("1426", "screw driver", 4, 14.69);
        double amount = invoice.getInvoiceAmount();
        System.out.println("Invoice amount: $" + amount);
    }
}
