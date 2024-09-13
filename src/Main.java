import com.sun.jdi.IntegerValue;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //tablica
        /*
        tablica musi mieć zdefiniowany rozmiar,
         którego potem nie można zmienić,
          tablica przechowuje typy proste i złożone
         */
        int[] tablicaLiczbLosowych = new int[6];
        //losujemy z zakresu 1 do 100
        for (int i = 0; i < tablicaLiczbLosowych.length; i++) {
            tablicaLiczbLosowych[i] = (int) (Math.random() * 100);
        }
        //wypisywamoe tablicy na ekranie
        for (int element : tablicaLiczbLosowych) {
            System.out.print(element + ", ");
        }
//wypełnianie kolekcji wartościami losowymi
        /*
        Kolekcja może przechowywać tylko typy złożone
        np. Integer
        Kolekcja nie musi mieć zdefiniowanego rozmiar
        rozmiar może się zmieniać w trakcie
        List -> ArrayList, LinkedList,
        Set -> HashSet
        Map
         */

        List<Integer> listaLiczbLosowych = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            int liczba = (int) (Math.random() * 100);
            listaLiczbLosowych.add(liczba);
        }
        System.out.println("tablicaLiczbLosowych");
        for (Integer element : listaLiczbLosowych) {
            System.out.print(element + ", ");
        }
        System.out.println(listaLiczbLosowych);
        //losowanie do listy bez powtórzeń
        ArrayList<Integer> listaLosowychBezPowtórzeń = new ArrayList<>();
        int liczba;
        for (int i = 0; i < 6; i++) {
            liczba = (int)(Math.random()*100+1);
            while (listaLosowychBezPowtórzeń.contains(liczba)){
                liczba = (int)(Math.random()*100+1);
            }


            listaLosowychBezPowtórzeń.add(liczba);

        }
        System.out.println(listaLosowychBezPowtórzeń);
        /*
        lista:
        indeksowana, uporządkowana, elementy mogą się powtarzać
        zbiór: (zazwyczaj)
        nieindeksowana, nieuporządkowane, elementy unikatowe
         */
        HashSet <Integer> zbiorLiczbLosowych = new HashSet<>();
        while (zbiorLiczbLosowych.size()<6){
            liczba = (int)(Math.random()*100+1);
            zbiorLiczbLosowych.add(liczba);
        }
        System.out.println("Zbior liczb losowych");
                System.out.println(zbiorLiczbLosowych);


                //lista liczb wczytywanych z klawiatury
        Scanner klawiatura = new Scanner(System.in);
        LinkedList<Integer> listaLiczbZKlawiatury = new Linkedlist<>();
        System.out.println("Podaj 6 liczb");
        for (int i = 0; i <6 ; i++) {
            int wartosc = klawiatura.nextInt();
            listaLiczbZKlawiatury.add(wartosc);


        }
        //wstawianie
        LinkedList<Integer> wpisane = new LinkedList<>();
        S


        //trafione czyli takie które są i we wpisanych i w wylosowanych
        for (Integer element:listaLosowychBezPowtórzeń) {
       if(listaLiczbZKlawiatury)
        }


     }

}

