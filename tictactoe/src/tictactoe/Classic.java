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
public class Classic{
    static int turn = 1;
    static int[][] table = {
        {0,0,0},
        {0,0,0},
        {0,0,0}
    };
    Scanner sc = new Scanner(System.in);
    
    void printTable() {
        
        for (int i=0;i < table.length; i++) {
            for (int j=0; j < table[i].length;j++) {
                System.out.print(table[i][j]);
            }
            System.out.println();
        }
    }
    void setTable() {
        System.out.println("Y coordinate");
        int y = sc.nextInt();
        System.out.println("X coordinate");
        int x = sc.nextInt();
        if (table[y][x] == 0){
            table[y][x]=turn;
        }
        if (turn == 1) {
            turn = 2;
        } else {
            turn = 1;
        }
    }
    void controller(String in) {
        switch (in) {
            case "print":printTable();break;
            case "set":setTable();break;
        }
    }
}
