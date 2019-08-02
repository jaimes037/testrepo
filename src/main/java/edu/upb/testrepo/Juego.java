/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.upb.testrepo;
/**
 *
 * @author informatica
 */
import java.util.Random;
import java.util.Scanner;
public class Juego {
    public static void main(String[] args) {
        System.out.println("Ingresa un número entre 1 y 20");
        Scanner input = new Scanner(System.in);
        int numero = Integer.parseInt(input.nextLine());
        
        Random r = new Random();
        int randomNumber = r.nextInt(20)+1;
        if (randomNumber == numero) {
            System.out.println("You got it, the number was "+randomNumber);
        }
        else
        {
            System.out.println("Nope, u don't, the number was "+randomNumber);
        }
                
        
    }
}
