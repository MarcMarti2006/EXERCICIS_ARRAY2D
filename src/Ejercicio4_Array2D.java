void main() {
        char[][] matriu = new char[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i == j || i + j == 4) {
                    matriu[i][j] = 'X';
                } else {
                    matriu[i][j] = ' ';
                }
                System.out.print(matriu[i][j] + " ");
            }
            System.out.println();
        }
}