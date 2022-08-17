/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patito1;

import java.util.Scanner;
public class Patito1 {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        String cs=Scanner.next();
        String[] v =cs.split(" ");
        
        
                for (int i = 0; i < v.length; i++) {
            for (int j = 0; j < v[i].length(); j++) {
                String p = v[i].toLowerCase();
                if(p.charAt(j)=='o'){
                    System.out.println(v[i].substring(0, v[i].length()-1));
                    break;
                }
            }
           
        }
        
    }
    
}
