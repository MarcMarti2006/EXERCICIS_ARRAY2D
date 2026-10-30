void main() {
    Scanner input = new Scanner(System.in);

    System.out.print("Filas: ");
    int filas = input.nextInt();

    System.out.print("Columnas: ");
    int columnas = input.nextInt();

    int[][] matriu = new int[filas][columnas];
    int[][] resultat = new int[3][columnas];

    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            System.out.println("Numero: ");
            matriu[i][j] = input.nextInt();
        }
    }

    for (int j = 0; j < columnas; j++) {
        int suma = 0;
        int max = matriu[0][j];
        int min = matriu[0][j];

        for (int i = 0; i < filas; i++) {
            suma += matriu[i][j];
            if (matriu[i][j] > max) {
                max = matriu[i][j];
            }
            if (matriu[i][j] < min) {
                min = matriu[i][j];
            }
        }
        resultat[0][j] = suma;
        resultat[1][j] = min;
        resultat[2][j] = max;
    }
}