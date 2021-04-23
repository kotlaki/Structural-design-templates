package org.kurganov.facade;

public class CPU {
    public void freeze() {
        System.out.println("Freeze...");
    }
    public void jump(long position) {
        System.out.println("Jump...");
    }
    public void execute() {
        System.out.println("Execute...");
    }
}
