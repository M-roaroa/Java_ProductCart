import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<Product> products = new HashSet<>();
        Product 치약 = new Product("1", "치약", 1000);
        Product 칫솔 = new Product("2", "칫솔", 1000);
        Product 샴푸 = new Product("3", "샴푸", 1000);
        Product 린스 = new Product("4", "린스", 1000);

//        products.add(치약);
//        products.add(칫솔);
//        products.add(샴푸);
//        products.add(린스);
//
//        for(Product product : products) {
//            System.out.println(product.getName());
//        }

        // 장바구니
        Cart myCart = new Cart();
        myCart.addProduct(치약, 1);
        myCart.addProduct(칫솔, 1);

        System.out.println(myCart.showItems());
    }
}