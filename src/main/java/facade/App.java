package facade;

public class App {
    public static void main(String[] args) {
        ZoneDefenseFacade facade = new ZoneDefenseFacade();
        facade.startDefense();
        facade.coverZone();
    }
}
