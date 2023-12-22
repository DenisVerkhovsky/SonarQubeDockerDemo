# generate OWASP reports
mvn clean install
# generate OWASP reports
mvn dependency-check:aggregate -PsonarReports
# actual SonarQube analysis
mvn verify sonar:sonar \
  -Dsonar.projectKey=SonarQubeDockerDemo \
  -Dsonar.host.url=http://localhost:9000 \
  -Dsonar.login=sqp_9d4b556af1f2ca64db6e681fd7a7b14fc49af76c