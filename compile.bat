jar cvf framework.jar -C framework/build/web/WEB-INF/classes/ etu001958
move /Y framework.jar Test/build/web/WEB-INF/lib/
jar cvf MonProjet.war -C  Test/build/web .  
Move-Item -Path MonProjet.war -Destination "C:\Program Files\Apache Software Foundation\Tomcat 9.0\webapps" -Force
