package org.app.client;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

/**
 * Class Resource
 */
public class Resource {
    //
    // Fields
    //
    private String url;
    private String html = null; //html "body"

    //
    // No Constructor , subject returns by WebClient
    //

    //
    // Methods
    //
    boolean isValid() {
        return !(html == null);
    }

    /**
     * Returns base directory of the page.
     *
     * @return return directory to the page
     */
    public String getBaseURL() {
        try {
            return url.substring(0, url.lastIndexOf('/') + 1);
        } catch (
                Exception e) {
            e.printStackTrace();
        }
        return "";
    }


    //
    // Accessor methods
    //

    /**
     * Get the value of url
     *
     * @return the value of url
     */
    public String getUrl() {
        return url;
    }

    void setUrl(String url) {
        this.url = url;
    }

    /**
     * Get the value of html
     *
     * @return the value of html
     */
    public String getHtml() {
        return html;
    }

    void setHtml(String html) {
        this.html = html;
    }

    /**
     * Get the value of hrefs
     *
     * @return the value of hrefs
     */
    public Set < String > getHrefs() {

        return getLocalHtmlLinks(html);
    }

    //
    // Other methods
    //

    /**
     * Returns set of local (within given page) hrefs
     *
     * @param html - body of a page
     * @return Set < String > local hrefs
     */
    private Set < String > getLocalHtmlLinks(String html) {
        Objects.requireNonNull(html);
        Set < String > result = new LinkedHashSet <>(); // set implemented as hash set (save input order)
        String baseURL = this.getBaseURL();
        Document doc = Jsoup.parse(html);
        Elements links = doc.select("a[href]");
        for (Element e : links) {
            String href = e.attr("href");
            if (!href.startsWith("http") & href.contains(".htm")) {// choose local links
                result.add(baseURL.concat(href));
            }
//            System.out.format("%s -> %s\n", href, newHref);
        }
        return result;
    }


}
