package method;

public class TestFactory {
    public static void main(String[] args) {
        ComputerFactory computerFactory = new ComputerFactory();
        System.out.println("Factory PC Config::" + ComputerFactory.getComputer("PC", "2 GB", "500 GB", "2.4 GHz"));
        System.out.println("Factory Server Config::" + ComputerFactory.getComputer("Server", "16 GB", "1 TB", "2.9 GHz"));
    }
}
