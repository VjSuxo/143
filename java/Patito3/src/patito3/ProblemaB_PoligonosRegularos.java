/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patito3;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class ProblemaB_PoligonosRegularos {
    
    public void Solucion(){
    
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        for (int i = 0; i < casos; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a%b==0){
                System.out.println("SI");
            }
            else{
                System.out.println("NO");
            }
        }
        
    }
    
    
}
