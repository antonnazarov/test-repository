package ru.anton.learningspring;

/**
 * A trivial implementation of the boobler- interface.
 * 
 * @author Anton Nazarov
 * @since 26/08/2018
 */
public class Boobler implements Booblable, Talkable {
    public static final String DEFAULT_STATUS = "default";
    private TalkHelper talkHelper;
    
    private String status = DEFAULT_STATUS;

    @Override
    public String boobleMe(String boobleMsg) {
        StringBuilder sb = new StringBuilder();
        sb.append("Now I am boobling: ").append(boobleMsg);
        
        return sb.toString();
    }

    @Override
    public String initializeStatus(String status) {
        if (status != null && status.length() > 0) {
            this.status = status;
        } else {
            return "error";
        }
        
        return "OK";
    }

    @Override
    public String readBooblingStatus() {
        if (status.equals(DEFAULT_STATUS)) {
            return "The status was not initialized/changed";
        }
        
        StringBuilder sb = new StringBuilder();
        sb.append("The current boobling status = [").append(status).append("]");
        
        return sb.toString();
    }

    @Override
    public String talk(String word, int repeats) {
        StringBuilder sb = new StringBuilder();
        sb.append("Repeated ").append(repeats).append(" times: ");
        
        for (int i = 0; i<repeats; i++) {
            sb.append(word).append(":");
        }
        
        return sb.toString();
    }
    
    /**
     * Use the helper class to talk with only "a"- symbols.
     */
    public String talkAsOnly(String msg) {
        return talkHelper.getAs(msg);
    }

    public void setTalkHelper(TalkHelper talkHelper) {
        this.talkHelper = talkHelper;
    }
}
