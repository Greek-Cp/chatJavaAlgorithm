package riyan.belajar.java.oop;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[]args){
        Scanner T = new Scanner(System.in);

        boolean state = true; // state
        String TextYou; //your text
        String TextEmploye; //text your freind
        boolean idleChat = true; // idle
        while(state){
            if(!idleChat){
                state = false;
            } else{
                TextYou = T.nextLine();
                System.out.println("You: " + TextYou);
                TextEmploye = T.nextLine();
                System.out.println("Employe: " + TextEmploye);
                if(TextYou.equalsIgnoreCase("Exit")){
                    state = false;
                }
            }
        }
    }
}
