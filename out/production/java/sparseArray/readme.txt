稀疏数组，相当于对原有数组的一个压缩
比如将在一个10x10的棋盘中，只有两个棋子
其一的位置为1x1，其二的位置2x2
转为sparseArray后变成 nx3的array
第一行是原array有几行几列几个有效数据
接下来的n行为有效数据的x y 和有效值

二维数组 转sparseArray的思路
1、遍历原始的二维数组，得到有效数据的个数sum
2、创建sparsearray int[sum+1][3]
3、将原始数组 存入 sparseArray

sparseArray的思路
1、先读取sparseArray的第一行，创建原始二维数组
2、读取sparseArray 后面的所有数据，并添加到原始数组中