package 饿汉式;

/**
 * @author Admin
 * 饿汉式
 * (静态变量的方式)
 */
public class HungerType2 {
    public static void main(String[] args) {

        //测试
        CarSingleton2 instance = CarSingleton2.getInstance();
        CarSingleton2 instance2 = CarSingleton2.getInstance();
        System.out.println(instance==instance2);
    }

}

/**
 * 单例类
 */
class CarSingleton2{

    private static CarSingleton2 instance = null;

    private CarSingleton2(){
    }
    static {
        //初始化放在static中
        instance = new CarSingleton2();
    }

    public static CarSingleton2 getInstance(){
        return instance;
    }

}
