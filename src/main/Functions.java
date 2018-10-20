package main;

import java.util.Random;
import java.util.Scanner;

 public class Functions {

     private static Scanner scan =  new Scanner(System.in);
     private static Random rand = new Random();















     public int[] do_macierz(int x ){

      int[] tablica = new int[x];

       for(int i =0; i < tablica.length; i++){

         int n;



           tablica[i] =  this.rand.nextInt(10) +  1;

       }

      return tablica;
     }



     public int[][] do_macierz( int x , int y){

       int[][] macierz = new int[x][y];

      for(int i =0; i < macierz.length; i++){

         for(int j = 0; j < macierz[i].length; j++ ){

             System.out.println("Podaj wartości na pozycji : " + i + ", " + j);
              int   n = this.scan.nextInt();

             macierz[i][j] = n;
         }


      }

     return macierz;
    }



    public void sprawdz(int[] macierz ){

         int wynik = 0 ;


     for(int i= 0; i < macierz.length -1; i++){

        if(macierz[0] > macierz[i] ){

           wynik = macierz[i];

        }

     }

     System.out.println("Najmniejsza wartość z tabeli  " + "to =" +  wynik);

     for (int i = 0; i < macierz.length -1; i++ ){


          if(macierz[0] < macierz[i] ){
            wynik = macierz[i];

          }

     }

        System.out.println("Najwieksza  wartość z tabeli  "   + "to =" +  wynik);

     }



     public double srednia(int[] macierz){

         int suma = 0;
       double wynik = 0;
         int srednia =  macierz.length - 1 ;

        for(int i = 0; i < macierz.length -1 ; i++){

         suma = suma + macierz[i];

        }
        wynik = (double) suma / srednia;

        return wynik;
     }




     public void show_macierz(int[] macierz ){


         for(int i = 0; i < macierz.length -1; i++ ){

             System.out.println(macierz[i]);

         }

     }



     public void show_macierz(int[][] macierz ){


         for(int i = 0; i < macierz.length -1; i++ ){

             for(int j =0; i < macierz[i].length -1 ; j++){

                 System.out.println(macierz[i][j]);

             }

         }

     }




     public void srednia_couter(int[] macierz , double srednia){

         int[] macierze_w = new int[5];

         int[] macierze_n = new int[5];


        for (int i = 0; i < macierz.length -1; i++ ){

          if(srednia > macierz[i]){
            macierze_n[i] = macierz[i];

          }
          else if(srednia < macierz[i]){

              macierze_w[i] = macierz[i];


          }
        }
        for(int i= 0; i < macierz.length; i++){
            System.out.print("Mniejsze liczby od twojej sredniej to : " + macierze_n[i] +" ");
        }
         for(int i= 0; i < macierz.length; i++){
             System.out.println("Wieksze liczby od twojej sredniej to : " + macierze_w[i]);
         }


     }


     public void  odwrotna_kolejnosc(int[] macierz){

        for(int i = macierz.length -1 ; i >= 0; i-- ){

            System.out.println("Odwrotna kolejność : " + macierz[i]);

        }




     }


     public void sprawdz(int[][] a){




             int wynik = 0 ;


             for(int i= a.length  ; i > 0    ; i--){

                 for(int j = a[i].length - 1  ; j > 0  ; j--) {

                     if(wynik > a[i][j] ){

                         wynik = a[i][j];

                     }


                 }

             }

             System.out.println("Najwieksza wartość z tabeli  " + "to =" +  wynik);

             for (int i = 0; i < a.length -1 ; i++ ){

                 for(int j = 0; i < a[j].length -1  ; j++) {

                     if(a[0][0] < a[i][j] ){

                         wynik = a[i][j];

                     }


                 }


             }

             System.out.println("Najmniejsza  wartość z tabeli  "   + "to =" +  wynik);

     }





     public void  binary( int n  ){

         int[] tabela =  new int[32];


        System.out.println("Wynik =");
        while(n > 0 ){
            String x= "";
              int k  = 0;

            int a = n%2;

             x = a + x;

              n = n / 2;

           System.out.print(x);
        }




     }




     public int[][] dodawanie(int[][] a,int[][] b){

       int[][] wynik = new int[a.length][a[0].length];

       for(int i = 0; i < a.length; i++ ){

         for(int j = 0; j < a[i].length; j++){

            wynik[i][j] = a[i][j] + b[i][j];

         }

       }


       return wynik;
     }







 }
