//OPERATING SYSTEM: WINDOWS

//PREREQUISITES:
//Frontend requisistes:
-Node.js and npm (node package manager) must be installed first. (I have node version 20.10.0 and npm version 10.2.5)
-Angular CLI. (Once node.js and npm are installed, use npm to install angular cli using cmd. type "npm install -g @angular/cli", I have angular version 17.0.9)

//Backend requisities:
-Eclipse IDE JAVA and Web Developers 2023-12
-Java SDK (I have java version 17.0.9)


//HOW TO ACCESS THE SYSTEM
Both the front and backend need to be running simultaneously for the system to work! Make sure the angular and spring front and backends are running first. 
Further instructions are provided below for how to do this.
Once both are running, the System can be accessed by navigating to "localhost:4200" in a browser where you can use the system as desired. 


//ANGULAR FRONT END
The frontend was created using Angular Framework. Please ensure Angular is installed as well as Node.js and npm.

I have Angular CLI version 17.0.9 for my project and Node version v20.10.0. 
To run the front end, navigate to /AngularAppCode directory and run "ng serve" in a command line terminal. This should run the angular front end.


//SPRING BOOT BACKEND
The backend was created using Spring Boot. I wrote my code in Eclipse IDE.
In the eclipse marketplace, please make sure you install "Spring Tools 4 (aka Spring Tool Suite 4) 4.22.0 Release
Pom.xml file and application properties in the directory structure should contain the necessary config details.
Make sure Java is available and installed if necessary. If you load the  folder structure into Eclipse IDE and go to src/main/java/com.example.premierleague folder,
right click on PremierleagueApplication.java and click Run As > Spring Boot App, it will begin to run the backend application. 



//SQL
The database was created using MySQL (workbench). Although the SQL tables should be generated automatically using JPA, I have provided the sql script code
to generate the tables separately if needed. Configuration details can be found in the application.properties file with the Spring Backend Code. 
Scripts for creating the schema and all of the tables are provided in the SQLDataBase folder in the directory structure in the gitlab repo.
Most tables are populated when needed automatically when the system is used. Role table may need data inserting, scripts for this is provided.Config details are below:

Name: Local instance MySQL80
Host: "localhost"
Port: 3306
Username: root  
password: SQLDBPassword1
database name: premierleague


//I am happy to help with setting up and running the system if assistance is needed.