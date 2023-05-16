
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author mangl
 */
public class ArrayDemo {
    //Hi 
    public static void main(String[] args) {
        String myLetter;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name : ");
        myLetter = scanner.nextLine();
        char[] letter = new char[myLetter.length()];
        for(int i = 0; i < letter.length; i++) {
            
            letter[i] = myLetter.charAt(i);
        
        }
        System.out.print("Your name in reverse : ");
        for(int i = letter.length-1 ; i>=0 ; i--) {
            System.out.print(letter[i]);
        }
        System.out.println("");
        
                
                
    }
           
    
}
