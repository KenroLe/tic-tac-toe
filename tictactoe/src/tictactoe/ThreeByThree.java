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
public class ThreeByThree {
    Scanner sc = new Scanner(System.in);
    static int turn = 1;
    static int[][][]  table = {
        {{0,0,0},{0,0,0},{0,0,0}},//000
        {{0,0,0},{0,0,0},{0,0,0}},//000
        {{0,0,0},{0,0,0},{0,0,0}} //000
    };
    public void ThreeByThreeMain() {
        
    }
    void printTable() {
        for (int i=0;i < table.length; i++) {
            for (int j=0; j < table[i].length;j++) {
                for (int k = 0; k < table[i][j].length; k++) {
                    System.out.print(table[i][j][k]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    void setTable() {
        System.out.println("table");
        int z = sc.nextInt();
        System.out.println("Y coordinate");
        int y = sc.nextInt();
        System.out.println("X coordinate");
        int x = sc.nextInt();
        if (table[y][z][x] == 0){
            table[y][z][x]=turn;
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
