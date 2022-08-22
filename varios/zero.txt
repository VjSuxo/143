#include<iostream>
#include <algorithm>
using namespace std;
int acc[200010][18];
void init(){
    for (int j = 0; j < 18;j++) {
            int suma = 0;
            for (int i = 1; i < 200010; i++) {
                if((i&(1<<j))>0){
                    suma+=1;
                }
                acc[i][j]=suma;
            }
        }
}

int main(){
    int t;
    cin>>t;
        init();

        while(t-->0){
            int l;
            cin>>l;
            int r;
            cin>>r;
            int ans=0;
            for (int i = 0; i < 18; i++) {
                ans=max(ans,acc[r][i]-acc[l-1][i]);
            }
            cout<<(((r-l+1)-ans))<<endl;

        }
}
