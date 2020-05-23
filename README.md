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


Problem Statement
We want a program to automate the process of adding and removing components. To do this
we will maintain a record of installed components and component dependencies. A
component can be installed explicitly in response to a command (unless it is already installed),
or implicitly if it is needed for some other component being installed. Likewise, a component,
not explicitly installed, can be explicitly removed in response to a command (if it is not needed
to support other components) or implicitly removed if it is no longer needed to support
another component.

Input
The input will contain a sequence of commands (as described below), each on a separate line
containing no more than eighty characters. Item names are case sensitive, and each is no
longer than ten characters. The command names (DEPEND, INSTALL, REMOVE and LIST)
always appear in uppercase starting in column one, and item names are separated from the
command name and each other by one or more spaces. All appropriate DEPEND commands

will appear before the occurrence of any INSTALL command that uses them. There will be no
circular dependencies. The end of the input is marked by a line containing only the word END.

Command Interpretation
DEPEND item1 item2 [item3 ...] item1 depends on item2 (and item3 ...)
INSTALL item1 install item1 and those on which it depends
REMOVE item1 remove item1, and those on which it depends, if

possible.

LIST list the names of all currently installed components.

Output
Echo each line of input. Follow each echoed INSTALL or REMOVE line with the actions taken
in response, making certain that the actions are given in the proper order. Also identify
exceptional conditions (see Sample Output, below, for examples of all cases). For the LIST
command, display the names of the currently installed components in the installation order.
No output, except the echo, is produced for a DEPEND command or the line containing END.
There will be at most one dependency list per item.

Sample Input
DEPEND TELNET TCPIP NETCARD
DEPEND TCPIP NETCARD
DEPEND DNS TCPIP NETCARD
DEPEND BROWSER TCPIP HTML
INSTALL NETCARD
INSTALL TELNET
INSTALL foo
REMOVE NETCARD
INSTALL BROWSER
INSTALL DNS
LIST
REMOVE TELNET
REMOVE NETCARD
REMOVE DNS
REMOVE NETCARD
INSTALL NETCARD
REMOVE TCPIP
REMOVE BROWSER
REMOVE TCPIP
END

Sample Output
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
