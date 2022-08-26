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
public class ProblemaD_Four_Lotes {
 
    public static boolean esPrimo(int x){
        int cont=0;
        for (int i = 1; i <= x; i++) {
            if(x%i==0){
                cont++;
            }
        }
        if(cont==2){
            return true;
        }
        else{
            return false;
        }
    }
    
    public void Solucion(){
        int num=0;
        int con=0;
        int sum=0;
        Scanner sc= new Scanner(System.in);
        do{
            
            num = sc.nextInt();
            if(con==3){
                sum/=3;
                System.out.println(sum);
                con=0;
                sum=0;
            }
            if(esPrimo(num)){
                System.out.println("Primo :"+num);
                con++;
                sum=sum+num;
            }
            
        }while(num!=-1);
        
        

    
    
    }
    
}
