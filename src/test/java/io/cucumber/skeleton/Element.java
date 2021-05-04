package io.cucumber.skeleton;

public abstract class Element {
    protected String googleURL = "https://google.com";
    protected String southwestURL = "https://southwest.com";

    //Round Trip and One-way Radio buttons
    protected String roundTripRadio = "#TabbedArea_4-panel-0 > div > div > div > form > div.search-form--options > div.search-form--options-trip > fieldset > ul > li:nth-child(1) > label > input";
    protected String oneWayRadio = "#TabbedArea_4-panel-0 > div > div > div > form > div.search-form--options > div.search-form--options-trip > fieldset > ul > li:nth-child(2) > label > input";

    //From and To Airport Fields
    protected String fromAirportField = "#LandingAirBookingSearchForm_originationAirportCode";
    protected String toAirportField = "#LandingAirBookingSearchForm_destinationAirportCode";

    protected String searchFlightButton = "#LandingAirBookingSearchForm_submit-button";
}
