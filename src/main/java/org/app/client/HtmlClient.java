package org.app.client;

import org.app.Resource;

import java.net.http.HttpClient;


/**
 * Class HtmlClient
 */
class HtmlClient implements WebClient {

    //
    // Fields
    //
    private HttpClient client;


    //
    // Constructors
    //
    public HtmlClient() {
        client = HttpClient.newHttpClient(); //default settings
    }

    ;
    //
    // Methods
    //

    /**
     * @param url
     * @return Recource
     */
    public Resource getResource(String url) {
        Resource result = new Resource();
        return result;
    }

    //
    // Accessor methods
    //

    //
    // Other methods
    //


}
