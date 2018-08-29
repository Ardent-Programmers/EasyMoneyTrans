/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Security;

import DatabaseManager.Customer;
import DatabaseManager.DatabaseManager;
import DatabaseManager.Transfer;
import DatabaseManager.TransferDAO;
import GUI.ApplicationManager;
import GUI.Options.Options;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class TransactionManager {
    
    static Transfer trans = new Transfer();
    static Customer cust = ApplicationManager.DBManager.cust;
    static TransferDAO t = ApplicationManager.DBManager.t;
    
    public static void withdraw(float Amount) {
        init();
        trans.Withdraw=true;
        trans.Deposit = false;
        trans.Amount = Amount;
        
        float BalanceAmt;
        
        if(trans.Amount > cust.Amount)
        {
            ApplicationManager.Notify.sendNotification("You Don't have Enuff money u have only " + cust.Amount, 1);
        }
        else
        {
            ////            calculating balance amount
           BalanceAmt = cust.Amount - trans.Amount;
           
            update(BalanceAmt);
////            calculating balance amount
//           BalanceAmt = cust.Amount - trans.Amount;
////           updating in the database
//           boolean s =  ApplicationManager.DBManager.c.changeAmount(BalanceAmt,cust.AccountNo);
//           
//           if(s)
//           {
//               t.addTransaction(trans);
//               
//               cust.Amount = BalanceAmt;
//               
//               ApplicationManager.application.loadScene(new Options());
//           }
        }
        
        
        
    }
    
    
    public static void deposit(float Amount) {
        init();
        trans.Withdraw=false;
        trans.Deposit = true;
        trans.Amount = Amount;
        
        
        float BalanceAmt;
//            calculating balance amount
           BalanceAmt = cust.Amount + trans.Amount;
           
           
       
        
           update(BalanceAmt);
           
////           updating in the database
//           boolean s =  ApplicationManager.DBManager.c.changeAmount(BalanceAmt,cust.AccountNo);
//           
//           if(s)
//           {
//               t.addTransaction(trans);
//               
//                cust.Amount = BalanceAmt;
//               
//               ApplicationManager.application.loadScene(new Options());
//           }
        
        
    }
    
    
    public static void init()
    {
        Date dl = new Date();
       SimpleDateFormat fdate = new SimpleDateFormat("yyyy-MM-dd");
       SimpleDateFormat ftime = new SimpleDateFormat("HH:mm:ss");
              
       
//       setting the AccountNo as allready loggin user AccountNo
        trans.AccountNo = cust.AccountNo;
        
        
        
//        initialize date and time with current date and time
        trans.Date = fdate.format(dl);
        trans.Time = ftime.format(dl);
    }
    
    public static void update(float BalanceAmt)
    {
        //           updating in the database
           boolean s =  ApplicationManager.DBManager.c.changeAmount(BalanceAmt,cust.AccountNo);
           
           if(s)
           {
               t.addTransaction(trans);
               
                cust.Amount = BalanceAmt;
               
               ApplicationManager.application.loadScene(new Options());
           }
    }
    
    
}
