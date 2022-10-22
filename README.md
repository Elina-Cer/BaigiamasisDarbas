## Vilnius Coding School's Automation Testing Course.

## Baigiamasis darbas

## Automation tests for https://flowyy.lt/

### Link to the webpage - [www.flowyy.lt](https://flowyy.lt/)



## Test  - Login
1. Login positive test case: `Login Page`
- Enter email from Data provider to "email" input;
- Enter password from Data provider to password input ;
- Click "Login" button;

Expected result: The logged username should be the same as input email.

   

2. Login negative test: `Login Page`
    - Enter email from Data provider to "email" input;
    - Enter non-existing password to password input ;
    - Click "Login" button;

   Expected result: Login error message should be displayed.


3. Manage account test: : `Login Page`
   - Enter email from Data provider to "email" input;
   - Enter password from Data provider to password input ;
   - Click "Login" button;
   - enter user name;
   - enter user last name;
   - click button submit notification;

Expected result: message of account details have been successfully changed;

## Test  - Search
1. Search product test`Search Page`
   - click search button;
   - enter product to a search area (Brazil Santos) ;
   - click Search product;
    
Expected result: Message should contain that we have "Brazil Santos";
   
2. Add product to cart without logging`Search Page`
   - click on product from main page;
   - click on selected product from main page ;
   - click cart button;
   - read message from cart;

Expected result: Message should contain that “Raffaello” - įdėtas į krepšelį";

3.Add product to cart with logging`Search Page`
   - Enter email from Data provider to "email" input;
   - Enter password from Data provider to password input ;
   - Click "Login" button;
   - click on product from main page;
   - click on selected product from main page ;
   - click cart button;
   - read message from cart;

Expected result: Message should contain that “Raffaello” - įdėtas į krepšelį";