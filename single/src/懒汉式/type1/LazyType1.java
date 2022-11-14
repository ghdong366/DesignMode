package 懒汉式.type1;

/**
 * @author Admin
 *饿汉式
 * （线程不安全的写法）
 */
public class LazyType1 {
    public static void main(String[] args) {
        //Moon instance1 = Moon.getInstance();
        //Moon instance2 = Moon.getInstance();
        //System.out.println(instance1 == instance2); //这里结果为true

        System.out.println("模拟多个线程创建单例对象");
        //这里模拟多个线程创建单例对象
        for (int i = 0; i < 20; i++) {
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
    private static Moon moon;

    private Moon(){

    }

    //先判断是否为null,为null才去创建
    public static Moon getInstance(){
        if (moon==null){
            moon = new Moon();
        }
        return moon;
    }


}
