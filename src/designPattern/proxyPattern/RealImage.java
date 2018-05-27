package designPattern.proxyPattern;

/**
 * Created by qq940 on 2018/3/6.
 */
public class RealImage implements Image {
    private String fileName;

    public RealImage(String fileName) {
        this.fileName = fileName;
        loadFromDisk(fileName);
    }
    @Override
    public void display() {
        System.out.println("Displaying" + fileName);
    }

    private void loadFromDisk (String fileName) {
        System.out.println("Loading " + fileName);
    }
}
