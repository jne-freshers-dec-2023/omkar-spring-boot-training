package com.spring.Mokito;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ListTest {

    @Test
    void test(){

        List list=mock(List.class);
        when(list.size()).thenReturn(3);
        assertEquals(3,list.size());

    }
}
