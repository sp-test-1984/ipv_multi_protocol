Feature: quick connect
    Scenario Outline: IPVanish should allow the user to connect through quick connect using different protocols
        Given IPVanish is accessible
        And I am logged
        When I select "<vpn_protocol>"
        And attempt connection
        Then I should successfully connect

    Examples: protocol permutations
    |protocol|
    |ikev2   |