/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercisios.pkg1;

import static java.lang.Math.floor;
import java.util.Scanner;
public class Ejercisios1 {
   public static boolean primo(int n){
            int cont = 0;
            for (int i=1;i<=n;i++){
                if(n%i==0){
                    cont ++; 
                }
            }
            return cont ==2;
        }
        public static void main(String[] args) {
            Scanner lee = new Scanner(System.in);
            double   a=2,b=3;
            System.out.println((a+b));
        }


    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

    public static void Uno(){
    
        byte t;
        Scanner Scanner = new Scanner(System.in);
        t=Scanner.nextByte();
        for (byte i = 0; i < t; i++) {            
            byte n=Scanner.nextByte();
            byte[]a=new byte[n];
            for (byte j = 0; j < n; j++) {
                a[j]=Scanner.nextByte();               
            }
            for(byte j=0;j<n;j++){
                if((j+1)<n){
                    if(a[j]!=a[j+1]){
                        System.out.println("Primera "+a[j]+" !="+ a[j+1]);
                        
                        if((j-1)<=0){
                            System.out.println("j < n = "+(j+2)+" < "+n);
                            if((j+2)<n){
                                System.out.println("Segunda "+a[j]+" !="+ a[j+2]);
                                if(a[j]!=a[j+2]){
                                    System.out.println("Linea 36 p :"+j+" d"+a[j]);
                                    break;
                                    }
                                }
                                else{
                                    System.out.println("Linea 39 p :"+(j+1)+" d"+a[j+1]);
                                    break;
                                }
                            }
                        else{
                            System.out.println("Linea 43 p :"+(j+1)+" d"+a[j+1]);
                            break;
                            }    
                        }
                        
                    }
                }

            }
            
        }
        
        public static void Dos(){
            Scanner Scanner = new Scanner(System.in);
            byte t;
            t = Scanner.nextByte();
            byte HH=0,MM=0,SS=0;
            do{
                MM = Scanner.nextByte();
                SS = Scanner.nextByte();
            }while(!(MM>=00 && MM<=59 && SS>=00 && SS<=59));
            HH=MM;
            System.out.println(HH+":"+(60-SS)+":"+(60-SS));

        }


        

    }
    


    
    
