package soundsystem;

import org.springframework.stereotype.Component;

/**
 * A first implementation of the CompactDisk- interface.
 * 
 * @author Anton Nazarov
 * @since 27 Aug 2018
 */
@Component("Idiot")
public class Kirkorov implements CompactDisk {
    private String title = "You're my Bunny";
    private String artist = "Kirkorov";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
