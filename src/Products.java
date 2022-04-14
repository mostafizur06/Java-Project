public class Products {
    public int id,quantity;
    String name;
    double price;

    @Override
    public String toString() {
        return 
                "Products Id = " + id +"\n"+
                "Products Name = " + name +"\n"+
                "Products Price = " + price +" BDT\n"+
                "Products Quantity = " + quantity +" Unit\n";
    }
}
