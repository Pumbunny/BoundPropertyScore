/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boundpropertyscore;

import java.util.Scanner;

/**
 *
 * @author GP63
 */
public class BoundPropertyScore {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MyBean mySource = new MyBean();
        Listener1 listener1 = new Listener1();
        Listener2 listener2 = new Listener2();
        mySource.addPropertyChangeListener(listener1);
        mySource.addPropertyChangeListener(listener2);
        
        Scanner inp = new Scanner(System.in);
        while(true)
        {
            System.out.print("Please enter score ");
            String scoreT = inp.nextLine();
            if(scoreT.equals(""))
                break;
            mySource.setScoreProperty(scoreT);
        }
    }
    
}
