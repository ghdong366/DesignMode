package 双重检查;

/**
 * @author Admin
 * 双重检查
 */
public class DoubleCheckDemo {
    public static void main(String[] args) {
        System.out.println("模拟20个线程创建单例对象");
        for (int i = 10; i < 30; i++) {
            new Thread(()->{
                String name = Thread.currentThread().getName();
                Moon instance = Moon.getInstance();
                System.out.println(name+"创建了Moon实例:"+instance.hashCode());
            },"线程"+i).start();
        }
    }
}

/**
 * 单例类
 */
class Moon{
    private static volatile Moon instance = null;

    private Moon(){

    }

    public static Moon getInstance(){
        if (null == instance){
            synchronized(Moon.class){
                if (null == instance){
                    instance = new Moon();
                }

            }
        }
        return instance;
    }

}

