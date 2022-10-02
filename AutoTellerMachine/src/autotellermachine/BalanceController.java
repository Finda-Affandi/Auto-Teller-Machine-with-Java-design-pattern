/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autotellermachine;

/**
 *
 * @author faffn
 */
public class BalanceController {
    private Balance model;
    private BalanceView view;
    
    public BalanceController(Balance model, BalanceView view) {
        this.model = model;
        this.view = view;
    }

    public void setBalanceBalance(int balance) {
        model.setBalance(balance);
    }
    
    public int getBalanceBalance() {
        return model.getBalance();
    }
    
    public void updateView() {
        view.balanceDetail(model.getBalance());
    }
}
