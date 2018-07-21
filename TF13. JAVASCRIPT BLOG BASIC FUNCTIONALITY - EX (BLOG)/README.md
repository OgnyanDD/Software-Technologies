# :triangular_ruler: Exercise: Javascript BLOG basic functionality

Problem for exercises and homework from the [Software Technologies](https://github.com/OgnyanDD/Software-Technologies) course @ [SoftUni](https://softuni.bg/).<br/>
Creating a **Blog** application with the **Express.js Framework**, from setting up the framework through ***authentication module***, ending up with creating a **CRUD** around **MySQL** entities using **Sequelize** object-document model module.<br/>
**I have implemented changes to the functionality of the BLOG and its design, which differ from its default idea in the task!**<br/>

**Sumary of my project:**
* Created a database with Heidi SQL;
* Defined users authentication parameters;
* Created new controllers;
* Created new models;
* New design of all pages;
* New functions and improvements:
  - new parameters have been added to register a new user;
  - the users can attache web images to the articles;
  - the users can get information about their profiles;
  - the users can edit and delete articles;
  - etc.<br/>
  
**Follow these steps to run the application:**
- Install node.js (if you not have it);
- Open CMD terminal in project folder;
- Write *"npm install --save sequelize mysql2 passport"* to take the dependeces;<br/>
- Initialize Sequelize with the following command:<br/>
*"sequelize init"*<br/>
There is a chance you hit on an error. You are missing another module that you need to install globally – sequelize-cli. Just run the following command:<br/>
*"npm install -g sequelize-cli"*<br/>

## Screen previews of my design in 768px mode:
![My Design](https://github.com/OgnyanDD/Software-Technologies/blob/master/TF13.%20JAVASCRIPT%20BLOG%20BASIC%20FUNCTIONALITY%20-%20EX%20(BLOG)/pic's/MyDesign.png)
<br/>
## Screen previews of default design in 768px mode:
![Default Design](https://github.com/OgnyanDD/Software-Technologies/blob/master/TF13.%20JAVASCRIPT%20BLOG%20BASIC%20FUNCTIONALITY%20-%20EX%20(BLOG)/pic's/DefaultDesign.png)
