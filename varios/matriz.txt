#include<iostream>
#include<bits/stdc++.h>
using namespace std;

bool ok(int x,int y,int n){
        if(x>=0&&x<n&&y>=0&&y<n){
            return true;
        }
        return false;
    }

int main(){

    int dx[] = {1,-1,0,1};
        int dy[] = {0,1,1,-1};
        int n=0;
        cin>>n;
        int m[110][110];
        int x=0,y=0;
        int num=1,pos=3;
        for (int i = 0; i < n*n; i++) {
            m[x][y]=num;
            num++;
            if(pos==0 || pos==2){
                pos=(pos+1)%4;
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
                    cout<<m[i][j];
                }
                else{
                    cout<<m[i][j]<<" ";
                }
            }
            cout<<endl;
        }



    return 0;
}
