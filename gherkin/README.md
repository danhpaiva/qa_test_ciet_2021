<h1 align="center"> Automation Scenarios</h1>

<h3>Scenario 01</h3>

Functionality: Question Bank Search<br>
Scenario: Search by nonexistent question<br>
As I navigate to the question bank search page<br>
And I type 'Science: Computers' into the search field.<br>
When I click the search button<br>
Then I get an error message with the text 'No questions found.'<br>

<h3>Scenario 02</h3>

Functionality: Search by category <br>
Scenario: Search for items by category in the question bank<br>
As I navigate to the question bank search page<br>
And I type 'Science: Computers' into the search field.<br>
And select the 'Category' option<br>
When I click the search button<br>
Then I visualize a table with 25 items and the page control.<br>

<h3>Scenario 03</h3>

Functionality: Creating an API route<br>
Scenario: Link building with 10 mid-level questions<br>
As I navigate to the API page<br>
And I type the value '5' in the number of questions field,<br>
And I select the 'medium' difficulty option in the combobox<br>
And select the 'mythology' option in the category<br>
When I click on the 'generate API URL' button<br>
Then on the new page the API link is displayed.<br>