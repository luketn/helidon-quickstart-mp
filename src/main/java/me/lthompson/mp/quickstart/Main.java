package me.lthompson.mp.quickstart;

import io.helidon.microprofile.server.Server;

import java.io.IOException;
import java.util.logging.LogManager;


public class Main {
    public static void main(String[] args) throws IOException {
        io.helidon.Main.main(args);

        System.out.println("http://localhost:8080/greet");
    }
}
