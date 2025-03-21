/**
 * @ (#) PCFactory.java      3/12/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.factory.abstract_factory;

import vn.edu.iuh.fit.factory.models.Computer;
import vn.edu.iuh.fit.factory.models.PC;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/12/2025
 */
public class PCFactory implements ComputerAbstractFactory{

    private String ram;
    private String hdd;
    private String cpu;
    public PCFactory(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }

    @Override
    public Computer createComputer() {
        return new PC(ram,hdd,cpu);
    }
}
