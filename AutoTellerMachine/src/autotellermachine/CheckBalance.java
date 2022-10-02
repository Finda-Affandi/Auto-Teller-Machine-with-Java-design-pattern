/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autotellermachine;

/**
 *
 * @author faffn
 */
public class CheckBalance {
    private static CheckBalance instance = new CheckBalance();
    
    private CheckBalance() {
        
    }
    
    public static CheckBalance getInstance() {
        return instance;
    }
    
    public void displayBalance(Balance model, BalanceView view, BalanceController controller) {
        int nowBalance = model.getBalance();
        System.out.println("Your Balance is : Rp." + nowBalance);
    }
}
