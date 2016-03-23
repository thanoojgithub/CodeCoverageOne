# CodeCoverageOne
Code Coverage using jacoco-maven-plugin with sonar


http://eclemma.org/jacoco/trunk/doc/examples/build/pom-offline.xml

http://docs.sonarqube.org/display/PLUG/JaCoCo+Plugin



mvn clean org.jacoco:jacoco-maven-plugin:prepare-agent install org.jacoco:jacoco-maven-plugin:report 
-Dmaven.test.failure.ignore=true sonar:sonar

(or) 

mvn clean install -Dmaven.test.failure.ignore=true sonar:sonar
