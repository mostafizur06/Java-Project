
import java.util.ArrayList;
import java.util.Scanner;


public class Test {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Products> list = new ArrayList();

        while (true) {
            userpass us = new userpass();
            System.out.println("-----------------------");
            System.out.println("Shop Management System ");
            System.out.println("-----------------------");

            System.out.println(" [1] Login");

            System.out.println(" [2] Signup   (If you don't have an account)");
            System.out.print("\nEnter Your Choice: ");
            int a = input.nextInt();
            

            switch (a) {

                case 1:

                    input.nextLine();
                    System.out.print("\nUser Name : ");
                    us.user = input.nextLine();
                    System.out.print("Password : ");
                    us.pass = input.nextLine();

                    if (us.user.equals("sohan") && (us.pass.equals("123"))) {
                        System.out.println("\n");
                         
                        System.out.println("      Welcome");
                        System.out.println("---------------------");

                        while (true) {
                            System.out.println("\n  1. Add Products");
                            System.out.println("  2. Show Products List");
                            System.out.println("  3. Delete Product");
                            System.out.println("  4. Purchase");
                            System.out.println("  5. Logout");
                              System.out.print("\nEnter Your Choice: ");
                            int b = input.nextInt();

                            switch (b) {

                                case 1:
                                    Products pd = new Products();
                                    System.out.print("Enter Product id : ");
                                    pd.id = input.nextInt();
                                    input.nextLine();
                                    System.out.print("Enter Product Name : ");
                                    pd.name = input.nextLine();
                                    System.out.print("Enter Product price : ");
                                    pd.price = input.nextDouble();
                                    System.out.print("Enter Product quantity : ");
                                    pd.quantity = input.nextInt();

                                    list.add(pd);
                                    break;
                                case 2:
                                     System.out.println("_____________________________");
                                     System.out.println("        Product List");
                                     System.out.println("-----------------------------");
                                    for (int i = 0; i < list.size(); i++) {
                                       
                                        System.out.println(list.get(i));
                                        
                                    }
                                    System.out.println("_____________________________");
                                    
                                    break;
                                case 3:
                                    System.out.println("Enter Product ID for remove");
                                    int id = input.nextInt();
                                    for (int i = 0; i < list.size(); i++) {
                                        if (list.get(i).id == id) {
                                            list.remove(i);
                                            System.out.println("Remove Product successfully");
                                        }
                                    }
                                    break;
                                case 4:
                                  
                                    System.out.println("Total Ammont = ");
                                    
                                    System.out.println("\nAre you confrim? if confirm press 1\n"
                                            + "if not press 2 ");
                                    int c = input.nextInt();
                                    System.out.println("_______________________________");
                                    
                            switch (c) {

                                case 1:
                                    System.out.println("    Thanks for Purchasing");
                                    break;
                                case 0:
                                    System.out.println("        Thank you");
                                    break;
                            }
                                case 5:
                                    System.exit(0);
                                    default:
                        System.out.println("\nInvalid Choice!");

                            }

                        }
                    } else {
                        System.out.println("Please Try Again");
                        break;
                    }
                case 2:
                    System.out.println("Sorry...This features is not available right now");
                  break;
                default:
                        System.out.println("\nInvalid Choice!");
                    }
            }

        }
    }
