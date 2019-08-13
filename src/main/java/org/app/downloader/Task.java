package org.app.downloader;

import org.app.client.WebClient;

/**
 * Interface Task
 */
abstract public class Task implements Runnable {
    //
    // Fields
    //

    private String    home;
    private String    URL;
    private WebClient client;
    //
    // Methods
    //

    /**
     * @return Info
     */
    public abstract Info getInfo();


    /**
     *
     */
    public abstract void pause();


    /**
     *
     */
    public abstract void stop();


    /**
     *
     */
    public abstract void run();

    //
    // Accessor methods
    //

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }


}
