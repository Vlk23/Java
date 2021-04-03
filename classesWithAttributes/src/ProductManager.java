public class ProductManager {
    public void Add(Product product) {
        //JDBC kodları kullanarak veritabanına bağlarız.
        System.out.println("Ürün eklendi " + product.getName());
    }

    public void Add2(int id, String name, String description, double price, String renk) {

    }
}
