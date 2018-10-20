package Zadania;

import main.Functions;

import java.util.Scanner;

public class Zadania {





        public void  Zad_1(){

            Functions f = new Functions();

           int[] macierz_a = f.do_macierz(5);

            f.show_macierz(macierz_a);

           f.sprawdz(macierz_a);

            double srednia =  f.srednia(macierz_a);

           System.out.println("Srednia : " + srednia  );
           f.srednia_couter(macierz_a,srednia);

           f.odwrotna_kolejnosc(macierz_a);
        }



    public void Zad_2(){


           Functions f = new Functions();

          int[] liczby =  f.do_macierz(20);

           int[] wynik =   new int[11];


         f.show_macierz(liczby);


           for( int i = 0; i < liczby.length -1; i++){




             wynik[liczby[i]]++;

         }




         for(int i = 1; i < wynik.length  ; i++){


             System.out.println( i+ " -> " + wynik[i]);
         }

    }




    public void Zad_3(){

      Functions f = new Functions();

      int[][] macierz_A = f.do_macierz(2,2);

      f.sprawdz(macierz_A);



    }



    public void Zad_4(){

        System.out.println("Podaj liczbę :");


        Scanner scan = new Scanner(System.in);

         int n = scan.nextInt();

        System.out.println("Liczba " + n );

        Functions f = new Functions();


          f.binary(n);


    }




 }

