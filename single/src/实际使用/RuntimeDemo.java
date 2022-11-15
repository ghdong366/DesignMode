package 实际使用;

public class RuntimeDemo {

    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        Runtime runtime2 = Runtime.getRuntime();
        System.out.println(runtime == runtime2);
    }
}
