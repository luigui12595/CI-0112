class MaxPooling {
    public int[][] maxPooling(int[][] capa, int filtroSize) {
        int rows = capa.length - filtroSize + 1;
        int cols = capa[0].length - filtroSize + 1;
        int[][] resultado = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                int max = Integer.MIN_VALUE;
                for (int x = 0; x < filtroSize; x++) {
                    for (int y = 0; y < filtroSize; y++) {
                        max = Math.max(max, capa[i + x][j + y]);
                    }
                }
                resultado[i][j] = max;
            }
        }

        return resultado;
    }
}
