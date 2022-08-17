#include<iostream>
#include <cmath>
#include <stdio.h>
#include <math.h>
using namespace std;

bool primo(int n){
 int cont = 0;
 for (int i=1;i<=n;i++) {
  if (n % i == 0) {
      cont++;
  }
 }
 return cont == 2;
}

int main(){
    int caso;
    cin>>caso;
    for (int i = 1; i <= caso; i++) {
                int numero;
                cin>>numero;
                if (primo(numero))
                {
                    int p = 10;
                    cout<<numero<<": ";
                    for (int j = 1; j <= 40; j++)
                    {
                        int dec=floor(p / numero);
                        cout<<floor(p / numero)<<" ";
                        p = p - (dec * numero);
                        p *= 10;
                    }

                }
                else {
                    cout<<numero<<": -1";
                }
                cout<<endl;
            }
    return 0;
}
