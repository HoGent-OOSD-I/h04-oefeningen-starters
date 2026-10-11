void main() {
    berekenGemiddeldeVanGetallenInTweedimensionaleArray();
}

private void berekenGemiddeldeVanGetallenInTweedimensionaleArray() {
    double getallenMatrix[][] = new double[3][2]; // 3 rijen, 2 kolommen

    // TODO 1 - Maak gebruik van de onderstaande methode geefElement
    // om een waarde op te vragen en toe te kennen aan elk element van
    // getallenMatrix.


    // TODO 2 - Maak gebruik van een enhanced for lus om alle elementen van
    // getallenMatrix te overlopen. Maak de som van alle getallen en
    // tel hoeveel getallen er in getallenMatrix zitten zodat je het
    // gemiddelde kan berekenen en uitvoeren naar de console.

}

private double geefElement(int rij, int kolom) {
    String invoer = IO.readln("Geef getal op rij " + rij + " en kolom " + kolom + ": ").replace(",", ".");
    return Double.parseDouble(invoer);
}
