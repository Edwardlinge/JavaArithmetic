package basic;

/**
 * Created by zxc on 2018/3/23.
 */
public class ArithmeticTwo {

    public static void main(String[] args) {


        int[] arrays = {5, 5, 6, 4, 4, 6, 3};

        //singleNumber(arrays);

        drawStar();
    }


    /**
     * 画星星
     */
    public static void drawStar() {

        // 我要画5行的星星
        int row = 5;

        for (int i = 1; i <= 5; i++) {

            // 空格数等于最大行数 - 当前行数
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }

            // 星星数等于(当前行数*2-1)
            for (int j = 1; j <= i * 2 - 1; j++) {

                System.out.print("*");

            }

            // 每画一行就换一次行
            System.out.println();
        }
    }


    /**
     * 找出数组的单个数字
     *
     * @param nums
     * @return
     */
    public static void singleNumber(int[] nums) {

        for (int i = 0; i < nums.length; i++) {

            int count = countNumber(nums, nums[i]);


            // 如果该元素只出现一次，那么就是它了！
            if (count == 1) {
                System.out.println("关注公众号：Java3y--->单一的元素是：" + nums[i]);

                return;
            }


        }
    }

    /**
     * 找出每个元素出现的次数
     *
     * @param nums  数组
     * @param value 想知道出现次数的元素
     */

    public static int countNumber(int[] nums, int value) {


        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            if (value == nums[i]) {
                count++;
            }
        }
        // 返回该元素出现的次数
        return count;
    }


    /**
     * 找出数组的单个数字
     *
     * @param nums
     * @param numsSize
     * @return
     */
    public static int singleNumber(int[] nums, int numsSize) {

        // 第一个数和数组后面的数做^运算，留下的必然是单个数字
        int k = nums[0];
        for (int i = 1; i < numsSize; i++) {
            k = (k ^ nums[i]);
        }
        return k;
    }


    /**
     * 移动元素0到数组最后
     *
     * @param arrays
     */
    public static void moveZero(int[] arrays) {

        // 记录该数组有多少个0元素
        int zero = 0;


        for (int i = 0; i < arrays.length; i++) {

            // 只要元素不为0，那么就往前面移动
            if (arrays[i] != 0) {
                arrays[i - zero] = arrays[i];
            } else {
                // 如果为0，那么zero ++
                zero++;
            }
        }


        // 1. 前面已经将非0的元素移动到数组的前面了
        // 2. 将为0的元素填满数组，填充的位置就从length - zero开始


        int j = arrays.length - zero;
        while (j < arrays.length) {
            arrays[j] = 0;
            j++;
        }

        System.out.println("关注公众号：Java3y---->" + arrays);


    }


    /**
     * 移动元素0到数组最后
     *
     * @param arrays
     */
    public static void moveZero2(int[] arrays) {


        // 在j前面的元素都不是0
        int j = 0;


        for (int i = 0; i < arrays.length; i++) {

            if (arrays[i] != 0) {

                // 跟j进行交换，保证j的前面都不是0
                int temp = arrays[i];
                arrays[i] = arrays[j];
                arrays[j] = temp;

                j++;
            }
        }

        // 直至i遍历完毕后，j前面都不是0，j-i都是0(这就完成我们的任务了)


        System.out.println("关注公众号：Java3y---->" + arrays);


    }


    /**
     * 找到缺失的数字
     *
     * @param arrays
     */
    public static void missingNumber(int[] arrays) {


        // 定义要填充到新数组的数字(随意)
        int randomNumber = 89898980;


        // 创建一个新的数组(比已缺失的数组多一个长度)
        int[] newArrays = new int[arrays.length + 1];

        // 填充特殊的数字进新数组中
        for (int i = 0; i < newArrays.length; i++) {

            // 随意填充数组到新数组中
            newArrays[i] = randomNumber;
        }

        // 遍历题目的数组并使用index替代掉新数组的元素
        for (int i = 0; i < arrays.length; i++) {

            // 题目数组的值[0,1,2,3,4,...n]其中有一个缺失
            int index = arrays[i];

            // 重新填充到新数组上，index对应着题目数组的值
            newArrays[index] = 3333333;

        }

        // 遍历新数组，只要还有值为89898980，那么那个就是缺失的数字
        for (int i = 0; i < newArrays.length; i++) {


            if (newArrays[i] == randomNumber) {

                System.out.println("关注公众号：Java3y---->缺失的数字是：" + i);

            }


        }


    }

    /**
     * 利用等差公式找到缺失的数字
     *
     * @param arrays
     */
    public static void missingNumber2(int[] arrays) {

        // 套用等差求和公式
        int sum = (arrays[0] + arrays[arrays.length - 1]) * (arrays.length + 1) / 2;


        // 遍历数组，得出的sum减去数组每一位元素，最后即是缺失的数字

        for (int value : arrays) {
            sum = sum - value;
        }


        System.out.println("关注公众号：Java3y---->缺失的数字是：" + sum);


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
