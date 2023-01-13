Step 1: Download and install git from "https://git-scm.com/download/win".
Step 2: Open CMD/Terminal & change directory to path ( cd <project_path>) where you want to clone/download the project.
Step 3 :Initialize as GIT repo by executing "git init" command
Step 4: Clone the project in local system with GitHub CLI by executing command "gh repo clone gsingh127/TestDemo" in command prompt.Or you can also try GIT command to clone project in local - "git clone https://github.com/gsingh127/TestDemo.git"
Step 5: Download Apache Maven "apache-maven-3.8.7-bin.zip" from "https://maven.apache.org/download.cgi?."
Step 6: Set Environment variable and path variable in advance settings.
Step 7: Execute maven command to run project :  "mvn clean test -DsuiteXmlFile=testng.xml" to run the project.
Step 8: Check results in console or Refresh the project and check for Index.html in test-output folder.
