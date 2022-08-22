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
public class ProblemH_Matriz_ZigZag {
    public boolean ok(int x,int y,int n){
        if(x>=0&&x<n&&y>=0&&y<n){
            return true;
        }
        return false;
    }
    public void Solucion(){
        Scanner sc = new Scanner(System.in);
        int[] dx = {1,-1,0,1};
        int[] dy = {0,1,1,-1};
        int n=0;
        n = sc.nextInt();
        int[][]m = new int[110][110];
        int x=0,y=0;
        int num=1,pos=3;
        for (int i = 0; i < n*n; i++) {
            m[x][y]=num;
            num++;
            if(pos==0 || pos==2){
                pos=(pos+1%4);
            }
            int sigx = x+dx[pos];
            int sigy = y+dy[pos];
            if(i == (n * n) -1) {break;}
            
            while((ok(sigx, sigy, n)==false || m[sigx][sigy]!=0)){
                pos=(pos+1)%4;
                sigx=x+dx[pos];
                sigy=y+dy[pos];
            }
            x=sigx;
            y=sigy;
            
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(j==n-1){
                    System.out.println(m[i][j]);
                }
                else{
                    System.out.print(m[i][j]+" ");
                }
            }
        }
    }
    
}
