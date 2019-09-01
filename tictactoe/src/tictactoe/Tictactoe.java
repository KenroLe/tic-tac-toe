/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;
import java.util.Scanner;
/**
 *
 * @author Datanomi
 */
public class Tictactoe {

    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Modes: classic, threebythree");
        String input = sc.nextLine();

        switch (input) {
            case "classic": 
                ClassicMain classic = new ClassicMain();
                classic.Classicmain(args);
                break;
            case "threebythree":
                ThreeByThreeMain tbtm = new ThreeByThreeMain();
                tbtm.ThreeByThreemain(args);
                break;
        }
    }
}