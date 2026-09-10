void main() {
    toonMaandenMetUitgavenBovenGemiddelde();
}

private void toonMaandenMetUitgavenBovenGemiddelde() {
    String result = "";
    double m1, m2, m3, m4, m5, m6, m7, m8, m9, m10, m11, m12;

    String invoer = IO.readln("Geef de uitgaven in voor maand 1: ");
    m1 = Double.parseDouble(invoer.replace(",", "."));
    invoer = IO.readln("Geef de uitgaven in voor maand 2: ");
    m2 = Double.parseDouble(invoer.replace(",", "."));
    ;
    invoer = IO.readln("Geef de uitgaven in voor maand 3: ");
    m3 = Double.parseDouble(invoer.replace(",", "."));
    ;
    invoer = IO.readln("Geef de uitgaven in voor maand 4: ");
    m4 = Double.parseDouble(invoer.replace(",", "."));
    ;
    invoer = IO.readln("Geef de uitgaven in voor maand 5: ");
    m5 = Double.parseDouble(invoer.replace(",", "."));
    ;
    invoer = IO.readln("Geef de uitgaven in voor maand 6: ");
    m6 = Double.parseDouble(invoer.replace(",", "."));
    ;
    invoer = IO.readln("Geef de uitgaven in voor maand 7: ");
    m7 = Double.parseDouble(invoer.replace(",", "."));
    ;
    invoer = IO.readln("Geef de uitgaven in voor maand 8: ");
    m8 = Double.parseDouble(invoer.replace(",", "."));
    ;
    invoer = IO.readln("Geef de uitgaven in voor maand 9: ");
    m9 = Double.parseDouble(invoer.replace(",", "."));
    ;
    invoer = IO.readln("Geef de uitgaven in voor maand 10: ");
    m10 = Double.parseDouble(invoer.replace(",", "."));
    ;
    invoer = IO.readln("Geef de uitgaven in voor maand 11: ");
    m11 = Double.parseDouble(invoer.replace(",", "."));
    ;
    invoer = IO.readln("Geef de uitgaven in voor maand 12: ");
    m12 = Double.parseDouble(invoer.replace(",", "."));
    ;

    double gem = (m1 + m2 + m3 + m4 + m5 + m6 + m7 + m8 + m9 + m10 + m11 + m12) / 12;

    if (m1 > gem) {
        result += "1 ";
    }
    if (m2 > gem) {
        result += "2 ";
    }
    if (m3 > gem) {
        result += "3 ";
    }
    if (m4 > gem) {
        result += "4 ";
    }
    if (m5 > gem) {
        result += "5 ";
    }
    if (m6 > gem) {
        result += "6 ";
    }
    if (m7 > gem) {
        result += "7 ";
    }
    if (m8 > gem) {
        result += "8 ";
    }
    if (m9 > gem) {
        result += "9 ";
    }
    if (m10 > gem) {
        result += "10 ";
    }
    if (m11 > gem) {
        result += "11 ";
    }
    if (m12 > gem) {
        result += "12 ";
    }

    if (!result.isEmpty())
        IO.println("In de volgende maanden werd er meer uitgegeven dan het gemiddelde: " + result);
    else
        IO.println("Geen maanden gevonden waarin meer werd uitgegeven dan het gemiddelde!");
}

