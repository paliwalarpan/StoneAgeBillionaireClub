# we are extending everything from tomcat:8.0 image ...
FROM tomcat:8.0
MAINTAINER Rancho coder
# COPY path-to-your-application-war path-to-webapps-in-docker-tomcat
copy target/classes/h2.server.properties /root
COPY target/SpringRestApp.war /usr/local/tomcat/webapps/