package top.auzqy.webflux;

/**
 * description:  更好的方式是使用线程池
 * createTime: 2020-01-04 11:52
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

    public static void main(String[] args) {
        _02_ThreadDemo threadDemo = new _02_ThreadDemo();
        threadDemo.beforeJdk8();
        threadDemo.afterJdk8();
    }
}
