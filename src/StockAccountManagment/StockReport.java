package StockAccountManagment;

import java.util.Scanner;

public class StockReport {

    private int numStock;
    private String companyName;
    private int totalShare;
    private int priceOfShare;
    private int totalPrice;

    public StockReport(int numStock) {
        this.numStock = numStock;
    }

    public void getStock(){
        Scanner sc = new Scanner(System.in);
        while(numStock>0){
            System.out.println("ENter the company Name");
            companyName = sc.nextLine();
            System.out.println("Enter the total SHare");
            totalShare = sc.nextInt();
            System.out.println("ENter the price of one share");
         priceOfShare=sc.nextInt();
         totalPrice=totalShare*priceOfShare;

        }

    }





}
