package org.app;

/**
 * Class Recource
 */
public class Resource {

  //
  // Fields
  //

  String url;
  String html;
  String[] hrefs;
  
  //
  // Constructors
  //
  public Resource() { };
  
  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of url
   * @param newVar the new value of url
   */
  public void setUrl (String newVar) {
    url = newVar;
  }

  /**
   * Get the value of url
   * @return the value of url
   */
  public String getUrl () {
    return url;
  }

  /**
   * Set the value of html
   * @param newVar the new value of html
   */
  public void setHtml (String newVar) {
    html = newVar;
  }

  /**
   * Get the value of html
   * @return the value of html
   */
  public String getHtml () {
    return html;
  }

  /**
   * Set the value of hrefs
   * @param newVar the new value of hrefs
   */
  public void setHrefs (String[] newVar) {
    hrefs = newVar;
  }

  /**
   * Get the value of hrefs
   * @return the value of hrefs
   */
  public String[] getHrefs () {
    return hrefs;
  }

  //
  // Other methods
  //

}
