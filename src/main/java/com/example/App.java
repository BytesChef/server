package com.example;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     * @throws IOException 
     */
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(3500);
        Socket ht = ss.accept();
        System.out.println(("qualcuno si è collegato"));
    }
}
