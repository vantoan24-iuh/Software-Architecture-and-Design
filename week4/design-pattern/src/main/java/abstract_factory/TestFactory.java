package abstract_factory;

public class TestFactory {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        System.out.println("Factory PC Config::" + ComputerFactory.getComputer(new PCFactory("5 GB", "512 GB", "2.4 GHz")));
        System.out.println("Factory Server Config::" + ComputerFactory.getComputer(new ServerFactory("20 GB", "1 TB", "2.9 GHz")));
    }
}
