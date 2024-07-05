# QuizMaker_2018

The project QUIZ MAKER is used to conduct an offline quiz contest in which five  questions will be displayed on the screen for the quizzee. The participant will manually enters  his answers and as soon as he finishes his test, the percentage of marks he scored will be  displayed. 

As the participant starts his test by clicking on ‘start’, five questions which were randomly picked from a set of ten, stored in distinct files will be displayed on the screen. The quizzee has to manually enter his answers in the text field provided below each question. As the quizzee clicks on ‘finish’, a report of his test will be displayed showing the marks he scored for each question out of 10 and his overall test percentage out of 100. When he clicks on ‘logout’, the participant has successfully finished his test and he can now proceed.

# Steps to run the program:
1. Install Java Development Kit (JDK)
2. Set Up Environment Variables
   Set up the JAVA_HOME and PATH environment variables:
   Right-click on This PC or Computer and select Properties.
   Click on Advanced system settings on the left side.
   Click on Environment Variables at the bottom right.
   In the System Variables section, click New to add a new variable:
   Variable name: JAVA_HOME
   Variable value: Path to your JDK installation directory (e.g., C:\Program Files\Java\jdk-11)
   Find the Path variable in the System variables section and click Edit:
   Add %JAVA_HOME%\bin to the end of the existing variable value.
   Click OK to save the changes.
3. Open Windows Command Prompt (CMD)
   Press Win + R, type cmd, and press Enter to open the Command Prompt.
4. Navigate to Your Java Source Code Directory
   Use the cd command to navigate to the directory where your Java source code (qm.java) is located. In your case, it's D:\2-2Projects\main programs and 
   projects\QuizMaker\QuizMaker:
   cd D:\2-2Projects\main programs and projects\QuizMaker\QuizMaker
5. Compile the Java Program
   Once you are in the correct directory, use the javac command to compile your Java program (qm.java):
   javac qm.java
   This command compiles qm.java and generates a qm.class file in the same directory if compilation is successful.
6. Run the Compiled Java Program
   After compiling successfully, you can run the compiled Java program using the java command:
   java qm.java
   Replace qm with the name of your Java class if it's different from the filename (qm.java)

Enjoy the Quiz!!
