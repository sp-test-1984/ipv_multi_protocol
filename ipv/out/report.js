$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("quick_connect/quick_connect.feature");
formatter.feature({
  "line": 1,
  "name": "quick connect",
  "description": "",
  "id": "quick-connect",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 2,
  "name": "IPVanish should allow the user to connect through quick connect using different protocols",
  "description": "",
  "id": "quick-connect;ipvanish-should-allow-the-user-to-connect-through-quick-connect-using-different-protocols",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "IPVanish is accessible",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I am logged",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "I select \"\u003cvpn_protocol\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "attempt connection",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should successfully connect",
  "keyword": "Then "
});
formatter.examples({
  "line": 9,
  "name": "protocol permutations",
  "description": "",
  "id": "quick-connect;ipvanish-should-allow-the-user-to-connect-through-quick-connect-using-different-protocols;protocol-permutations",
  "rows": [
    {
      "cells": [
        "protocol"
      ],
      "line": 10,
      "id": "quick-connect;ipvanish-should-allow-the-user-to-connect-through-quick-connect-using-different-protocols;protocol-permutations;1"
    },
    {
      "cells": [
        "ikev2"
      ],
      "line": 11,
      "id": "quick-connect;ipvanish-should-allow-the-user-to-connect-through-quick-connect-using-different-protocols;protocol-permutations;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 682169579,
  "status": "passed"
});
formatter.scenario({
  "line": 11,
  "name": "IPVanish should allow the user to connect through quick connect using different protocols",
  "description": "",
  "id": "quick-connect;ipvanish-should-allow-the-user-to-connect-through-quick-connect-using-different-protocols;protocol-permutations;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 3,
  "name": "IPVanish is accessible",
  "keyword": "Given "
});
formatter.step({
  "line": 4,
  "name": "I am logged",
  "keyword": "And "
});
formatter.step({
  "line": 5,
  "name": "I select \"\u003cvpn_protocol\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "attempt connection",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I should successfully connect",
  "keyword": "Then "
});
formatter.match({
  "location": "IPVStepDefinitions.ipvanish_is_accessible()"
});
formatter.result({
  "duration": 154636914,
  "status": "passed"
});
formatter.match({
  "location": "IPVStepDefinitions.i_am_logged()"
});
formatter.result({
  "duration": 1789870,
  "error_message": "cucumber.api.PendingException: TODO: implement me\n\tat stackpath.step_definitions.IPVStepDefinitions.i_am_logged(IPVStepDefinitions.java:40)\n\tat ✽.And I am logged(quick_connect/quick_connect.feature:4)\n",
  "status": "pending"
});
formatter.match({
  "arguments": [
    {
      "val": "\u003cvpn_protocol\u003e",
      "offset": 10
    }
  ],
  "location": "IPVStepDefinitions.i_select(String)"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "IPVStepDefinitions.attempt_connection()"
});
formatter.result({
  "status": "skipped"
});
formatter.match({
  "location": "IPVStepDefinitions.i_should_successfully_connect()"
});
formatter.result({
  "status": "skipped"
});
});