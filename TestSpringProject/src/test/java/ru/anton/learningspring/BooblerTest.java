package ru.anton.learningspring;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

/**
 * Tests for the Boobler class implementation.
 * 
 * @author Anton Nazarov
 * @since 26/08/2018
 */
public class BooblerTest {
    Boobler boobler = new Boobler();
    TalkHelper h = mock(TalkHelper.class);
    
    @Before
    public void setUp() {
        h = mock(TalkHelper.class);
        when(h.getAs("Test string")).thenReturn("The test message was called");
    }
    
    @After
    public void tearDown() {
        reset(h);
    }
    
    @Test
    public void testBoobleMe() {
        String testString = "Test Booble";
        String ret = boobler.boobleMe(testString);
        assertTrue(ret.contains(testString));
        System.out.println(ret);
    }
    
    @Test
    public void testInitStatusOK() {
        String ret = boobler.initializeStatus("New Status");
        assertEquals("OK", ret);
    }
    
    @Test
    public void testInitStatusError() {
        String ret = boobler.initializeStatus("");
        assertEquals("error", ret);
    }
    
    @Test
    public void testReadBooblingStatus() {
        boobler = new Boobler();
        String ret = boobler.readBooblingStatus();
        
        assertEquals("The status was not initialized/changed", ret);
        System.out.println(ret);
        
        String testStatus = "NEW_STATUS";
        boobler.initializeStatus(testStatus);
        ret = boobler.readBooblingStatus();
        
        assertTrue(ret.contains(testStatus));
        System.out.println(ret);
    }
    
    @Test
    public void testTalkAsOnly() {
        boobler.setTalkHelper(h);
        String ret = boobler.talkAsOnly("Test string");
        
        assertEquals("The test message was called", ret);
    }
}
