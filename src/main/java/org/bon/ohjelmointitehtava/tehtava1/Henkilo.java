package org.bon.ohjelmointitehtava.tehtava1;

import java.util.ArrayList;
import java.util.List;

/**
 * Tommi
 * Date: 01/11/2020
 * Time: 20.09
 */

public abstract class Henkilo {
    private List<String> nimet = new ArrayList<>();
    private List<String> osoitteet = new ArrayList<>();

    public List<String> getNimet() {
        return nimet;
    }

    public void setNimet(List<String> nimet) {
        this.nimet = nimet;
    }

    public List<String> getOsoitteet() {
        return osoitteet;
    }

    public void setOsoitteet(List<String> osoitteet) {
        this.osoitteet = osoitteet;
    }
}
