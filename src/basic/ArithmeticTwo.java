package basic;

/**
 * Created by zxc on 2018/3/23.
 */
public class ArithmeticTwo {

    public static void main(String[] args) {



    }


    /**
     * 找到缺失的数字
     *
     * @param arrays
     */
    public static void missingNumber(int[] arrays) {

        // 创建一个新的数组(比已缺失的数组多一个长度)
        int[] newArrays = new int[arrays.length + 1];

        // 填充特殊的数字进新数组中
        for (int i = 0; i < newArrays.length; i++) {

            // 瞎填的
            newArrays[i] = 89898980;
        }

        // 遍历题目的数组并使用index替代掉新数组的元素
        for (int i = 0; i < arrays.length; i++) {

            // 题目数组的值
            int index = arrays[i];

            newArrays[index] = 3333333;
        }







    }



    /**
     * 删除下标为k的元素
     */
    public static void deleteK() {


        //固定的常量(比数组元素的个数要大)
        int N = 10;

        int[] arrays = new int[N];

        //对数组进行初始化
        for (int i = 0; i < 8; i++) {
            arrays[i] = i;
        }


        //要删除下标
        int k = 7;

        for (int i = k; i < N - 1; i++) {
            arrays[i] = arrays[i + 1];
        }


        System.out.println("公众号：Java3y" + arrays);


    }

    /**
     * 找出常用的数字：
     * 给你一个长度为n的数组，其中有一个数字出现的次数至少为n/2，找出这个数字
     */

    public static void findMajorityElement(int[] arrays) {


        //构建一个静态栈
        int[] stack = new int[arrays.length];

        // 栈的front指针
        int front = -1;


        // 遍历给出的数组
        for (int i = 0; i < arrays.length; i++) {


            // 判断该栈为空，那么直接将元素入栈
            if (front == -1) {
                stack[++front] = arrays[i];
            } else if (stack[front] == arrays[i]) { // 该元素是否与栈的元素一致-->继续入栈

                stack[++front] = arrays[i];
            } else {
                // 只要不一致，就出栈
                front--;

            }
        }

        // 只要该数字出现次数大于数组长度的2/1，那么留下来的数字肯定在栈顶中
        System.out.println("关注公众号：Java3y--->" + stack[0]);
    }


    public static void findMajorityElement2(int[] arrays) {

        // 装载栈的元素
        int candidate = -1;

        // 栈的大小(长度)
        int count = 0;


        // 遍历给出的数组
        for (int i = 0; i < arrays.length; i++) {


            // 判断该栈为空，那么直接将元素入栈
            if (count == 0) {

                candidate = arrays[i];
                count++;

            } else if (candidate == arrays[i]) { // 该元素是否与栈的元素一致-->入栈(栈多一个元素)
                count++;
            } else {
                // 只要不一致-->出栈(栈少一个元素)
                count--;

            }
        }

        // 只要该数字出现次数大于数组长度的2/1，那么留下来的数字肯定在栈顶中
        System.out.println("关注公众号：Java3y--->" + candidate);

    }
}
