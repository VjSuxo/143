/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patito2;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author victo
 */
public class ProblemF_2241 {
    
    public void Solucion(){
        
        Scanner sc = new Scanner(System.in);
        int casos = sc.nextInt();
        double sp=0; 
        int[] datos = new int[casos+4];
        for (int i = 0; i < casos; i++) {
                datos[i]= sc.nextInt();
        }
        int a=0,b=0,c=0;
        for (int i = 0; i < casos; i+=3){   
           a=datos[i];
           b=datos[i+1];
           c=datos[i+2];
           sp=(double)(a+b+c)/2;
           double area=0;
           if(sp>=a && sp>=b && sp>=c){
                area =(double) Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
                System.out.println(String.format("%.6f", area));
            }
           else{
               System.out.println("No hay area");
           }
        }
        
    }
}
