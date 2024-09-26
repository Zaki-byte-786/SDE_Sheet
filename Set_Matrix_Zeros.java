public class Set_Matrix_Zeros {
    // when matrix have 0 and 1

//    static void setZeroes(int[][] array) {
//        int row = array.length;
//        int col = array[0].length;
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                if (array[i][j] == 0){
//                    for (int k = 0; k < row; k++) {
//                        if (array[k][j] == 1)array[k][j] = -1;
//                    }
//                    for (int k = 0; k < col; k++) {
//                        if (array[i][k] == 1)array[i][k] = -1;
//                    }
//                }
//            }
//        }
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                if (array[i][j] == -1)array[i][j] = 0;
//            }
//        }
//    }


    // when matrix elements lie among Integer range

    // brute

//    SC->O(M*N)


//    static void setZeroes(int[][] array){
//            int row = array.length;
//       int col = array[0].length;
//       int[][] copy = new int[row][col];
//       for (int i = 0; i < row; i++) {
//           for (int j = 0; j < col; j++) {
//               copy[i][j] = array[i][j];
//           }
//       }
//       for (int i = 0; i < row; i++) {
//           for (int j = 0; j < col; j++) {
//               if (copy[i][j] == 0){
//                   for (int k = 0; k < row; k++) {
//                       array[k][j] = 0;
//                   }
//                   for (int k = 0; k < col; k++) {
//                       array[i][k] = 0;
//                   }
//               }
//           }
//       }
//    }


    // better


//SC -> O(M+N)


//    static void setZeroes(int[][] array) {
//        int row = array.length;
//        int col = array[0].length;
//        int[] rowTrack = new int[row];
//        int[] colTrack = new int[col];
//        for (int i = 0; i < row; i++) {
//            for (int j = 0; j < col; j++) {
//                if (array[i][j] == 0){
//                    rowTrack[i] = 1;
//                    colTrack[j] = 1;
//                }
//            }
//            }
//        for (int i = 0; i < row; i++) {
//            if (rowTrack[i] == 1){
//                for (int k = 0; k < col; k++) {
//                    array[i][k] = 0;
//                }
//            }
//        }
//        for (int j = 0; j < col; j++) {
//            if (colTrack[j] == 1){
//                for (int k = 0; k < row; k++) {
//                    array[k][j] = 0;
//                }
//            }
//        }
//    }

// best
// SC -> O(1)
    static void setZeroes(int[][] array) {
        int row = array.length;
        int col = array[0].length;
        boolean firstRowDetect = false;
        boolean firstColumnDetect = false;
        for(int i = 0;i < row;i++){
            if(array[i][0] == 0){
            firstColumnDetect = true;
           break;
        }
   }
        for(int j = 0;j < col;j++){
            if(array[0][j] == 0){
                firstRowDetect = true;
                break;
            }
        }
        for(int i = 1;i < row;i++){
            for(int j = 1;j < col;j++){
                if(array[i][j] == 0){
                    array[i][0] = 0;
                    array[0][j] = 0;
                }
            }
        }
        for(int i = 1;i < row;i++){
            if(array[i][0] == 0)for(int k = 1;k < col;k++)array[i][k] = 0;
        }
        for(int j = 1;j < col;j++){
            if(array[0][j] == 0)for(int k = 1;k < row;k++)array[k][j] = 0;
        }
        if(firstRowDetect)for(int j = 0;j < col;j++)array[0][j] = 0;
        if(firstColumnDetect)for(int i = 0;i < row;i++)array[i][0] = 0;
    }
    public static void main(String[] args) {
    }
}
