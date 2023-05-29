import java.util.*;

public class Pracownia {
    private static Map<Osoba,Komputer> przypisania = new HashMap<>();
    private static Scanner in = new Scanner(System.in);
    public void dodajKomputerDoUcznia(Uczen uczen, Komputer komputer){
        System.out.println("DODAWANIE KOMPUTERA DO UCZNIA");
        System.out.println("");
        System.out.println("Podaj imie:");
        String imie=in.nextLine();
        System.out.println("Podaj nazwisko:");
        String nazwisko=in.nextLine();
        System.out.println("Podaj PESEL:");
        String PESEL=in.nextLine();
        System.out.println("Podaj klase:");
        String klasa=in.nextLine();
        System.out.println("Podaj numer stanowiska:");
        int numer_komputera=in.nextInt();
        System.out.println("Podaj czy dziala:");
        boolean czydziala=in.nextBoolean();
        przypisania.put(new Uczen(imie,nazwisko,PESEL,klasa),new Komputer(numer_komputera,czydziala));
    }
    public void wyswietlPracownie(){
        System.out.println("WYSWIETLANIE PRACOWNI");
        System.out.println("");
        System.out.println("Podaj imie:");
        String imie=in.nextLine();
        System.out.println("Podaj nazwisko:");
        String nazwisko=in.nextLine();

        //tu powinno byc printowanie ale obsługa mapy przerosła
    }

}
