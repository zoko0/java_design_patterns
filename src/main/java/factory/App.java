package factory;

public class App {

    public static void main(String[] args) {
        DiscFactory discFactory = new DiscFactory();
        Disk disk = discFactory.manufactureDisk("Discraft");
        disk.throww();
    }
}
