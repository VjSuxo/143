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
public class ProblemaH_Generar2Numeros {
    
    
    public static int[] burbuja(int[] A,int indice) {
        int i, j, aux;
        for (i = 0; i < indice - 1; i++) {
            for (j = 0; j < indice - i - 1; j++) {                                                              
                if (A[j + 1] < A[j]) {
                    aux = A[j + 1];
                    A[j + 1] = A[j];
                    A[j] = aux;
                }
            }
        }
        return A;
    }
    
    static int[] par;
    static int indice=0;    
    static int[] impar;
    static int indiceImpar=0;
    
    public static void Descomp(int x){
        while(x>0){
            int mod = x%10;
            x=x/10;            
            
            if(mod%2==0 || mod==0){
                par[indice]=mod;
                indice++;
            }
            else{
                impar[indiceImpar]=mod;
                indiceImpar++;
            }
            
        }        
    
    }
    
    
    
    public void Solucion(){
    
        Scanner sc = new Scanner(System.in);
        
        int x = sc.nextInt();        
        int y = sc.nextInt();
        String tamX = String.valueOf(x);
        String tamy = String.valueOf(y);
        par = new int[Integer.parseInt(tamX)+Integer.parseInt(tamy)];
        impar = new int[Integer.parseInt(tamy)+Integer.parseInt(tamX)];
        //descompo de numeros
        Descomp(x);
        Descomp(y);        
        par = burbuja(par,indice);
        impar = burbuja(impar,indiceImpar);        
        for (int i = 0; i < indice; i++) {
            System.out.print(par[i]);
        }
        System.out.println("");
        System.out.println("");
        for (int i = 0; i < indiceImpar; i++) {
            System.out.print(impar[i]);
        }
        System.out.println("INdice :"+indice+"--"+par[indice]);
        System.out.println("Impart :"+indiceImpar+"--"+impar[indiceImpar]);
        
        
        for (int i = indice-1; i >=0; i--) {
            System.out.print(par[i]);
        }
        System.out.print(" ");
        for (int i = indiceImpar-1; i >=0; i--) {
            System.out.print(impar[i]);   
        }
        indice=0;
        indiceImpar=0;
    }
}
