using System;

namespace Patito_1
{
    class Program
    {
        static bool Primo(int n) {
            int cont = 0;
            for (int i=1;i<=n;i++) {
                if (n % i == 0) {
                    cont++;
                }
            }
            return cont == 2;
        } 

        static void Main(string[] args)
        {            
            int caso = int.Parse(Console.ReadLine());
            for (int i = 1; i <= caso; i++) {
                int numero = int.Parse(Console.ReadLine());
                if (Primo(numero))
                {
                    int p = 10;
                    Console.Write(numero + ": ");
                    for (int j = 1; j <= 40; j++)
                    {
                        int dec = (int)Math.Floor((double)p / numero);
                        Console.Write(dec + " ");
                        p = (int)(p - (dec * numero));
                        p *= 10;
                    }
                    Console.WriteLine("");
                }
                else {
                    Console.WriteLine(numero + ": -1");
                }
            }

        }
    }
}
