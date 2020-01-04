package top.auzqy.webflux;

/**
 * description:  更好的方式是使用线程池
 * 简单示例一下 匿名函数 的使用
 *
 *
 *
 * createTime: 2020-01-04 11:52
 *
 * @author au
 */
public class _02_ThreadDemo {

    public void beforeJdk8() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("ok");
            }
        }).start();
    }

    public void afterJdk8() {
        new Thread(() -> System.out.println("ok")).start();
    }

    public boolean compare() {
        Runnable runnable1 = () -> System.out.println("ok");
        Runnable runnable2 = () -> System.out.println("ok");
        return runnable1 == runnable2;
    }

    /**
     * lambda 表达式就是返回了指定接口的对象实例
     */
    public void justSeeSee() {
        Object runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("ok");
            }
        };
        Object runnable1 = (Runnable)() -> System.out.println("ok");
    }

    public static void main(String[] args) {
        _02_ThreadDemo threadDemo = new _02_ThreadDemo();
        threadDemo.beforeJdk8();
        threadDemo.afterJdk8();
        System.out.println(threadDemo.compare());
    }
}
