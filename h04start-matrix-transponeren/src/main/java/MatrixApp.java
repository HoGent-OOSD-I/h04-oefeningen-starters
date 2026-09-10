void main() {
    maakEnTransponeerMatrix();
}

private void maakEnTransponeerMatrix() {
    // Maak matrix
    SecureRandom sr = new SecureRandom();
    int[][] matrix = new int[sr.nextInt(1, 5)][sr.nextInt(1, 5)];
    for (int rij = 0; rij < matrix.length; rij++) {
        for (int kolom = 0; kolom < matrix[rij].length; kolom++) {
            matrix[rij][kolom] = sr.nextInt(101);
        }
    }

    // Toon matrix
    IO.println("Matrix:");
    toonMatrix(matrix);

    // TODO - Hier aanvullen!
    int[][] getransponeerdeMatrix = null;

    // Toon getransponeerdeMatrix
    IO.println("\nGetransponeerde matrix:");
    toonMatrix(getransponeerdeMatrix);
}

private void toonMatrix(int[][] matrix) {
    for (int[] rij : matrix) {
        for (int getal : rij) {
            IO.print(String.format("%5d", getal));
        }
        IO.println();
    }
}


