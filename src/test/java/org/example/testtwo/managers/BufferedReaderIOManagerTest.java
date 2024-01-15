package org.example.testtwo.managers;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Optional;

@RunWith(MockitoJUnitRunner.class)
public class BufferedReaderIOManagerTest {

    @Mock
    private BufferedReader mockBufferedReader;

    private BufferedReaderIOManager ioManager;

    @Before
    public void setUp() {
        MockitoAnnotations.openMocks(this);
        ioManager = new BufferedReaderIOManager(mockBufferedReader);
    }

    @After
    public void tearDown() throws IOException {
        ioManager.closeGame();
    }

    @Test
    public void testGetInputFromConsole() throws IOException {
        String input = "Test input";
        when(mockBufferedReader.readLine()).thenReturn(input);
        Optional<String> result = ioManager.getInputFromConsole();
        assertTrue(result.isPresent());
        assertEquals(input, result.get());
    }


    @Test
    public void testSendOutputToConsole() throws IOException {
        String message = "Test message";
        ioManager.sendOutputToConsole(message);
        verify(mockBufferedReader, never()).close();
    }
}
