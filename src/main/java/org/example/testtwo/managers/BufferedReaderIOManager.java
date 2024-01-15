package org.example.testtwo.managers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

public class BufferedReaderIOManager implements IOManager{
    private final BufferedReader reader;

    public BufferedReaderIOManager() {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }

    public BufferedReaderIOManager(BufferedReader bufferedReader) {
        reader = bufferedReader;
    }

    @Override
    public synchronized Optional<String> getInputFromConsole() {
        try {
            return Optional.of(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
            return Optional.empty();
        }
    }

    @Override
    public synchronized void sendOutputToConsole(String message) {
        System.out.println(message);
    }

    @Override
    public void closeGame() {
        try {
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
