/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autotellermachine;

/**
 *
 * @author faffn
 */
public class SystemWorker {
    public Systems getSystem(String systemsType) {
        if (systemsType == null) {
            return null;
        }
        else if (systemsType.equalsIgnoreCase("DEPOSIT")) {
            return new Deposit();
        }
        else if (systemsType.equalsIgnoreCase("CASH WITH DRAW")) {
            return new CashWithdraw();
        }
        else if (systemsType.equalsIgnoreCase("VIEW BALANCE")) {
            return new ViewBalance();
        }
        return null;
    }
}
