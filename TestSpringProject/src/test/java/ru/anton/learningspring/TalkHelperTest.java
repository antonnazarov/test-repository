package ru.anton.learningspring;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests for TalkHelper.
 * 
 * @author Anton Nazarov
 * @since 26/08/2018
 */
public class TalkHelperTest {
    TalkHelper h = new TalkHelper();
    
    @Test
    public void testGetAs() {
        String testString = "This is a very interesting string, which contains many symbols (not only 'a'- symbols). After the handling in the method, only a's symbols gonna stay in the resulting string";
        String ret = h.getAs(testString);
        
        Assert.assertNotEquals(testString, ret);
        
        System.out.println(testString);
        System.out.println(ret);
        
        String uniqueTest = h.uniqueCharacters(testString);
        Assert.assertEquals(" '(),-.ATabcdefghilmnorstuvwy", uniqueTest);
        String uniqueRet = h.uniqueCharacters(ret);
        Assert.assertEquals(" '(),-.a", uniqueRet);
        System.out.println(uniqueRet);
    }
}
