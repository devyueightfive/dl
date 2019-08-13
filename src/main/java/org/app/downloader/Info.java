package org.app.downloader;

import java.util.Set;

public class Info {

    public long getNumberOfHrefs() {
        return numberOfHrefs;
    }

    public void setNumberOfHrefs(long numberOfHrefs) {
        this.numberOfHrefs = numberOfHrefs;
    }

    public long getNumberOfDownloadedHrefs() {
        return numberOfDownloadedHrefs;
    }

    public void setNumberOfDownloadedHrefs(long numberOfDownloadedHrefs) {
        this.numberOfDownloadedHrefs = numberOfDownloadedHrefs;
    }

    private long numberOfHrefs;
    private long numberOfDownloadedHrefs;

    public Set getHrefs() {
        return hrefs;
    }

    public void setHrefs(Set hrefs) {
        this.hrefs = hrefs;
    }

    Set hrefs;
}
