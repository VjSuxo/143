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
public class ProblemB_1012 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String x;
        x = leer.next();
        while(true){
        
            String aux2 = "";
            for (int i = 0; i < x.length(); i++) {
                aux2 = x.charAt(i)+aux2;
            }
            if(x.equals(aux2)){
                System.out.println(x);
            }else{
            String aux=convierte(x,aux2);
            System.out.println(aux);
        }x = leer.next();
            if(x.equals("END")){
                break;
            }
        }
        
    }
    
    
    public static String convierte(String x, String var)
    {
        String aux = x;
        String aux2= x.charAt(0)+"";
        System.out.println(x);
        for (int j = 1; j < aux.length(); j++) {
               if((var.substring(0,(aux.substring(j, aux.length())).length())).equals(aux.substring(j, aux.length())))
                {
                    aux2=aux+aux2;
                    return aux2;
                }
            
            aux2 =  x.charAt(j)+aux2;
        }
        return aux2;
    }
}

