# SpringBootWithMYySQL
This application required mysql service running on 3306 port
#### prerequisite - 
* mysql, 
* Java 8

#### How to setup MySqL 
* Download MySQL zip package & Extract it.
* open command prompt/CLI on recently dowmlaoded MySQL package directory/bin.
* Initial setup (only first time) - 
  * `mysqld --console --initialize`   -->  will show temporary pasword. capture it
  *  `mysql -u root -p` --> This command will prompt for password. Enter password which you captured at last step. This command will force to reset passsword for first login. Run follwing command - 
`alter user 'root'@'localhost' identified by 'root'`
* MySQL Database initilization completed.
* If you are logging into MySQL second time (after intilization) -
  * open command prompt on MySQL Package directory /bin
  * mysqld --console
  * mysql -u root -p
  
