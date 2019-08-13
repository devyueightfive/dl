package org.app.client;

/**
 * Interface WebClient
 */
public interface WebClient {

    //
    // Methods
    //

    /**
     * Returns resource from the url
     *
     * @param url url of a site
     * @return resource from url or null if url is not valid
     */
    Resource getResource(String url);

    //
    // Accessor methods
    //

    //
    // Other methods
    //


}
