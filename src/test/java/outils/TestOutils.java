package outils;

import static org.testng.Assert.assertEquals;
import org.testng.annotations.Test;
import ch.hesge.ericMclaren.outils.FileStr;

public class TestOutils{
    
    @Test
    public void testFileStr(){
        assertEquals(FileStr.read("f"), null);
    }
    
    @Test
    public void testFileStrNull(){
        assertEquals(FileStr.read(null),null);
    }
    
}