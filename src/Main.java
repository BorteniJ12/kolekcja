public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        //tablica
        /*
        tablica musi mieć zdefiniowany rozmiar,
         którego potem nie można zmienić,
          tablica przechowuje typy proste i złożone
         */
        int [] tablicaLiczbLosowych = new int [6];
        //losujemy z zakresu 1 do 100
        for (int i = 0; i < tablicaLiczbLosowych.length; i++) {
            tablicaLiczbLosowych[i] = (int)(Math.random()*100);
        }
        //wypisywamoe tablicy na ekranie
        for (int element:tablicaLiczbLosowych) {
            System.out.print(element+", ");
        }

    }
}

