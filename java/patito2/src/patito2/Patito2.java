/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patito2;

import java.util.Scanner;

/**
 *
 * @author victo
 */
public class Patito2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Scanner sc = new Scanner(System.in);
        long casos = sc.nextLong();
        float sp=0; 
        
        long[] datos = new long[casos*3];
        for (long i = 0; i < casos; i++) {
                datos[i]= sc.nextLong();
        }
        int a=0,b=0,c=0;
        for (long i = 0; i < casos; i+=3){               
           a=(int)datos[i];
           b=(int)datos[i+1];
           c=(int)datos[i+2];
           sp=(a+b+c)/2;
           float area=0;
           if(sp>=a && sp>=b && sp>=c){
                area =(float) Math.sqrt(sp*(sp-a)*(sp-b)*(sp-c));
                System.out.println(area);
            }
           else{
               System.out.println("No hay area");
           }
        }
        
        
    }
    
}
