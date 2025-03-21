/**
 * @ (#) Server.java      3/9/2025
 * <p>
 * Copyright (c) 2025 IUH. All rights reserved
 */

package vn.edu.iuh.fit.factory.models;

/*
 * @description:
 * @author: Sinh Phan Tien
 * @date: 3/9/2025
 */
public class Server extends Computer{
    private String ram;
    private String hdd;
    private String cpu;
    public Server(String ram, String hdd, String cpu){
        this.ram=ram;
        this.hdd=hdd;
        this.cpu=cpu;
    }
    @Override
    public String getRAM() {
        return this.ram;
    }
    @Override
    public String getHDD() {
        return this.hdd;
    }
    @Override
    public String getCPU() {
        return this.cpu;
    }
}
