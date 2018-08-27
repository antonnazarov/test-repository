package soundsystem;

import static org.junit.Assert.assertNotNull;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Testing auto wire feature of the Spring Framework.
 * 
 * @author Anton Nazarov
 * @since 27 Aug 2018
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes=CDPlayerConfig.class)
public class CDPlayerTest {
    
    @Autowired
    private CompactDisk cd;
    
    @Test
    public void cdShouldNotBeNull() {
       assertNotNull(cd);
       
       cd.play();
    }
}
