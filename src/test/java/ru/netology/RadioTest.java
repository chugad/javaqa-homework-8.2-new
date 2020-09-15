package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
    Radio radio = new Radio();

//    station

//    next

    @Test
    public void shouldNextStationNumberUnderLimitUp() {
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        radio.setCurrentStationNumber(8);
        radio.next();
        var expected = 9;
        assertEquals(expected, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldNextStationNumberIfCurrentStationNine() {
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        radio.setCurrentStationNumber(9);
        radio.next();
        var expected = 0;
        assertEquals(expected, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldNextStationNumberUnderLimitDown() {
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        radio.setCurrentStationNumber(0);
        radio.next();
        var expected = 1;
        assertEquals(expected, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldNextStationNumberAfterLimitDown() {
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        radio.setCurrentStationNumber(-100);
        radio.next();
        var expected = 1;
        assertEquals(expected, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldNextStationNumberAfterLimitUp() {
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        radio.setCurrentStationNumber(100);
        radio.next();
        var expected = 1;
        assertEquals(expected, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldPrevStationNumberUnderLimitUp() {
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        radio.setCurrentStationNumber(9);
        radio.prev();
        var expected = 8;
        assertEquals(expected, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldPrevStationNumberIfCurrentStationZero() {
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        radio.setCurrentStationNumber(0);
        radio.prev();
        var expected = 9;
        assertEquals(expected, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldPrevStationNumberUnderLimitDown() {
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        radio.setCurrentStationNumber(1);
        radio.prev();
        var expected = 0;
        assertEquals(expected, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldPrevStationNumberAfterLimitDown() {
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        radio.setCurrentStationNumber(-100);
        radio.prev();
        var expected = 9;
        assertEquals(expected, radio.getCurrentStationNumber());
    }

    @Test
    public void shouldPrevStationNumberAfterLimitUp() {
        radio.setMinStationNumber(0);
        radio.setMaxStationNumber(9);
        radio.setCurrentStationNumber(100);
        radio.prev();
        var expected = 9;
        assertEquals(expected, radio.getCurrentStationNumber());
    }
}
