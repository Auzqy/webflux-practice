package top.auzqy.webflux;

import java.util.function.DoubleToIntFunction;

interface Interface1{
    int calculateNum(int i);
}

public class _03_LambdaDemo1 {

    /**
     * lambda 常见的四种写法
     */
    public void normalUes() {
        Interface1 interface1 = (i) -> i * 2;
        // 最常用
        Interface1 interface2 = i -> i * 2;

        Interface1 interface3 = (int i) -> i * 2;

        Interface1 interface4 = (int i) -> {
            return i * 2;
        };
    }
}
