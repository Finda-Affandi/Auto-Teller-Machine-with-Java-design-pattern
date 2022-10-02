/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autotellermachine;

import java.util.Scanner;

/**
 *
 * @author faffn
 */
public class AutoTellerMachine {

    /**
     * @param args the command line arguments
     */
    
    private static Balance retriveBalance() {
        Balance balance = new Balance();
        balance.setBalance(500000);
        return balance;
    }
    
    public static void mainMenu(Balance model, BalanceView view, BalanceController controller) {
                   
       Scanner scan = new Scanner(System.in);
       int choice;
       
       System.out.println("=== Welcome to ATM Menu ===");
       System.out.println("1. Deposit\n2. Cash Withdrawal\n3. Check Balance\nYour choices : ");
       choice = scan.nextInt();
       
       SystemWorker systemWorker = new SystemWorker();
       
       switch(choice) {
           case 1:       
               Systems systems1 = systemWorker.getSystem("DEPOSIT");
               systems1.workOn(model, view, controller);
               
           case 2:
               Systems systems2 = systemWorker.getSystem("CASH WITH DRAW");
               systems2.workOn(model, view, controller);
           
           case 3:       
               Systems systems3 = systemWorker.getSystem("VIEW BALANCE");
               systems3.workOn(model, view, controller);
       }
    }
    
    public static void main(String[] args) {
        Balance model = retriveBalance();
        BalanceView view = new BalanceView();
        BalanceController controller = new BalanceController(model, view);
        
        mainMenu(model, view, controller);
    }
    
}
