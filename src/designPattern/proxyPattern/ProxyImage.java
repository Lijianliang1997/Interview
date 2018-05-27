package designPattern.proxyPattern;

/**
 * Created by qq940 on 2018/3/6.
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage (String fileName) {
        this.fileName = fileName;
    }
    @Override
    public void display() {
        if (realImage == null) {
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
