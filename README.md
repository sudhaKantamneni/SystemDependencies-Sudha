# SystemDependencies-Sudha

Step1 :  In Eclipse we have to search for Git Repositories (Git) by typing Git on the right corner of Search Button
Step2 :  Use the below link of this Git project to add and clone the Project to local.
          URI: 
          https://git@github.com:sudhaKantamneni/SystemDependencies-Sudha.git
          select protocol  -->  HTTP
        
Step3 : Create new Project in local Eclipse by using the below steps:
        Click on File --> Import --> Select  Projects from Git --> Click Next --> Select Existing Local Repository
        Select the local git repository which we added in the Step2
        Select import Using the New Project Wizard radio button
        Click on Finish
        It will open New Project Window and Select --> Java Project
        Click on Next
        Give Project Name ( different name from the Git. Dont use the same project Name)
        Uncheck Use default location
        Browse the git Project Location ( usually it is default C:\Users\userName\git\ ) and select the git project
        Click on Finish.
        It craetes Lcoal Project with Git Code
        
 Step4 : Local File is input.txt and if we want to add any data or remove we can in the input.
 
 Step 5 : Run the Java main Class  --->Right click on Controller.java and select Run as Java Application
 
 Step 6 : After running the Class we get the Output as below in the System outout:
 
 
       DEPEND TELNET TCPIP NETCARD
DEPEND TCPIP NETCARD
DEPEND DNS TCPIP NETCARD

DEPEND BROWSER TCPIP HTML
INSTALL NETCARD
Installing NETCARD
INSTALL TELNET
Installing TCPIP
Installing TELNET
INSTALL foo
Installing foo
REMOVE NETCARD
NETCARD is still needed.
INSTALL BROWSER
Installing HTML
Installing BROWSER
INSTALL DNS
Installing DNS
LIST
NETCARD
TCPIP
TELNET
foo
HTML
BROWSER
DNS
REMOVE TELNET
Removing TELNET
REMOVE NETCARD
NETCARD is still needed.
REMOVE DNS
Removing DNS
REMOVE NETCARD
NETCARD is still needed.
INSTALL NETCARD
NETCARD is already installed.
REMOVE TCPIP
TCPIP is still needed.
REMOVE BROWSER
Removing BROWSER
Removing HTML
Removing TCPIP
REMOVE TCPIP
TCPIP is not installed.
END

Step7 : Run test case class DependencyManagerTest.java
