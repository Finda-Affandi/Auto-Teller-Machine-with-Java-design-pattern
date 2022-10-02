/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autotellermachine;

/**
 *
 * @author faffn
 */
public class ViewBalance implements Systems {

    @Override
    public void workOn(Balance model, BalanceView view, BalanceController controller) {         
        CheckBalance display = CheckBalance.getInstance();
        display.displayBalance(model, view, controller);
        
        System.out.println("\n");
        AutoTellerMachine main = new AutoTellerMachine();
        main.mainMenu(model, view, controller);
            
    }
    
}
