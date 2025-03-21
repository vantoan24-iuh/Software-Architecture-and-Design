/**
 * @ (#) TestFactory.java      3/9/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.factory.abstract_factory;


/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/9/2025
 */
public class TestFactory {
    public static void main(String[] args) {
        ComputerFactory factory = new ComputerFactory();
        System.out.println("Factory PC Config::" + ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz")));
        System.out.println("Factory Server Config::" + ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz")));
    }
}
