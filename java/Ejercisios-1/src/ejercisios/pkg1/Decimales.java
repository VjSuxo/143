/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercisios.pkg1;
import java.util.Scanner;

public class Decimales {
    public static boolean nroPrimo(int n){
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
        int casos;
        casos = lee.nextInt();
        for (int i=1;i<=casos;i++){ 
            int n = lee.nextInt();
            if (nroPrimo (n)){
                int p = 10;
                System.out.print(n+": ");
                   for(int j=0;j<40;j++){
                    int decimal = (int)Math.floor(p/n);
                    System.out.print(decimal+" ");
                    p = (int)(p - (decimal*n));
                    p*=10;
                }
                System.out.println("");
            }
            else{
                System.out.println(n+": -1");
            }
        }
    }
}
