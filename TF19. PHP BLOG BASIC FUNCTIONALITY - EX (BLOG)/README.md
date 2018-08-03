# :triangular_ruler: Exercise: PHP BLOG basic functionality

Problem for exercises and homework from the [Software Technologies](https://github.com/OgnyanDD/Software-Technologies) course @ [SoftUni](https://softuni.bg/).<br/>
Creating a **Blog** application with the **Symfony Framework**, from setting up the framework through the authentication module, to creating a **CRUD** around Doctrine entities.<br/>
**I have implemented changes to the functionality of the BLOG and its design, which differ from its default idea in the task!**<br/>

**Sumary of my project:**
* Created user entity;
* Setting up security configuration;
* Created login and register form;
* Created articles:
  - created the article entity;
  - added summary to the article entity;
  - created a relationship between the user and the article;
  - implemented article create function;
  - setted default values for our entities;
  - updated the DB with my article entity;
  - created the article controller;
  - created the article type form;
  - listed all articles;
* New functions and improvements:
  - new parameters have been added to register a new user;
  - the users can attache web images to the articles;
  - the users can get information about their profiles;
  - the users can edit and delete articles;
  - etc.<br/>
  
**Follow these steps to run the application:**

- Install composer (if you not have it);
- Start MySQL server to listen;
- Create data base with name "blog";
- Open CMD terminal in project folder;
- Write "composer install" to take the dependecies;
- Write "php doctrine:schema:update --force" to update the database;
- Write "php bin/console server:run" to start the project;<br/>


## Screen previews of my design in 768px mode:
![My Design](https://github.com/OgnyanDD/Software-Technologies/blob/master/TF19.%20PHP%20BLOG%20BASIC%20FUNCTIONALITY%20-%20EX%20(BLOG)/pic's/MyDesign.png)
<br/>
## Screen previews of default design in 768px mode:
![Default Design](https://github.com/OgnyanDD/Software-Technologies/blob/master/TF19.%20PHP%20BLOG%20BASIC%20FUNCTIONALITY%20-%20EX%20(BLOG)/pic's/DefaultDesign.png)
