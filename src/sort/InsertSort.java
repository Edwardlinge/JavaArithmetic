package sort;

/**
 * Created by ozc on 2018/3/15.
 *
 * @author ozc
 * @version 1.0
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] arrays = {3, 2, 1, 3, 3, 324, 2, 342, 34, 32, 51, 425, 34, 5, 43, 53, 45, 32, 5, 345, 342, 53, 45, 435, 34, 53, 4543, 543, 543, 543, 654, 6546, 63, 2, 421, 1};

        sort(arrays);

        System.out.println(arrays);
    }


    public static void sort(int[] arrays) {

        //int[] arrays = {3, 2, 1, 3, 3};



/*        //第一趟排序--------------------
        int temp;
        if (arrays[1] > arrays[0]) {
            //如果第二个数比第一个数大，直接跟上

        } else {
            //如果第二个数比第一个数小，将第一个数后退一个位置(将第二个数插进去)
            temp = arrays[1];
            arrays[1] = arrays[0];
            arrays[0] = temp;

        }

        System.out.println("公众号Java3y" + arrays);

        //第二趟排序--------------------

        if (arrays[2] > arrays[1]) {
            //如果第三个数比第二个数大，直接跟上

        } else {
            //如果第三个数比第二个数小，将第二个数往后退一个位置，让第三个数跟第一个数比
            temp = arrays[2];
            arrays[2] = arrays[1];

            //如果第三个数比第一个大，那就插入到第二个数中
            if (temp > arrays[0]) {
                arrays[1] = temp;
            } else {

                //如果第三个数比第一个小，将第三个数插入到第一个数前面
                int swapTemp = arrays[0];
                arrays[0] = temp;
                arrays[1] = swapTemp;

            }

        }
        System.out.println("公众号Java3y" + arrays);*/


        //临时变量
        int temp;


        //外层循环控制需要排序的趟数(从1开始因为将第0位看成了有序数据)
        for (int i = 1; i < arrays.length; i++) {

            temp = arrays[i];

            //如果前一位(已排序的数据)比当前数据要大，那么就进入循环比较[参考第二趟排序]

            int j = i - 1;

            while (j >= 0 && arrays[j] > temp) {

                //往后退一个位置，让当前数据与之前前位进行比较
                arrays[j + 1] = arrays[j];

                //不断往前，直到退出循环
                j--;

            }
            //退出了循环说明找到了合适的位置了，将当前数据插入合适的位置中
            arrays[j + 1] = temp;

        }
        System.out.println("公众号Java3y" + arrays);
    }
}
