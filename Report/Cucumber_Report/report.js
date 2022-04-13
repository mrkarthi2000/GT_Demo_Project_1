$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/HP/eclipse-workspace/Maven_Demo_Project/src/test/java/featurefile/Loginpage.feature");
formatter.feature({
  "line": 1,
  "name": "Adactin Feature",
  "description": "",
  "id": "adactin-feature",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "Login Page",
  "description": "",
  "id": "adactin-feature;login-page",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user lanching the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter \"\u003cUsername\u003e\" a username field",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter \"\u003cPassword\u003e\" a password field",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enter submit button",
  "keyword": "Then "
});
formatter.examples({
  "line": 10,
  "name": "",
  "description": "",
  "id": "adactin-feature;login-page;",
  "rows": [
    {
      "cells": [
        "Username",
        "Password"
      ],
      "line": 11,
      "id": "adactin-feature;login-page;;1"
    },
    {
      "cells": [
        "mrkarthikeyan",
        "Thinkdifferent@#123"
      ],
      "line": 12,
      "id": "adactin-feature;login-page;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 12,
  "name": "Login Page",
  "description": "",
  "id": "adactin-feature;login-page;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 5,
  "name": "user lanching the application",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user enter \"mrkarthikeyan\" a username field",
  "matchedColumns": [
    0
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user enter \"Thinkdifferent@#123\" a password field",
  "matchedColumns": [
    1
  ],
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user enter submit button",
  "keyword": "Then "
});
formatter.match({
  "location": "Audactin_SD.user_lanching_the_application()"
});
formatter.result({
  "duration": 2352216000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "mrkarthikeyan",
      "offset": 12
    }
  ],
  "location": "Audactin_SD.user_enter_a_username_field(String)"
});
formatter.result({
  "duration": 226330800,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Thinkdifferent@#123",
      "offset": 12
    }
  ],
  "location": "Audactin_SD.user_enter_a_password_field(String)"
});
formatter.result({
  "duration": 128763300,
  "status": "passed"
});
formatter.match({
  "location": "Audactin_SD.user_enter_submit_button()"
});
formatter.result({
  "duration": 714672900,
  "status": "passed"
});
formatter.scenario({
  "line": 14,
  "name": "Group of Hotel",
  "description": "",
  "id": "adactin-feature;group-of-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 15,
  "name": "user select the area location",
  "keyword": "Given "
});
formatter.step({
  "line": 16,
  "name": "user now select the hotels",
  "keyword": "When "
});
formatter.step({
  "line": 17,
  "name": "user select types of hotels",
  "keyword": "And "
});
formatter.step({
  "line": 18,
  "name": "user select the nos person stay in room",
  "keyword": "And "
});
formatter.step({
  "line": 19,
  "name": "user select adult are there",
  "keyword": "And "
});
formatter.step({
  "line": 20,
  "name": "user select Child are there",
  "keyword": "And "
});
formatter.step({
  "line": 21,
  "name": "user click the search button",
  "keyword": "Then "
});
formatter.match({
  "location": "Audactin_SD.user_select_the_area_location()"
});
formatter.result({
  "duration": 226732000,
  "status": "passed"
});
formatter.match({
  "location": "Audactin_SD.user_now_select_the_hotels()"
});
formatter.result({
  "duration": 368376500,
  "status": "passed"
});
formatter.match({
  "location": "Audactin_SD.user_select_types_of_hotels()"
});
formatter.result({
  "duration": 227021700,
  "status": "passed"
});
formatter.match({
  "location": "Audactin_SD.user_select_the_nos_person_stay_in_room()"
});
formatter.result({
  "duration": 188240900,
  "status": "passed"
});
formatter.match({
  "location": "Audactin_SD.user_select_adult_are_there()"
});
formatter.result({
  "duration": 223287700,
  "status": "passed"
});
formatter.match({
  "location": "Audactin_SD.user_select_Child_are_there()"
});
formatter.result({
  "duration": 131753600,
  "status": "passed"
});
formatter.match({
  "location": "Audactin_SD.user_click_the_search_button()"
});
formatter.result({
  "duration": 675107200,
  "status": "passed"
});
formatter.scenario({
  "line": 23,
  "name": "Avilable Hotel",
  "description": "",
  "id": "adactin-feature;avilable-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 24,
  "name": "user is select available hotels",
  "keyword": "Given "
});
formatter.step({
  "line": 25,
  "name": "user click the contine",
  "keyword": "Then "
});
formatter.match({
  "location": "Audactin_SD.user_is_select_available_hotels()"
});
formatter.result({
  "duration": 117556700,
  "status": "passed"
});
formatter.match({
  "location": "Audactin_SD.user_click_the_contine()"
});
formatter.result({
  "duration": 566079800,
  "status": "passed"
});
formatter.scenario({
  "line": 27,
  "name": "Book a Hotel",
  "description": "",
  "id": "adactin-feature;book-a-hotel",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 28,
  "name": "user enter the first name",
  "keyword": "Given "
});
formatter.step({
  "line": 29,
  "name": "user enter the last name",
  "keyword": "And "
});
formatter.step({
  "line": 30,
  "name": "user enter the billing name",
  "keyword": "And "
});
formatter.step({
  "line": 31,
  "name": "user enter the credit card no",
  "keyword": "And "
});
formatter.step({
  "line": 32,
  "name": "user enter the credit card type",
  "keyword": "And "
});
formatter.step({
  "line": 33,
  "name": "user enter the credit card expiry month",
  "keyword": "And "
});
formatter.step({
  "line": 34,
  "name": "user enter the credit card expiry Year",
  "keyword": "And "
});
formatter.step({
  "line": 35,
  "name": "finally user enter the credit card cvv no",
  "keyword": "Then "
});
formatter.match({
  "location": "Audactin_SD.user_enter_the_first_name()"
});
formatter.result({
  "duration": 123806300,
  "status": "passed"
});
formatter.match({
  "location": "Audactin_SD.user_enter_the_last_name()"
});
formatter.result({
  "duration": 129978000,
  "status": "passed"
});
formatter.match({
  "location": "Audactin_SD.user_enter_the_billing_name()"
});
formatter.result({
  "duration": 112140100,
  "status": "passed"
});
formatter.match({
  "location": "Audactin_SD.user_enter_the_credit_card_no()"
});
formatter.result({
  "duration": 157350300,
  "status": "passed"
});
formatter.match({
  "location": "Audactin_SD.user_enter_the_credit_card_type()"
});
formatter.result({
  "duration": 313508300,
  "status": "passed"
});
formatter.match({
  "location": "Audactin_SD.user_enter_the_credit_card_expiry_month()"
});
formatter.result({
  "duration": 342033100,
  "status": "passed"
});
formatter.match({
  "location": "Audactin_SD.user_enter_the_credit_card_expiry_Year()"
});
formatter.result({
  "duration": 225388600,
  "status": "passed"
});
formatter.match({
  "location": "Audactin_SD.finally_user_enter_the_credit_card_cvv_no()"
});
formatter.result({
  "duration": 94841800,
  "status": "passed"
});
});