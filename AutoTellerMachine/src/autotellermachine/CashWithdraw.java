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
public class CashWithdraw implements Systems {

    @Override
    public void workOn(Balance model, BalanceView view, BalanceController controller) {
        int depoOut;
        Scanner scan = new Scanner(System.in);
        System.out.println("Amount of money you want to withdraw : ");
        depoOut = scan.nextInt();
        
        if (depoOut % 50000 != 0) {
            System.out.println("Sorry, the amount of money must be multiples of Rp. 50,000\n\n");
            workOn(model, view, controller);
        }
        else {

            int nowBalance = model.getBalance();
            int newBalance = nowBalance - depoOut;
            
            if(newBalance <= 100000) {
                System.out.println("Sorry, the amount of minimum money must be Rp. 100,000\n\n");
                
                AutoTellerMachine main = new AutoTellerMachine();
                main.mainMenu(model, view, controller);
            }
            else {
                controller.setBalanceBalance(newBalance);

                System.out.println("\nCash withdraw succesfull\n====================================");
            
                AutoTellerMachine main = new AutoTellerMachine();
                main.mainMenu(model, view, controller);
            }                
        }
    }
    
}
