import java.util.Scanner;

class Product
    {
    private int id;
    private String pname;
    private int price;
    private int quantity;
    static int total_quantity = 0;

    Product(){
        id = 0;
        pname = null;
        price = 0;
        quantity = 0;
    }
    void addProduct()
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter product name");
        pname = s.nextLine();
        System.out.println("Enter product id");
        id = s.nextInt();
        System.out.println("Enter product price");
        price = s.nextInt();
        System.out.println("Enter product quantity");
        quantity = s.nextInt();
        total_quantity += quantity;
    }
    void saleProduct()
    {
        if(quantity>0)
        {
            quantity--;
            total_quantity--;
        }
        else
            System.out.println("Out of stock");
    }
    void productDetails()
    {
        System.out.println("Product Id : " + id);
        System.out.println("Product name : " + pname);
        System.out.println("Product price : " + price);
        System.out.println("Product quantity : " + quantity);
        System.out.println("Total store quantity : " + total_quantity);
    }
    int getId()
    {
        return id;
    }
    }

public class Productclass {
    public static void main(String[] args) {
        Product P1 = new Product();
        Product P2 = new Product();
        Product P3 = new Product();
        Product P4 = new Product();
        Product P5 = new Product();
        int counter ;
        char ch;
        int yes;
        Scanner s = new Scanner(System.in);
        System.out.println("\t ***Choose the process***\n");
        System.out.println("\t1 : Add product\n\t2 : Sell Product\n\t3 : View Product details\n\t0 : Exit");
        int p = s.nextInt();
        while(p!=0)
        {
                counter = 1;
                ch = 'Y';
            switch (p) {
                case 1:
                    while (ch == 'Y') {
                        if (counter == 1) {
                            P1.addProduct();
                            counter++;
                        } else if (counter == 2) {
                            P2.addProduct();
                            counter++;
                        } else if (counter == 3) {
                            P3.addProduct();
                            counter++;
                        } else if (counter == 4) {
                            P4.addProduct();
                            counter++;
                        } else if (counter == 5) {
                            P5.addProduct();
                            counter++;
                        } else {
                            System.out.println("Limit exceed");
                            break;
                        }

                        System.out.println("Do you want to add other product?Enter 'Y'");
                        ch = s.next().charAt(0);
                    }
                    break;

                case 2:
                    while (ch == 'Y') {
                        System.out.println("Enter the product Id");
                        counter = s.nextInt();
                        if (counter == P1.getId()) {
                            P1.saleProduct();
                        } else if (counter == P2.getId()) {
                            P2.saleProduct();
                        } else if (counter == P3.getId()) {
                            P3.saleProduct();
                        } else if (counter == P4.getId()) {
                            P4.saleProduct();
                        } else if (counter == P5.getId()) {
                            P5.saleProduct();
                        } else {
                            System.out.println("Product Id is wrong");
                            break;
                        }

                        System.out.println("Do you want to sell other product?Enter 'Y'");
                        ch = s.next().charAt(0);
                    }
                    break;

                case 3:
                    while (ch == 'Y') {
                        System.out.println("Enter the product Id");
                        counter = s.nextInt();
                        if (counter == P1.getId()) {
                            P1.productDetails();
                        } else if (counter == P2.getId()) {
                            P2.productDetails();
                        } else if (counter == P3.getId()) {
                            P3.productDetails();
                        } else if (counter == P4.getId()) {
                            P4.productDetails();
                        } else if (counter == P5.getId()) {
                            P5.productDetails();
                        } else {
                            System.out.println("Product Id is wrong");
                            break;
                        }
                        System.out.println("Do you want to view another product details?Enter 'Y'");
                        ch = s.next().charAt(0);
                         }
                         break;
                }
                System.out.println("Do you want to perform another process?\nYes : 1\nExit : 0");
                yes = s.nextInt();
                if(yes==1)
                {
                System.out.println("\t\t ***Choose the process***");
                System.out.println("\tAdd product : 1 \n\tSell Product : 2\n\tView Product details : 3\n\tExit : 0");
                p = s.nextInt();
                }
                else
                    p = yes;
        }
    }
}
