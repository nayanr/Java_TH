package org.example.testtwo.managers;

import java.util.Optional;

public interface IOManager {

    Optional<String> getInputFromConsole();

    void sendOutputToConsole(String message);

    void closeGame();
}
