package soundsystem.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import soundsystem.CDPlayerConfig;
import soundsystem.CompactDisk;

/**
 * The main method- based class.
 * This is how we can organize an entry point for the annotation based Spring Framework configurator/beans.
 * 
 * @author Anton Nazarov
 * @since 27 Aug 2018
 */
public class SoundRunner {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        CompactDisk cd = ctx.getBean(CompactDisk.class);
        
        cd.play();
    }
}
