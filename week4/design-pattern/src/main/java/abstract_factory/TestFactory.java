package abstract_factory;

public class TestFactory {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
<<<<<<< HEAD
        System.out.println("Factory PC Config::" + ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz")));
        System.out.println("Factory Server Config::" + ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz")));
=======
        System.out.println("Factory PC Config::" + ComputerFactory.getComputer(new PCFactory("5 GB", "512 GB", "2.4 GHz")));
        System.out.println("Factory Server Config::" + ComputerFactory.getComputer(new ServerFactory("20 GB", "1 TB", "2.9 GHz")));
>>>>>>> 8d21e2c0005c0c1a81b3eba6382098b89e0e7554
    }
}
