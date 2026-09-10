package cui;

import domein.Parking;

public class ParkingApp {

    void main() {
        simuleerParking();
    }

    private void simuleerParking() {
        Parking parking = new Parking();
        int keuze = geefMenuKeuze();
        while (keuze != 3) {
            switch (keuze) {
                case 1 -> parkeer(parking);
                case 2 -> verlaat(parking);
            }
            toonOverzichtParking(parking);
            keuze = geefMenuKeuze();
        }
    }

    private void parkeer(Parking parking) {
        // TODO
    }

    private void verlaat(Parking parking) {
        // TODO
    }

    private void toonOverzichtParking(Parking parking) {
        int vrijePlaatsen = parking.geefAantalVrijePlaatsen();
        IO.println(String.format("%n%18s=== PARKING (%d vrije plaats%s) ===%n%s%n", "", vrijePlaatsen,
                vrijePlaatsen == 1 ? "" : "en", parking));
    }

    private int geefMenuKeuze() {
        boolean geldigeInvoer;
        int keuze;
        do {
            keuze = Integer.parseInt(IO.readln("1. Parkeer\n2. Verlaat parking\n3. Stop\nGeef je keuze op: "));
            geldigeInvoer = keuze >= 1 && keuze <= 3;
            if (!geldigeInvoer)
                IO.println("Enkel 1, 2 of 3 zijn geldig...");
        } while (!geldigeInvoer);
        return keuze;
    }

    private String geefNummerplaat() {
        boolean geldigeInvoer;
        String nummerplaat;
        do {
            IO.print("Geef de nummerplaat in > ");
            nummerplaat = IO.readln();
            geldigeInvoer = nummerplaat.length() >= 3 && nummerplaat.length() <= 9;
            if (!geldigeInvoer)
                IO.println("Een geldige nummerplaat bevat 3 tot 9 karakters...");
        } while (!geldigeInvoer);
        return nummerplaat;
    }
}
