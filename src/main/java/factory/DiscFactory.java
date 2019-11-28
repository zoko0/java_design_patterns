package factory;

public class DiscFactory {

    public Disk manufactureDisk(String diskType) {
        if (diskType == null)
            return null;
        if (diskType.equals("Discraft"))
            return new DiscraftDisk();
        else if (diskType.equals("Eurodisc"))
            return new Eurodisc();

        return null;
    }
}
