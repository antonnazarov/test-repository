package soundsystem;

import org.springframework.stereotype.Component;

/**
 * A first implementation of the CompactDisk- interface.
 * 
 * @author Anton Nazarov
 * @since 27 Aug 2018
 */
@Component("LonelyHeartsClub")
public class SgtPepper implements CompactDisk {
    private String title = "Sgt. Pepper's Lonely Hearts Club band";
    private String artist = "The Beatles";

    @Override
    public void play() {
        System.out.println("Playing " + title + " by " + artist);
    }
}
