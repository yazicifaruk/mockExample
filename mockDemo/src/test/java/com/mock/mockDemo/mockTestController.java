package com.mock.mockDemo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import org.springframework.beans.factory.annotation.Autowired;


import static junit.framework.TestCase.assertEquals;
import static org.mockito.Mockito.*;

public class mockTestController{
    Calculator c = null;
    @Mock
    CalculatorService service;
    @Rule
    public MockitoRule rule = MockitoJUnit.rule();

    @Before
    public void setUp() {
        c = new Calculator(service);
    }

    @Test
    public void testperform() {
        when(service.add(2, 3)).thenReturn(5);
        assertEquals(10, c.perform(2, 3));
        verify(service).add(2, 3);

    }
}
