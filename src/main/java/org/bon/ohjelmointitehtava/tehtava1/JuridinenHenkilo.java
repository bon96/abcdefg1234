package org.bon.ohjelmointitehtava.tehtava1;

import java.util.ArrayList;
import java.util.List;

/**
 * Tommi
 * Date: 01/11/2020
 * Time: 20.09
 */

//No jaa en nyt tiedä mitä tällä haetaan
public class JuridinenHenkilo extends Henkilo {

    private List<Henkilo> osakkaat = new ArrayList<>();

    public List<Henkilo> getOsakkaat() {
        return osakkaat;
    }

    public void setOsakkaat(List<Henkilo> osakkaat) {
        this.osakkaat = osakkaat;
    }
}
