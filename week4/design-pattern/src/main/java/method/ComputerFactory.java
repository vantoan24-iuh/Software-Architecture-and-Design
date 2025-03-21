/**
 * @ (#) ComputerFactory.java      3/9/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.factory.method;

import vn.edu.iuh.fit.factory.models.Computer;
import vn.edu.iuh.fit.factory.models.PC;
import vn.edu.iuh.fit.factory.models.Server;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/9/2025
 */
public class ComputerFactory {
    public static Computer getComputer(String type, String ram, String hdd, String cpu){
        if("PC".equalsIgnoreCase(type)) return new PC(ram, hdd, cpu);
        else if("Server".equalsIgnoreCase(type)) return new Server(ram, hdd, cpu);
        return null;
    }
}
