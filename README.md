<h3 align="center">Training Center Registry API</h1>
<h5> This API provides functionality to manage and retrieve information about government-funded training centers. It allows users to create new training centers, retrieve a list of all centers, and filter centers based on city and state. </h5>
<ol><h4>Mandatory Endpoints:</h4>
<ol>API 1 :- Create a New Training Center:
  <ul>1. URL: POST "/centers"</ul>
  <ul>2. Description: Creates and saves a new training center with the provided details.</ul>
  <ul>3. Request Body Format:</ul>
  <ul>![image](https://github.com/itzshubhamsingh/assignment/assets/82580966/3ebe3834-0e8b-4eb4-8ea4-fe1f91c14475)
</ul>
  <ul>4. Response: Returns the newly created training center details if successful.</ul>
</ol>
  <br>
<ol>API 2:- Get All Training Centers:
  <ul>1. URL: GET "/centers"</ul>
  <ul>2. Description: Retrieves a list of all training centers stored in the database.</ul>
  <ul>3. Response: Returns a JSON array containing all training center details.</ul>
</ol></ol>
<br>
<ol><h4>Additional Endpoints:</h4>
<ol>API 3:- Get Training Center by Center Code:
  <ul>1. URL: GET "/centers/{centerCode}"</ul>
  <ul>2. Description: Retrieves details of a training center based on its center code.</ul>
  <ul>3. Path Parameter: "{centerCode}" Unique identifier for the training center.</ul>
  <ul>4. Response: Returns the training center details if found, or a 404 Not Found error if the center does not exist.</ul>
</ol>
  <br>
<ol>API 4:- Filter Training Centers by City:
<ul>1. URL: GET "/centers/city/{cityName}"</ul>
<ul>2. Description: Filters training centers based on the provided city.</ul>
<ul>3. Response: Returns a JSON array containing training centers located in the specified city.</ul>
</ol>
  <br>
<ol>API 5:- Filter Training Centers by State:
<ul>1. URL: GET "/centers/state/{stateName}"</ul>
<ul>2. Description: Filters training centers based on the provided state</ul>
<ul>3. Response: Returns a JSON array containing training centers located in the specified state</ul>
</ol></ol>
<br>
<h4>Error Handling</h4>
  <ul>1. If validation errors occur during center creation, the API returns a 400 Bad Request with details of the validation errors.</ul>
  <ul>2. If an unexpected error occurs, the API returns a 500 Internal Server Error with a generic error message.</ul>
<h4>Technologies Used</h4>
  <ul>1. Java</ul>
  <ul>2. Spring Boot</ul>
  <ul>3. RESTful API design</ul>
  <ul>4. MongoDB Atlas for Database</ul>
  <ul>5. Maven for dependency management</ul>
<h4>How to Use</h4>
  <ul>1. Download the zip file from github and extract it in your system.</ul>
  <ul>2. Run the application on your ide.</ul>
  <ul>3. Check from the console the port number where the server is running (in most cases, it is port: 8080)</ul>
  <ul>4. Open the postman and write the url as mentioned above to test various APIs.</ul>
  <ul>5. For e.g., the url for getting the list of all training centers will be: (GET) "http://localhost:8080/centers"</ul>




