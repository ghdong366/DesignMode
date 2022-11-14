package 饿汉式.tyep1;

/**
 * @author Admin
 * 饿汉式
 * (静态变量的方式)
 */
public class HungerType1 {
    public static void main(String[] args) {

        //测试
        CarSingleton instance = CarSingleton.getInstance();
        CarSingleton instance2 = CarSingleton.getInstance();
        System.out.println(instance==instance2);
    }

}

/**
 * 单例类
 */
class CarSingleton{

    //本类内部创建对象实例
    private final static CarSingleton instance = new CarSingleton();

    // 构造器私有化，不能new
    private CarSingleton(){
    }

    public static CarSingleton getInstance(){
        return instance;
    }

}
