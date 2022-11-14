package 懒汉式.type2;

/**
 * @author Admin
 *饿汉式
 * （保证线程安全的写法）
 */
public class LazyType2 {
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
    private static Moon moon;

    private Moon(){

    }

    //添加synchronized关键字，保证线程安全
    public static synchronized Moon getInstance(){
        if (moon==null){
            moon = new Moon();
        }
        return moon;
    }


}
