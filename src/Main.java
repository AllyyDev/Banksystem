import java.awt.*;
import java.util.Stack;
import java.util.Queue;
import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {

        // Input-Funktion erstellen:
        Scanner myobj = new Scanner(System.in);

        // 2d Array erstellt für die Daten wie, Name, Konto Nr. etc...
        String[][] bank = new String[3][4];
        int[] sicherheit = new int[3];

        // Kunde: name Geizig, KontoNr. 1, Kontostand 0$
        bank[0][0] = "Geizig";
        bank[0][1] = "1";
        bank[0][2] = "0";
        sicherheit[0] = 2376;

        // Kunde: name Grummel, KontoNr. 80, Kontostand 100$
        bank[1][0] = "Grummel";
        bank[1][1] = "80";
        bank[1][2] = "100";
        sicherheit[1] = 5621;

        // Kunde: name Kauzig, KontoNr. 140, Kontostand 2009$
        bank[2][0] = "Kauzig";
        bank[2][1] = "140";
        bank[2][2] = "2009";
        sicherheit[2] = 4298;

        System.out.println("Guten Tag! Geben Sie Ihren Namen ein:");

        // Input-Variablen:
        String name = myobj.nextLine();

        if(name.equals("Geizig")) {
            System.out.println("Hallo Herr " + name + " , geben Sie Ihren Passwort ein");
            int passwort = myobj.nextInt();
            System.out.println("Passwort: " + passwort);
            if(name.equals("Geizig") && passwort == sicherheit[0]) {
                System.out.println("Name: " + bank[0][0]);
                System.out.println("Kontonummer: " + bank[0][1]);
                System.out.println("Kontostand: " + bank[0][2] + "$");
            }else {
                System.out.println("Ihr Passwort ist falsch! Ihr Konto ist gesperrt!");
            }
        } else if (name.equals("Grummel")) {
            System.out.println("Hallo Herr " + name + " , geben Sie Ihren Passwort ein");
            int passwort = myobj.nextInt();
            System.out.println("Passwort: " + passwort);
            if(name.equals("Grummel") && passwort == sicherheit[1]) {
                System.out.println("Name: " + bank[1][0]);
                System.out.println("Kontonummer: " + bank[1][1]);
                System.out.println("Kontostand: " + bank[1][2] + "$");
            } else {
                System.out.println("Ihr Passwort ist falsch! Ihr Konto ist gesperrt!");
            }
        } else if (name.equals("Kauzig")) {
            System.out.println("Hallo Herr " + name + " , geben Sie Ihren Passwort ein");
            int passwort = myobj.nextInt();
            System.out.println("Passwort: " + passwort);
            if(name.equals("Kauzig") && passwort == sicherheit[2]) {
                System.out.println("Name: " + bank[2][0]);
                System.out.println("Kontonummer: " + bank[2][1]);
                System.out.println("Kontostand: " + bank[2][2] + "$");
            } else {
                System.out.println("Ihr Passwort ist falsch! Ihr Konto ist gesperrt!");
            }
        } else {
            System.out.println("Diesen Kundenname gibt existiert nicht!");
        }

    }
}