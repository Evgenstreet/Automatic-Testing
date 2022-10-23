**Test-cases** 

Web-site link:[ Graham ](https://graham1695.com/)

1. **Add watches to cart** 

*Preconditions:* 

Opened Main page of site *Test steps:* 



|# |Step description |Expected result |
| - | - | - |
|1 |Scroll down a page, choose one model from best sellers and click on image (Graham FORTRESS GMT B&B LTD) |A product page opened |
|2 |Click the button “Add to card” |Chosen watches successfully added to cart. Cart subpage is opened, where we can see subtotal cost of our cart. Now cart icon with yellow circle, which indicates that our cart isn’t empty |
2. **Add and remove the same watches to/from cart** 

*Preconditions:* 

*A product page opened Test steps:* 



|# |Step description |Expected result |
| - | - | - |
|1 |Click the button “Add to card” |Chosen watches successfully added to cart. Cart subpage is opened, amount of watches increased by one |
|2 |Click the “-” near the model of watches on cart subpage |Amount of watches decreased by one |
3. **Add another model of watches to cart** 

*Preconditions:* 

Opened Main page of site *Test steps:*



|# |Step description |Expected result |
| - | - | - |
|1 |Scroll down a page, choose one model from best sellers and click on image (Graham FORTRESS GMT BLUE) |A product page opened |
|2 |Click the button “Add to card” |Chosen watches successfully added to cart. Cart subpage is opened, where we can see all watches and amount of them in cart, subtotal cost of our cart.  |
4. **Removing watches from cart** 

*Preconditions:* 

Opened Main page of site *Test steps:*



|# |Step description |Expected result |
| - | - | - |
|1 |Click on cart icon on the upper right corner |A cart subpage successfully opened |
|2 |Click the “-” near the model (Graham FORTRESS GMT B&B LTD) of watches on cart subpage |Amount of watches decreased by one, and model removed from cart |


|3 |At amount input field near the model (Graham FORTRESS GMT BLUE) of watches input “0”  |Amount of watches is set to 0, and model removed from cart. On models list we see a message “Your cart is currently empty.”. Now cart icon without yellow circle. |
| - | :-: | :-: |
5. **Checking validation on input field for model amount**  

*Preconditions:* 

Opened Main page of site *Test steps:*



|# |Step description |Expected result |
| - | - | - |
|1 |Click on cart icon on the upper right corner |A cart subpage successfully opened |
|2 |Input a “1100” at input field of amount of watches |Amount of watches is autocorrects to maximum amount of watches (to 5) |
|3 |Input an “knrejfb” at input field of amount of watches |Amount of watches is autocorrects to basic (?) value (to 1) |
|4 |Input an “\_\*&^%” at input field of amount of watches |Amount of watches is autocorrects to basic (?) value (to 1) |
6. **Checking a search bar** 

*Preconditions:* 

Opened Main page of site *or* product page *Test steps:* 



|# |Step description |Expected result |
| - | - | - |


|1 |in search bar input “FORTRESS” |Search-result page is opened. Opened list of watches and specifications |
| - | :-: | :-: |
|2 |in search bar input “fdgoierhgu” |<p>Got a message:  0 results </p><p>Your search for "fdgoierhgu" did not yield any results </p>|
7. **Checking checking pop-up button “Quick view” (on mouse hover on the image of the model)** 

*Preconditions:* 

Opened Main page of site *Test steps:* 



|# |Step description |Expected result |
| - | - | - |
|1 |Scroll down a page, hover mouse cursor on the image |Appear a pop-up button “Quick view” |
|2 |Click on “Quick view” button |Opened a subpage, which are the smaller copy of a product page with the same functionality|
8. **Creating an account** 

*Preconditions:* 

Opened Main page of site *Test steps:* 



|# |Step description |Expected result |
| - | - | - |


|1 |Click on person icon on the upper right corner |Login page successfully opened |
| - | :-: | - |
|2 |Click on “Create account” |Register page successfully opened|
|3 |Input data for registration, after click button “create” |Register successfully, return to main page |
\*\*Note: the register page hasn’t validation for first and second names, they can be empty, consist of numbers and special symbols… Also there isn’t email verification (it can be even no- existing email). All what site check is “email and password field not equal null” -> bug or flaw 

9. **Log in & off your account** 

*Preconditions:* 

Opened Main page of site *Test steps:* 



|# |Step description |Expected result |
| - | - | - |
|1 |Click on person icon on the upper right corner |Login page successfully opened |
|2 |Enter valid email & password, click “sign in” |Account page successfully opened|
|3 |Click the “log out” button |Log out successful, return to main page |
10. **Logging in account (attempt to write DDT test)** 

*Preconditions:* 

Opened login page of the site *Test steps:* 



|**#** |**Description** |**Test steps** |**Test data** |**Expected results** |
| - | - | - | - | - |
|1 |Check login for valid users |<p>1) Enter email & password </p><p>2) Click “sign in” </p>|Username & password valid |Login success |
|2 |Check login for invalid users |<p>1) Enter email & password </p><p>2) Click “sign in” </p>|Username: valid Password: invalid |Login failed |
|3 |Check login for invalid users |<p>1) Enter email & password </p><p>2) Click “sign in” </p>|Username: invalid Password: valid |Login failed |
||Check login for invalid users |1)Enter email & password 2)Click “sign in” |Username: invalid Password: invalid |Login failed |
**//Pseudo Code** 

//Test step 0: read the data //N - count of users  

for(i = 0; i < N; i++){ 

//Read data from the file and memorizing it 

string login = System.in.readFromFile(0, i); string password = System.in.readFromFile(1, i); 

// Test step 1: Enter login and password: 

Database\_login.GetById(“login”); Database\_password.GetById(“password”); 

// Test step 2: Check data 

If (login.exists && password.exists)  { 

openAnAccount(login, password); returnToMainPage; 

} 

Else { 

Alert(Incorrect email or password); UpdateLoginPage; 

} 

} 

//UpdateLoginPage -> clears input fields 

**//Pseudo file with input test data** 



|Login |Password |
| - | - |
|valid |valid |
|valid |invalid |
|invalid |valid |
|invalid |invalid |
11. **Find manuals** 

*Preconditions:* 

Main page or collection page is opened *Test steps:* 



|# |Step description |Expected result |
| - | - | - |
|1 |Find an interesting model of watches and click on them |Product page is opened |
|2 |Click on “TECHNICAL SHEET AVAILABLE HERE” |Opened a pdf with watches specification|
12. **(Extra) Logging as a Graham owner** 

*Preconditions:* 

First way – from the main page, second – from menu bar at upper left corner *Test steps:* 

//first way 



|# |Step description |Expected result |
| - | - | - |
|1 |Scroll down to “are you a graham owner” section |Some information about advantages of being the graham owner |
|2 |Click the button “yes, i’m am” |Owners club page opened|
//second way 



|# |Step description |Expected result |
| - | - | - |
|1 |At menu navigation bar choose “Contact us” and “Are you a graham owner?” |Owners club page opened |
One problem here – there are nothing, except “{formbuilder:25977}” at the graham owners page. I don’t think that they checked users by IP-address. And, at my opinion, this page mustn’t exist or be clickable by any user right now 

//Also: website has his own captcha page. Nothing interesting in design – the same site, from functionality it’s has a standard captcha banner (browsing from Google Chrome). But after successfully passing the captcha, website redirect me to 404- page instead of product page… Redirection from captcha page works wrong. 
