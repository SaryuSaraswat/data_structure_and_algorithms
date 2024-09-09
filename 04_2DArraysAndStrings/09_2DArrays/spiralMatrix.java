class spiralMatrix {
    public static void spiralOrder(int[][] matrix) {

        // int startRow = 0;
        // int endRow = matrix.length - 1;
        // int startCol = 0;
        // int endCol = matrix[0].length - 1;
        
        // while (startRow <= endRow && startCol <= endCol) {
        // for(int j = startCol; j <= endCol; j++){
        //     System.out.print(matrix[startRow][j] + " ");
        // }
        // startRow++;

        // for(int i = startRow +1; i <= endRow; i++){
        //     System.out.print(matrix[i][endCol] + " ");
        // }
        // endCol--;
        
        // if(startRow == endRow){
        //     for(int j = endCol - 1; j >= startCol; j--){
        //         System.out.print(matrix[endRow][j] + " ");
        //     }
        //     endRow--;
        // }
        
        // if(startCol == endCol){
        //     for(int i = endRow - 1; i >= startRow; i--){
        //         System.out.print(matrix[i][startCol] + " ");
        //     }
        //     startCol++;
        // }
        // }
        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {
            // Traverse the top row
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            startRow++;

            // Traverse the right column
            for (int i = startRow; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            endCol--;

            // Traverse the bottom row
            if (startRow <= endRow) {
                for (int j = endCol; j >= startCol; j--) {
                    System.out.print(matrix[endRow][j] + " ");
                }
                endRow--;
            }

            // Traverse the left column
            if (startCol <= endCol) {
                for (int i = endRow; i >= startRow; i--) {
                    System.out.print(matrix[i][startCol] + " ");
                }
                startCol++;
            }
        }
    }

    public static void main(String [] args){
        int [][] matrix = {{1,2,3},{4,5,6},{7,8,9}};
        spiralOrder(matrix);
    }
}