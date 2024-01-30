package me.lthompson.mp.quickstart;

import io.helidon.microprofile.server.Server;

import java.io.IOException;
import java.util.logging.LogManager;


public class Main {
    public static void main(String[] args) throws IOException {
        // load logging configuration
        LogManager.getLogManager().readConfiguration(
                Main.class.getResourceAsStream("/logging.properties"));

        Server server = Server.create();
        server.start();

        System.out.println("http://localhost:" + server.port() + "/greet");
    }
}
