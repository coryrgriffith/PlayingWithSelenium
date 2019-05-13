package com.example;

import junit.framework.TestCase;

public class PlayingWithSeleniumTest extends TestCase {

    public Actionwords actionwords = new Actionwords();

    public void testSearchEngineSearch() {
        // Given I open "http://google.com"
        actionwords.iOpenHttpGoogleCom("http://google.com");
        // When I search for "HipTest"
        actionwords.iSearchForP1("HipTest");
        // Then A link to "HipTest" is shown in the results
        actionwords.aLinkToP1IsShownInTheResults("HipTest");
        // When I click on "HipTest"
        actionwords.iClickOnHipTest("HipTest");
        // Then the url should be "http://hiptest.com"
        actionwords.theUrlShouldBeHttpHiptestCom("http://hiptest.com");
    }
}