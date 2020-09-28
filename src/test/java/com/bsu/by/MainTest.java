package com.bsu.by;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    void toLargeLetter() {
        List<String> str = new ArrayList<>();
        str.add("в.этой жизни ");
        str.add("ты либо,волк");
        str.add("либо.не,волк");
        List<String> expectedStr = new ArrayList<>();
        expectedStr.add("В.Этой Жизни ");
        expectedStr.add("Ты Либо,Волк");
        expectedStr.add("Либо.Не,Волк");
        List<String> finishedLine;
        finishedLine = Main.toLargeLetter(str);
        assertEquals(finishedLine, expectedStr);
    }
}
