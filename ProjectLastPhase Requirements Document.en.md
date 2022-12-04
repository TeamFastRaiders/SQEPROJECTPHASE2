
## Overview

We have selected a project from our Software Construction and Development course that we are currently working on. The project, named LifeCare, is a Java-based application that allows patients and doctors to set appointments, and also provides the facility of a pharmacy.

  

We have specified the non-functional requirements below.

  

### Testing and Test Automation Framework Requirements

-   The tests shall be written in Gherkin language.
-   Test case definitions must be written in test files.
-   The tests shall be executed completed as well as partially in a random order.
-   Minimal test coverage shall be 95%.
-   Code coverage must be more than 95%.
-   Code coverage must be checked using JaCoCo.
-   The automation must include test runners and drivers.
-   Unit test cases must be automated using Selenium and Cucumber Java.
-   Unit test cases must be written using JUnit and Mockit.
-   Test case execution report must be prepared.
    

  

### Modularity Requirements

-   The Java code shall be divided into modules.
-   The UI logic of the presentation layer shall be in a separate module that launches the website.
-   The database logic shall be in a separate module.
-   The business logic shall be in a separate module.
-   Related classes shall be grouped together in folders named using self-descriptive names written in upper camelcase.
-   There shall be packages for related classes and modules.
-   Code shall be divided into the smallest possible classes.
-   For improving code quality, Checkstyle will be used as a linter.
    

  
  

### Process Requirements

-   We will be using GitHub for management.
-   There is one `main` branch and 3 separate branches for every member of the group.
-   Each member shall push the code to their branch only and create a pull request before merging it to the `main` branch.
-   There will be a weekly meeting every Friday at 9 p.m. when all the members will mutually go through the code and merge it into `main`.
-   We shall use GitHub issues for every feature and flag them as a feature.
-   We shall use GitHub issues for bugs found during testing and flag them as bugs.
    

  
  
  

### Performance Requirements

  

-   The application shall fetch data of doctors from all nearby Hospitals within 10 seconds
-   The application shall fetch data of stock/inventory from all nearby Clinics within 8 seconds
-   The application shall fetch data of tests from all nearby Pharmacies within 10 seconds
-   The application shall mute the notifications for the time intended by the user
-   The application shall have implemented cache with the use of JAVA Caching Library and the loading from cached memory shall be done within 5 seconds
-   The application shall be able to configure images using the transformings api within 5 seconds according to different screen sizes
-   The application shall implement Lazy Loading and the images of clinics/hospitals/pharmacies currently out of frame by 200x200 px shall not be loaded untill the the distance becomes 20x20 px
-   The application shall launch within 10 seconds
-   The application shall switch between 3 different categories within 5 seconds
-   The application shall allow users to log in within 10 seconds else it should timeout
-   The application shall be a PWA which should enable an improved user experience and offline browsing
-   The application shall not crash under extreme circumstances such as unavailability of resources i.e., RAM , CPU
-   The application shall forcefully exit within 5 seconds and logout the user if the connection to server is lost for more than 20 minutes
-   The application shall be able to handle 2000-5000 users at a time with normal response time of less than 2 seconds.
-   The application shall log out itself after 20 minutes of inactivity.
-   The application shall allow each GUI page to switch within 2 seconds
-   The application shall allow every page to load within 2-3 seconds
    

  

### Security Requirements

  

-   The application shall shut down within 5 seconds of cyber threat recognition.
-   The threat should be eradicated within 3-4 hours.
-   The application shall keep all the data backed up in a cloud server and the data shall be loaded within 20 minutes in case of an attack/data loss
-   The application shall not allow pharmacies to view data of other pharmacies
-   The application shall not allow users to view details of other users
-   The application shall not clinics to view details of other clinics
-   The application shall have implemented anti-bot / anti-automation technologies and shall detect bots/automation tools within 10 tries
-   The application shall have Captcha
-   The application shall verify the details of the user attempting to login with the data in database within 10 seconds
-   The application shall log out itself after 20 minutes of inactivity
-   The application shall be able to withstand any incoming cyber attacks for atleast 3 hours
-   The application shall  define the rights and permissions for users/third parties
-   The application shall use hashing to store user data and the data shall be stored within 10 seconds
-   The application shall fetch data using encryption algorithms to prevent malicious attacks midway
-   The application shall reserve the right to denial of service to users not complying with the procedures
    

### Reliability Requirements

-   The application shall not crash even if the user enters invalid credentials.
-   The application shall be deployed on cloud.
-   The application shall use Spring Cloud load balancer.
-   The application shall be able to process 1000 user requests at the same time without crashing.
-   The application shall continue working even if any one of its components fail.
-   The application shall be integrated with AWS for autoscaling, and load balancing.
    

### Documentation Requirements

-   The application shall have a tutorial video for the new users.
-   The application shall have a user manual with detailed instructions.
-   The application shall have comments in the code.
-   The application shall have an installation guide.
-   The application shall have a small description alongside every functionality.
-   The application shall have a well written SRS document.
