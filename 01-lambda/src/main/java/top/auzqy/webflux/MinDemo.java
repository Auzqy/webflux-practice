package top.auzqy.webflux;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * description:  计算一组数据中的最小值
 * createTime: 2020-01-04 11:26
 * @author au
 */
public class MinDemo {

    private int[] nums = {2, 3, 1, -3, -433, -555, 333, 222, 654};

    /**
     * 命令方式 求最小值
     * @param nums
     * @return
     */
    public int commandStyle(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int num : nums) {
            if (min > num) {
                min = num;
            }
        }
        return min;
    }

    /**
     * 函数式编程
     *
     * @param nums
     * @return
     */
    public int functionStyle(int[] nums) {
        // jdk8
        int min1 = IntStream.of(nums).min().orElse(Integer.MAX_VALUE);
        // 还可以使用 并行流 来提高效率
        int min2 = IntStream.of(nums).parallel().min().getAsInt();
        return min1;
    }

    public static void main(String[] args) {
        MinDemo minDemo = new MinDemo();
        System.out.println("minDemo.commandStyle(minDemo.nums) = "
                + minDemo.commandStyle(minDemo.nums));

        System.out.println("minDemo.functionStyle(minDemo.nums) = "
                + minDemo.functionStyle(minDemo.nums));
    }
}
