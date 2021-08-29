# we are extending everything from tomcat:8.0 image ...
FROM tomcat
MAINTAINER Rancho coder
# COPY path-to-your-application-war path-to-webapps-in-docker-tomcat
COPY target/BillionaireApp.war /usr/local/tomcat/webapps/