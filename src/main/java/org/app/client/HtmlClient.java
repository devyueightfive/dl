package org.app.client;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Objects;


/**
 * Class HtmlClient
 */
public class HtmlClient implements WebClient {

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

    //
    // Methods
    //

    /**
     * @param url
     * @return Recource
     */
    @Override
    public Resource getResource(String url) {
        Objects.requireNonNull(url);
        String html = getHtml(url);
        if (html == null) {
            return null;
        }
        Resource r = new Resource();
        r.setUrl(url);
        r.setHtml(html);
        return r;
    }

    //
    // Accessor methods
    //

    //
    // Other methods
    //

    /**
     * Returns string representation of the page
     */
    private String getHtml(String url) {
        Objects.requireNonNull(url);
        try {
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(url))
                    .build();
            HttpResponse < String > response = client.send(request, HttpResponse.BodyHandlers.ofString());
            return response.body();
        } catch (Exception e) {
            e.printStackTrace();
        }
        // on error
        return null;
    }
}
