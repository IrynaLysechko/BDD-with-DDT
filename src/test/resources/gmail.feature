Feature: Login gmail, send message to the incorrect email, verify warning message, enter
  correct email and send a message, verify that message present in "Sent email" folder

  Scenario Outline: send message
    When user login using email as <Email> and password as <Password>
    Then try to send message using incorrect email as <Incorrect email>, subject as <Subject>,  message text as <Text>
    And  waring message appears
    Then enter correct email as <Correct email> and send message
    And  verify that message with email as <Correct email> present in 'Sent messages' folder

    Examples:
      | Email                   | Password    | Incorrect email | Correct email             | Subject      | Text                     |
      | ta14051997@gmail.com    | Testing1405 | nonameemail@f   | iralysechko1497@gmail.com | Test Message | Hello from test account. |
      | testac1497@gmail.com    | Testing1405 | nonameemail@f   | iralysechko1497@gmail.com | Test Message | Hello from test account. |
      | javalabtestac@gmail.com | Testing1405 | nonameemail@f   | iralysechko1497@gmail.com | Test Message | Hello from test account. |
      | qatlab7@gmail.com       | Testing1405 | nonameemail@f   | iralysechko1497@gmail.com | Test Message | Hello from test account. |
      | qatestlab647@gmail.com  | Testing1405 | nonameemail@f   | iralysechko1497@gmail.com | Test Message | Hello from test account. |
