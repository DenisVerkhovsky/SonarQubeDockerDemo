package com.example.sonarqubedockerdemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

import org.junit.jupiter.api.Test;

class HotSpotExampleTest {

    @Test
    void isValid() {
        // given
        var hotSpot = spy(new HotSpotExample());

        doReturn("\\d+").when(hotSpot).readRegex();

        // when
        var isValid = hotSpot.isValid("1234");

        // then
        assertTrue(isValid);
    }
}