/**
 * Created by zxc on 2018/3/23.
 */
public class Arithmetic {

    public static void main(String[] args) {


        calculate();

    }


    /**
     * 1-n的阶乘之和
     */
    public static void Factorial(int n) {

        //总和
        double sum = 0;

        //阶乘值，从1开始
        double factorial = 1;

        for (int i = 1; i <= n; i++) {

            factorial = factorial * i;


            sum = (int) (sum + factorial);

        }

        System.out.println("公众号：Java3y" + "     " + sum);

    }


    /**
     * 求出二维数组每列的最小值
     */
    public static void minArray() {


        //二维数组
        int[][] arrays = {
                {23, 106, 8, 234},
                {25, 9, 73, 19},
                {56, 25, 67, 137}
        };


        //获取列数
        int maxColLength = arrays[0].length;


        //使用一个数组来装载每列最小的值
        int[] minArray = new int[maxColLength];


        //控制列数
        for (int i = 0; i < maxColLength; i++) {

            //假设每列的第一个元素是最小的
            int min = arrays[0][i];

            //控制行数
            for (int j = 1; j < arrays.length; j++) {


                //找到最小值
                if (arrays[j][i] < min) {
                    min = arrays[j][i];
                }
            }

            //赋值给装载每列最小的值的数组
            minArray[i] = min;
        }


        System.out.println("公众号：Java3y" + "     " + minArray);

    }


    /**
     * 求"1！+4！(2的平方)+9！(3的平方)+...+n的值
     */
    public static void calculate() {

        double sum = 0;

        for (int i = 1; i <= 3; i++) {

            //得到平方数
            int square = i * i;

            //阶乘值，从1开始
            double factorial = 1;

            //求阶乘
            for (int j = 1; j <= square; j++) {
                factorial = factorial * j;
            }

            sum = sum + factorial;

        }

        System.out.println("公众号：Java3y" + "     " + sum);

    }

}
