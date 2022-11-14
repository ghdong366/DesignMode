package 懒汉式.type1;

/**
 * @author Admin
 *饿汉式
 * （线程不安全的写法）
 */
public class LazyType1 {
    public static void main(String[] args) {
        Moon instance1 = Moon.getInstance();
        Moon instance2 = Moon.getInstance();
        System.out.println(instance1 == instance2);
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
