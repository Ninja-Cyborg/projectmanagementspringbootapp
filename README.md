# About the App
### The webapp is designed to manage project assignment for employees. The application provides user actions based on roles assigned in database.

# Key Feature
- Spring Security signin and logout
- BCrypt Encrypted Passwords
- CRUD operations on a MySQL database
- Webbroswer templates design with Thymeleaf 

# Project setup
1. Creating Database
   Run scripts in sql_scripts folder: It will create database for employees, and setup Credentials and Roles
   - **Don't forget to add your own database credentials in application.properties file**
2. Install Apache Tomcat 9
3. Port setup: the port is set to 8089 through application.properties file

# Running Application:
- Run ProjectAssignerApplication.java on server
- Open http://localhost:8089/ in local browser
- Enter login credentials to directed page,
  demo credentials: ( username: meryl )    (password: user123)

# Sample shots
## HomePage (displaying username and roles) 
![image](https://user-images.githubusercontent.com/66517017/200052501-fac203ca-6077-483a-9ade-94920486132b.png)

## Search results
![image](https://user-images.githubusercontent.com/66517017/200052779-309f118b-fbc6-48f4-97e7-2e7bdf0a396f.png)


# Links
Tomcat 9: https://tomcat.apache.org/download-90.cgi
BCrypt password generation tool: https://bcrypt.online/
Mock data website: https://www.mockaroo.com/
