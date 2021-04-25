package io.cucumber.skeleton;

public class Element {
    public static String googleURL = "https://google.com";
    public static String southwestURL = "https://southwest.com";

    //Round Trip and One-way Radio buttons
    public static String roundTripRadio = "#TabbedArea_4-panel-0 > div > div > div > form > div.search-form--options > div.search-form--options-trip > fieldset > ul > li:nth-child(1) > label > input";
    public static String oneWayRadio = "#TabbedArea_4-panel-0 > div > div > div > form > div.search-form--options > div.search-form--options-trip > fieldset > ul > li:nth-child(2) > label > input";

    //From and To Airport Fields
    public static String fromAirportField = "#LandingAirBookingSearchForm_originationAirportCode";
    public static String toAirportField = "#LandingAirBookingSearchForm_destinationAirportCode";

    public static String searchFlightButton = "#LandingAirBookingSearchForm_submit-button";
}
