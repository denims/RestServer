# RestServer
REST server using spring boot and hibernate 

Hibernate is configured for MySQL. 
Change the username and password for the DB in hibernate.cfg.xml if you are downloading and using.
You can change the database also in the same cfg file.

The application will add ten records to DB on startup and the same will be sent on query with the following URL
http://localhost:8080/message?no=2
