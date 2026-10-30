void main() {
    Scanner input = new Scanner(System.in);

    System.out.print("Filas: ");
    int filas = input.nextInt();
    System.out.print("Columnas: ");
    int columnas = input.nextInt();

    int[][] matriz = new int[filas][columnas];
    int[][] resultat = new int[3][columnas];

    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            System.out.println("Numero:");
            matriz[i][j] = input.nextInt();
        }
    }

    for (int j = 0; j < columnas; j++) {
        int suma = 0;
        int max = matriz[0][j];
        int min = matriz[0][j];

        for (int i = 0; i < filas; i++) {
            suma += matriz[i][j];

            if (matriz[i][j] > max) {
                max = matriz[i][j];
            }
            if (matriz[i][j] < min) {
                min = matriz[i][j];
            }
        }

        resultat[0][j] = suma;
        resultat[1][j] = max;
        resultat[2][j] = min;
    }

    System.out.println("suma:");
    for (int j = 0; j < columnas; j++) {
        System.out.print(resultat[0][j] + " ");
    }

    System.out.println("\nMáximos:");
    for (int j = 0; j < columnas; j++) {
        System.out.print(resultat[1][j] + " ");
    }

    System.out.println("\nMínimos:");
    for (int j = 0; j < columnas; j++) {
        System.out.print(resultat[2][j] + " ");
    }
}