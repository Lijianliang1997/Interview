package designPattern.proxyPattern;

/**
 * Created by qq940 on 2018/3/6.
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        // 图像将从磁盘加载
        image.display();
        System.out.println();
        image.display();
    }
}
