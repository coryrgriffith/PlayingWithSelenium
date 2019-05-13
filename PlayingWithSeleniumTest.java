package com.example;

import junit.framework.TestCase;

public class PlayingWithSeleniumTest extends TestCase {

    public Actionwords actionwords = new Actionwords();

    public void testSearchEngineSearch() {
        // Given I open "http://google.com"
        actionwords.iOpenWebAddress("http://google.com");
        // When I search for "HipTest"
        actionwords.iSearchForP1("HipTest");
        // Then A link to "HipTest" is shown in the results
        actionwords.aLinkToP1IsShownInTheResults("HipTest");
        // Then I click on the link
        actionwords.iClickOnTheLink();
    }
}