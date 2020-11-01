package org.bon.ohjelmointitehtava.tehtava1;

/**
 * Tommi
 * Date: 01/11/2020
 * Time: 20.09
 */

public class LuonnollinenHenkilo extends Henkilo {

    private String henkilotunnus;
    private String synnyinmaa;
    private String aidinkieli;
    private String sukupuoli;

    public String getHenkilotunnus() {
        return henkilotunnus;
    }

    public void setHenkilotunnus(String henkilotunnus) {
        this.henkilotunnus = henkilotunnus;
    }

    public String getSynnyinmaa() {
        return synnyinmaa;
    }

    public void setSynnyinmaa(String synnyinmaa) {
        this.synnyinmaa = synnyinmaa;
    }

    public String getAidinkieli() {
        return aidinkieli;
    }

    public void setAidinkieli(String aidinkieli) {
        this.aidinkieli = aidinkieli;
    }

    public String getSukupuoli() {
        return sukupuoli;
    }

    public void setSukupuoli(String sukupuoli) {
        this.sukupuoli = sukupuoli;
    }
}
