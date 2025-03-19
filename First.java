class First{
	public static void main(String args[]){
		System.out.println("Hello I am writing my first code in java"+args[0]);
	}

	//run java First abc in cmd then args[0] will print abc 
}

/*

-------------
| Java Code |-->We write program in java file with .java extension and classname should be same as filename
-------------
    ^
    |
-------------
|   Javac    |-->Java Compiler used to convert java code into byte code (.class file)
-------------
    ^
    |
--------------
| Byte Code |-->JVM only understands Byte Code
--------------
    ^
    |
----------------------------------------------------------------------------
|                                                                                                            |
|		--------------------                                                                |
|		|          JRE           |--->Java Runtime Enviornment(JRE)        |
|		|        --------       |                                                                |
|		|        | JVM |       |                                                                |
|		|        --------       |                                                                |
|		|                           |                                                                |
|		---------------------                                                               |---->Java Development Kit(JDK)
|                                                              JDK                                        |
-----------------------------------------------------------------------------

Java Virtual Machine(JVM) it is platform dependent as diffrent jvm's are available for different os and application which we are building is platform independent...  JVM's first file in project should have Main Method (public static void main(String args[])) and then the connected files will be executed
JVM with libraries is a part of JRE(Java Runtime Enviornment). The program runs inside JRE and JVM runs/executes it. 
It follows WORA(Write Once Run Anywhere) concept as if we want to run the program on other computer where javac/JVM and JRE are not there only JDK is there.

JDK->Use for writing and compiling Java code
      ->It includes development tools like (compiler) + JRE
JRE->Running a Java application on a system
      ->It includes libraries to run Java application + JVM
JVM->Convert bytecode into native machine code
       ->It runs the java byte code and make java application to work on any platform.

    ^
    |
--------
|  OS  |-->Windows/MacOS/Linux
--------
    ^
    |
-------------
| Hardware |
-------------


*/