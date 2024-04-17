Feature: user is able to login DDT
  @Regression
  Scenario Outline: user login by clicking "login" button DDT

    Given student is on login page
    When student types the <username> and <password>
    And clicks on the Login button DDT
    Then the student is sent  to the congratulations page
    Examples:
      | username | password |
      | lvmd_s1@yopmail.com | Test@123  |
      | lvmd_s2@yopmail.com | Test@123  |
      | lvmd_s3@yopmail.com | Test@123  |
      | lvmd_s4@yopmail.com | Test@123  |
      | lvmd_s5@yopmail.com | Test@123  |
      | lvmd_s6@yopmail.com | Test@123  |
      | lvmd_s7@yopmail.com | Test@123  |
      | lvmd_s8@yopmail.com | Test@123  |
      | lvmd_s9@yopmail.com | Test@123  |
      | lvmd_s10@yopmail.com | Test@123  |
      | lvmd_s11@yopmail.com | Test@123  |
      | lvmd_s12@yopmail.com | Test@123  |
      | lvmd_s13@yopmail.com | Test@123  |
      | lvmd_s14@yopmail.com | Test@123  |
      | lvmd_s15@yopmail.com | Test@123  |
      | lvmd_s16@yopmail.com | Test@123  |
      | lvmd_s17@yopmail.com | Test@123  |
      | lvmd_s18@yopmail.com | Test@123  |
      | lvmd_s19@yopmail.com | Test@123  |
      | lvmd_s20@yopmail.com | Test@123  |
      | lvmd_s21@yopmail.com | Test@123  |
      | lvmd_s22@yopmail.com | Test@123  |
      | lvmd_s23@yopmail.com | Test@123  |
      | lvmd_s24@yopmail.com | Test@123  |
      | lvmd_s251@yopmail.com | Test@123  |
      | lvmd_s26@yopmail.com | Test@123  |
      | lvmd_s27@yopmail.com | Test@123  |
      | lvmd_s28@yopmail.com | Test@123  |
      | lvmd_s29@yopmail.com | Test@123  |
      | lvmd_s30@yopmail.com | Test@123  |
      | lvmd_s31@yopmail.com | Test@123  |
      | lvmd_s32@yopmail.com | Test@123  |
      | lvmd_s33@yopmail.com | Test@123  |
      | lvmd_s34@yopmail.com | Test@123  |
      | lvmd_s35@yopmail.com | Test@123  |
      | lvmd_s36@yopmail.com | Test@123  |


