package abstract_factory;

import models.Computer;

public class ComputerFactory {
    public static Computer getComputer(ComputerAbstractFactory factory){
        return factory.createComputer();
    }
}
