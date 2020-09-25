package com.bsu.by;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    @Test
    void toLargeLetter() {
        String str = " a b c d fre erq. fwef, deq qf.rw,  fw vf      ewfw";
        assertEquals(" A B C D Fre Erq. Fwef, Deq Qf.Rw,  Fw Vf      Ewfw", Main.toLargeLetter(str));
    }
}
