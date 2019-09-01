/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import java.util.Scanner;
 
/**
 *
 * @author Kenro
 */
public class ClassicMain {
    void Classicmain(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean end = false;
        Classic player1 = new Classic();
        Classic player2 = new Classic();
        while (end != true) {
            switch (Classic.turn){
            case 1:
                System.out.println("player1: print, set");
                player1.controller(sc.nextLine());
                break;
            case 2:
                System.out.print("player2: print, set");
                player2.controller(sc.nextLine());
                break;
            }
        }
    }
}
