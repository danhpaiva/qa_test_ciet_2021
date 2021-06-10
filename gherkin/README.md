<h1 align="center"> Automation Scenarios</h1>

<h3>Scenario 01</h3>

Functionality: Question Bank Search
Scenario: Search by nonexistent question
As I navigate to the question bank search page
And I type 'Science: Computers' into the search field.
When I click the search button
Then I get an error message with the text 'No questions found.'

<h3>Scenario 02</h3>

Functionality: Search by category
Scenario: Search for items by category in the question bank
As I navigate to the question bank search page
And I type 'Science: Computers' into the search field.
And select the 'Category' option
When I click the search button
Then I visualize a table with 25 items and the page control.

<h3>Scenario 03</h3>

Functionality: Creating an API route
Scenario: Link building with 10 mid-level questions
As I navigate to the API page
And I type the value '5' in the number of questions field,
And I select the 'medium' difficulty option in the combobox
And select the 'mythology' option in the category
When I click on the 'generate API URL' button
Then on the new page the API link is displayed.