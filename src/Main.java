import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        ProductList productList = new ProductList();

        while (true) {

            System.out.println("Выберите одну из операций: 1. Добавить, 2. Показать, 3. Удалить. Или введите `end`");

            String line = sc.nextLine();
            if ("end".equals(line)) {
                System.out.println("Программа завершена!");
                break;
            }

            Integer operationNumber = 0;
            try {
                operationNumber = Integer.parseInt(line);
            } catch (NumberFormatException e) {
                continue;
            }

            switch (operationNumber) {

                case 1: { // add
                    System.out.println("Какую покупку хотите добавить?");
                    line = sc.nextLine();
                    productList.add(line);
                    continue;
                }
                case 2: { // show
                    productList.show();
                    continue;
                }
                case 3: { // remove

                    productList.show();
                    System.out.println("Какой продукт хотите удалить? Введите номер или название");

                    line = sc.nextLine();

                    try {
                        Integer productIndex = Integer.parseInt(line);
                        productList.remove(productIndex);
                    } catch (NumberFormatException e) {
                        String productName = line;
                        productList.remove(productName);
                    }

                }
                //default: break;
            }
        }
    }
}
