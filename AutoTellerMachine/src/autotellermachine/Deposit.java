/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autotellermachine;

import java.util.Scanner;

/**
 *
 * @author faffn
 */
public class Deposit implements Systems {

    @Override
    public void workOn(Balance model, BalanceView view, BalanceController controller) {
        int depoIn;
        Scanner scan = new Scanner(System.in);
        System.out.println("Amount money of deposited : ");
        depoIn = scan.nextInt();
        
        if (depoIn % 50000 != 0) {
            System.out.println("Sorry, the amount of money must be multiples of Rp. 50,000\n\n");
            workOn(model, view, controller);
        }
        else {

            int nowBalance = model.getBalance();
            int newBalance = nowBalance + depoIn;
            
            controller.setBalanceBalance(newBalance);

            System.out.println("\nCash deposit succesfull\n====================================");
            
            AutoTellerMachine main = new AutoTellerMachine();
            main.mainMenu(model, view, controller);
            
            
        }
    }
    
}
