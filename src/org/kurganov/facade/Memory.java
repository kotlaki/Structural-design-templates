package org.kurganov.facade;

public class Memory {
    public void load(long position, byte[] data) {
        for (int i = 0; i < data.length ; i++) {
            System.out.println("Memory load... position = " + position + " data = " + data[i]);
        }
    }
}
