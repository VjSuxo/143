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
public class Televe {
    public void SOl(){
        Scanner sc = new Scanner(System.in);
        int n=0,m=0;
        //lee la cantidad de filas que tendra la matriz
        n=sc.nextInt();
        //lee la cantidad de columnoas que tendras la matriz
        m=sc.nextInt();
        //se instancia la matriz con los datos leidos n y m
        int[][] matriz = new int[n][m];
        //se usa i para moverse en las filas
        for (int i = 0; i < n; i++) {
            //se usa j para moverse en las columnas
            for (int j = 0; j < m; j++) {
                //aqui se llena los datos de la matriz
                matriz[i][j]=sc.nextInt();
            }
        }
        
        int x=0,suma=0;
        //
        for (int i = 0; i < m; i++) {
            for (int j = x; j < n; j++) {
                suma+=matriz[j][i];
            }
        }
        System.out.println(suma);
    
    }
    
}
