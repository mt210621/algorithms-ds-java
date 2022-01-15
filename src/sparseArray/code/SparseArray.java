package sparseArray.code;

public class SparseArray {
    public static void main(String[] args) {
        // 创建一个原始的二维数组 11 * 11
        // 0 表示没有棋子，1表示黑子 2 表示蓝子
        int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        // 输出原始的二维数组
        System.out.println("原始的二维数组---->");
        for (int[] row : chessArr1){
            for (int data: row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        // 将二维数组转稀疏数组
        // 1 先遍历原始二维数组 得到非0的数据的个数
        int sum = 0;
        for (int i=0;i<11;i++){
            for (int j=0;j<11;j++){
                if (chessArr1[i][j] != 0){
                    sum++;
                }
            }
        }
        System.out.println("sum = " + sum);
        //2 创建对应的稀疏数组
        int sparseArray[][] = new int[sum+1][3];
        // 给数组赋值
        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = sum;
        // 遍历二维数组 将非0的值存入到稀疏数组中
        int count = 0;
        for (int i=0;i<11;i++){
            for (int j=0;j<11;j++){
                if (chessArr1[i][j] != 0){
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = chessArr1[i][j];
                }

            }
        }
        // 输出稀疏数组
        System.out.println("稀疏数组---->");
        for (int[] row : sparseArray){
            for (int data: row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
        // 将稀疏数组转为二维数组
        // 1 先读取稀疏数组的第一行 根据第一行创建原始的二维数组
        int chessArray2[][] = new int[sparseArray[0][0]][sparseArray[0][1]];
        // 2 继续读取稀疏数组中的剩余数据

        for(int i=1;i<sparseArray.length;i++){
            chessArray2[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        // 输出恢复后的二维数组
        System.out.println("恢复后的二维数组---->");
        for (int[] row : chessArray2){
            for (int data: row){
                System.out.printf("%d\t",data);
            }
            System.out.println();
        }
    }
}
