void main() {

    Scanner input = new Scanner(System.in);

    System.out.println("Introdueix numero de filas: ");
    int filas = input.nextInt();

    System.out.println("Introdueix numero de columnas: ");
    int columnas = input.nextInt();

    int[][] matriu = new int [filas][columnas];
    int[] suma = new int[columnas];

    for (int i = 0; i < filas; i++) {
        for (int j = 0; j < columnas; j++) {
            System.out.print("Número [" + i + "][" + j + "]: ");
            matriu[i][j] = input.nextInt();
        }
    }

    for (int j = 0; j < columnas; j++) {
        for (int i = 0; i < filas; i++) {
            suma[j] += matriu[i][j];
        }
    }
    System.out.println("Suma de cada columna:");
    for (int j = 0; j < columnas; j++) {
        System.out.print(suma[j] + " ");

}
}
