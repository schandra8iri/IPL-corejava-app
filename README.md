# IPL-CoreJava-

Simple implementation of Core Java

Create a develop branch and mark as default
Always create a new branch from develop to make change
Merge your branch to develop by a pull request
Merge develop to main end of every chapter and create a tag

Git command

    git status
    git clone
    git pull
    git checkout
    git branch
    git branch -a
    git add
    git commit -m "message"
    git push

JAVA

# CHAPTER 01 - Java class structure

### TODO - Create a new class to print teams

- create a java class name IPLApp.java that prints below lines
- Create a main method to print

      >> IPL TEAM - ROYAL CHALLENGERS BANGALORE
      >> CAPTAIN - Virat Koli
      >> WICKET KEEPER - AB de villers
      >> BATSMAN - DevDUtt Padikal
      >> BOWLER - Yuzvendra Chahal
      >> Total of 266 sixes
      >> Net run rate is 0.171
      >> not been knock out yet

- run IPLApp to print the lines

### TODO - Create a separate class for IPL team to print

- Create a new class called Teams
- Create method call printTeams()
- Create the object of the new class in main method
- Call the printTeams method from the new instance

### TODO - Create a field to hold the data and then print from them

- Create int, double, String, boolean and array vaiables

### TODO - Create more methord to add behaviour to teams

- Create setter and getters
- use getter to print data from main method
- set new value to the field and print from main
- Generate constructure using fields

### TODO - Create constructor to create any team + player class

- create multiple teams using constructor
- Create new instance by loading the constructor with all the required data
- Create seperate class to provide players

### TODO - Store players as collections and modify teams class

- Create a List of Strings to store the player details as Strings
- Update rest of the code to use them

### TODO - Players code is duplicated, pass players directly to teams

- Create a new class call players, which can provide players list
- initialise the players with csk and rcb list
- pass the players object to the teams 


### TODO - Represent each player as object with attributes

- Create a player class with required field
- Update players class to hold a list of Player
-

### TODO - Create toString methods for player class and players

- Override the tostring method in player to return each player as string
- Override the toString method in players to return string of all players

### TODO - Create a class for staff
- copy the player and Players class and update with staff and staffer

### TODO - Use ENUM where needed
- create enum type in player and staffer
- Create enum class for all team names 
- Use enums in all classes

### TODO - Player and staffer has duplicate code. use inheritance to slove this

- Create a super class call Person with name, age place attributes
- Extend player and staffer to Person and remove duplciate code
- update the main method
- Add new method called full name in person class 


### TODO - Write interface for player and teams for required methods

- create an Iplayer interface, declare method to get TotalScore, Total Wickets, Total Catcher
- Create an Iteams interface, declare method to get Total matcher, wins, sixes and netrunrate


### TODO - modify players to create an exception

- add traditional for loop in tostring(), run - app fails with exception
- add try catch block to handel the exception
- Modify gettotalsix method to throw an exception
- catch the exception in main method

### TODO - Create an initializer service to load all the initial data

- Create a Data Initialize interface to initTeams, player and staff
- Impliment the methods and copy the code from IPLApp to the method
- Problem, initailized data cannot be shared with other class
- Initialize data using the setter method instead of constructure

### TODO - Read the players txt file 
- Modify the player and staff to hold the team name
- Create  method using scanner to read the file
- use string.split, to get an array of data from the line
- add the data to the player
- create if look to find the gender
- create switch for role
- create a method in franchise to return the object for given text


### TODO - Impliment multithreading

- Create new calls to impliment thread
- copy the code to read data
- call the thread seperatly from main class 

### TODO - Store data in DB

- Create a DB called IPLDB in MySQL
- Create a interface for all type of storage
- Create an interface that makes and returns JDBC connection 
- Create Create an interface for player DAO, for all DB operation

### TODO - Appropriate packages

Create following packages, app, service, model, dbaccess, jobs, utils, etc
move classes accordingly 
create main and test folders


### TODO - Create a loops and block

### TODO - Create a loops and block

- Print array of teams using for loop
- Print array of

## Objects & Class

- Java class is a temple for an object that has behavior and state
- Both class name and file name has to be same, sould start with upper case
- public and static are the keywords for modifiers
- sysout-println is an example of java API's
- Object / instance of an object is created with new operator
- Class can inherit behaviour from another class by extending it
- Interface is a contract that a class that impliments has to obey
- Constructure to initialize the object
- Method start with verb / has a verb

## Datavariables

- Instance variable or the non-static variables are unique to the instance
- Class variable or the static variables are loaded once for a class
- Additionally Final keyword ensure the field is not modified
- Parameters and local variable are local to the method
- Use full words for field names, stating with lower case and then camel case
- For Final field use all uppercase
- Java is a statistically types language - type must be declated first
- Primitive datatype - byte, short, int, long, float, double, boolean, char
- Also supplies java.lang.String object
- Best practice is to intialize the fiels or the default value is 0 or NULL
- Array is an object that stores fixed number of single type
- Operators - Assignment, Arithmetic, and Unary Operators

- Equality, Relational, and Conditional Operators

      ==  equal to
      != not equal to
      > greater than
      >= greater than or equal to
      < less than
      <= less than or equal to
      && Conditional-AND
      || Conditional-OR
      ?: if-then-else

  instanceof

- Bitwise and Bit Shift Operators

## Package

- Package to group set of classes

## Modifiers

- Private & public - generally fields are private but can be accessed by public method

## Return

## Inheritance

## Interface

## Expressions, Statements, and Blocks

- if-then
- if-then-else
- if-else
- switch
- while
- dowhile
- for loop (initialize, condition, increament)
- for loop (iterator)
- break, continue, return
