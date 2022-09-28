import java.util.ArrayList;

public class ProductList {

    public ProductList() {
        this.productList = new ArrayList<String>();
    }

    private ArrayList<String> productList;

    private Integer productsCount() {
        return productList.toArray().length;
    }

    public void add(String g) {
        productList.add(g);
        System.out.println("Итого в списке покупок: " + this.productsCount());
    }

    public void show() {
        System.out.println("Список покупок:");
        for (int i = 0; i < productList.size(); i++) {
            System.out.println((i + 1) + ". " + this.productList.get(i));
        }

    }

    public void remove(Integer productIndex) {
        if (productsCount() > 0 && productIndex >= 0 && productIndex <= productsCount()) {
            String productName = productList.get(productIndex - 1);
            productList.remove(productIndex - 1);
            System.out.println("Покупка " + productName + " удалена, список покупок:");
            this.show();
        }
    }

    public void remove(String productName) {
        if (!productName.isEmpty()) {

            productList.remove(productName);
            System.out.println("Покупка " + productName + " удалена, список покупок:");
            this.show();

        }
    }

}
