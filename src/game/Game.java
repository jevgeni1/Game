/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jevge
 */
public class Game {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random random = new Random();
        int num = random.nextInt(5-0+1)+0;
        System.out.println("Programma zagadala tsislo ot 0 do 5, otgadai:");
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        if(num == userNum) {
            System.out.println("Ura, ty vyigral!");
        }else{
            System.out.println("Ty proigral :(, zadumano tsislo: " + num);
        }
        
    }
    
}
