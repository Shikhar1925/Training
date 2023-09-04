package inventry;

import java.util.Scanner;
public class ProductMenu {
    private static ProductJdbcDao dao;
    static {
        try {
            dao = new ProductJdbcDao();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        while (true) {

            Scanner sc = new Scanner(System.in);
            System.out.println("Main menu: ");
            System.out.println("1- Add product \n2- Find Product\n3-List product \n4- Delete Product");
            System.out.println("Enter choice: ");
            int ch = sc.nextInt();
            switch (ch) {
            case 1:
                addProduct();
                break;
            case 2:
                findProduct();
                break;
            case 3:
                listProducts();
                break;
            case 4:
                delProducts();
                break;
            case 5:
                System.out.println("CHALO NIKLO");
                System.exit(0);
            default:
                System.out.println("Invalid option");
            }
            //sc.close();
        }
    }
    private static void delProducts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product code: ");
        int code = sc.nextInt();
        dao.delete(code);
        //sc.close();
    }
    private static void listProducts() {
        dao.list().forEach(System.out::println);
    }

    private static void findProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product code: ");
        int code = sc.nextInt();
        System.out.println(dao.find(code));
        //sc.close();
    }
    private static void addProduct() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product code: ");
        int code = sc.nextInt();
        System.out.println("Enter Product Name: ");
        String name = sc.next();
        System.out.println("Enter Product price: ");
        double price = sc.nextDouble();
        Product p = new Product(code, name, price);

        dao.add(p);

        //sc.close();

    }

 

}

 