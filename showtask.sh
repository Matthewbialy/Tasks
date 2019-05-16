#!/usr/bin/env bash

export CATALINA_HOME=/Users/Matys/Desktop/apache-tomcat-9.0.16

stop_tomcat()
{
  $CATALINA_HOME/bin/catalina.sh stop
}

start_runcrud.bat()
{
  $CATALINA_HOME/bin/runcrud.bat start
  end
}

export URL="http://localhost:8080/crud/v1/task/getTasks"

mgs="Successfully"

if ./runcrud.sh; then
lynx -dump http://localhost:8080/crud/v1/task/getTasks
else
    echo "There were errors"


end() {
  echo "Work is finished"
}
