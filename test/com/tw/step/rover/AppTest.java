package com.tw.step.rover;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AppTest {
    @Test
    void shouldPrintFinalRoverPosition() {
        PrintStream originalOut = System.out;
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));

        try {
            App.main();
        } finally {
            System.setOut(originalOut);
        }

        assertEquals("{R2=3 3 E, R1=-1 2 W}" + System.lineSeparator(), output.toString());
    }
}
