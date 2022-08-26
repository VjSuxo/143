
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
public class ProblemaJ_Combinacion {
    
    public static int[] Descomponer(int num,int tam){
        int[] x = new int[tam];
        int pos=0;
        while(num>0){
            int residuo = num%10;
            num/=10;
            x[pos]=residuo;
            pos++;
        }
        return x;
    }
    
    public static int Mayor(int num){
        if(num<0)
            return num*-1;
        return num;
    }
    
    public void Solucion(){

        Scanner sc = new Scanner(System.in);
        int cantidad  = sc.nextInt();
        String estado = sc.next();
        String codigo = sc.next();
        int sum =0;
        
        for (int i = 0; i < cantidad; i++) {
            int x = Integer.parseInt(estado.substring(i,i+1));
            int y =  Integer.parseInt(codigo.substring(i,i+1));
            int num = x-y;
            if(Mayor(num)>5){
                num=10-Mayor(num);
            }
            sum+=Mayor(num);
        }
        System.out.println(sum);
        
    }   
}
