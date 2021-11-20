import java.util.Scanner;
// Online IDE - Code Editor, Compiler, Interpreter
class Sklep {
    double[] ceny = {1,2,3,4,5,6,7,8,9,10};
    String[] nazwy = {"a", "b","c","d","e","f","g","h","i","j"};
    int szukaj(String produkt) {
        int index = -1;
        for (int i=0; i<nazwy.length; i++) {
            if (nazwy[i].equals(produkt)) {
                index = i;
                break;
            }
        }
        return index;
    }
    void dostepne() {
        for (int i=0; i<ceny.length; i++) {
            System.out.printf("nazwa: %s, cena: %.2f\n", nazwy[i], ceny[i]);
        }
    }
    void zmienCene(int id, double cena) {
        ceny[id] = cena;
    }
    void zmienNazwe(int id, String nazwa) {
        nazwy[id] = nazwa;
    }
    
}
public class Main
{
    public static void main(String[] args) {
        Sklep sklep = new Sklep();
        System.out.println(sklep.szukaj("l"));
        sklep.dostepne();
        Scanner sc = new Scanner(System.in);
        while(true) {
            String polec = sc.next();
            if (polec.equals("opusc")) break;
            switch(polec) {
                case "szukaj":
                    String nazwa = sc.next();
                    System.out.println(nazwa);
                    System.out.println(sklep.szukaj(nazwa));
                    break;
                case "dostepne":
                    sklep.dostepne();
                    break;
                case "zmienCene":
                    int ind = sc.nextInt();
                    double cena = sc.nextDouble();
                    sklep.zmienCene(ind, cena);
                    break;
                case "zmienNazwe":
                    int ind2 = sc.nextInt();
                    String nazwa2 = sc.next();
                    sklep.zmienNazwe(ind2, nazwa2);
                    break;
                default:
                    System.out.println("niepoprawna komenda");
                    break;
            }
            
        }
    }
}
