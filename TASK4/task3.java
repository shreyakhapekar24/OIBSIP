import java.util.Scanner;
import java.util.jar.Attributes.Name;

class reg{
    Scanner sc = new Scanner(System.in);
    menu mn = new menu();

    void r1(){
        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter your email: ");
        String email = sc.nextLine();

        System.out.println("Enter your password: ");
        int password = sc.nextInt();

        System.out.println("Your registration has been successful!..");
        System.out.println("======== Login ========");

        while(true){
            System.out.println("Enter your email: ");
            String em = sc.next();
            System.out.println("Enter your password: ");
            int pw = sc.nextInt();

            if(em.equals(email) && pw == password){
                mn.m2();
                break;
            }
            else{
                System.out.println("Entered email or password is incorrect. ");
            }
        }
    }
}

class about{
    void display(){
        System.out.println("Name: Shreya Khapekar");
        System.out.println("Mail ID: shreyakhapekar24@gmail.com");
    }
}

class menu{
    java j = new java();
    cpp c = new cpp();
    python py = new python();

    about a = new about();
    Scanner sc = new Scanner(System.in);

    public void m2(){
        System.out.println("Login Successful!..");
        while(true){
            System.out.println("1. My Profile \n2. Exam \n3. About \n4. Exit");
            System.out.println("Choose your option: ");

            int opt = sc.nextInt();
            if(opt == 1){
                a.display();
                System.out.println("1.Back \n2. Exit");
                int g1 = sc.nextInt();
                if(g1 == 1){
                    System.out.println("\n");
                }
                else{
                    break;
                }
            }
            else if(opt == 2){
                System.out.println("1. JAVA \n2. C++ \n3. PYTHON");
                System.out.println("Choose any language ");
                int sub = sc.nextInt();

                if(sub == 1){
                    j.j1();
                }
                else if(sub == 2){
                    c.c1();
                }
                else if(sub == 3){
                    py.py1();
                }
                else{
                    System.out.println("Please enter the valid choice.");
                }
                System.out.println("1. Back \n2. Exit");
                int g2 = sc.nextInt();

                if(g2 == 1){
                    System.out.println("\n");
                }
                else{
                    break;
                }
            }
            else if(opt == 3){
                System.out.println("========== ONLINE EXAMINATION PORTAL ==========");
                System.out.println("Designed by Shreya Khapekar under the guidance of OASIS INFOBYTE");

                System.out.println("1. Back \n2. Exit");

                int g3 = sc.nextInt();
                if(g3 == 1){
                    System.out.println("\n");
                }
                else{
                    break;
                }
            }
            else if(opt == 4){
                break;
            }
            else{
                System.out.println("Please enter the valid choice ");
            }
        }
    }
}

class logA{
    Scanner sc = new Scanner("System.in");

    public void m1(){
        menu m = new menu();
        int pswd = 1234;
        System.out.println("Enter your Email ID: ");
        String s = sc.next();

        while(true){
            System.out.println("Enter your Password: ");
            int pw = sc.nextInt();

            if(pw == pswd){
                m.m2();
                break;
            }
            else{
                System.out.println("Entered Email ID or Password is incorrect");
            }
        }
    }
}

class java{
    Scanner sc = new Scanner(System.in);

    void j1(){
        int count=0;
        System.out.println("INSTRUCTIONS: ");
        System.out.println("There ae total 10 questions. Each question carry 2 marks.");
        System.out.println("Read each question carefully before marking an option. ");

        System.out.println("Qu. 1");
        System.out.println("Which of the following is not a Java features?");
        System.out.println("1. Dynamic");
        System.out.println("2. Architecture Neutral");
        System.out.println("3. Use of pointers");
        System.out.println("4. Object-oriented");
        int ans1 = sc.nextInt();
        if(ans1 == 3){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 2");
        System.out.println("What is used to find and fix bugs in the Java programs?");
        System.out.println("1. JVM");
        System.out.println("2. JRE");
        System.out.println("3. JDK");
        System.out.println("4. JDB");
        int ans2 = sc.nextInt();
        if(ans2 == 4){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 3");
        System.out.println("What is the return type of the hashCode() method in the Object class?");
        System.out.println("1. Object");
        System.out.println("2. int");
        System.out.println("3. long");
        System.out.println("4. void");
        int ans3 = sc.nextInt();
        if(ans3 == 2){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 4");
        System.out.println("What does the expression float a = 35 / 0 return?");
        System.out.println("1. 0");
        System.out.println("2. Not a Number");
        System.out.println("3. Infinity");
        System.out.println("4. Run time exception");
        int ans4 = sc.nextInt();
        if(ans4 == 3){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 5");
        System.out.println("Which of the following tool is used to generate API documentation in HTML format from doc comments in source code?");
        System.out.println("1. javap tool");
        System.out.println("2. javaw command");
        System.out.println("3. Javadoc tool");
        System.out.println("4. javah command");
        int ans5 = sc.nextInt();
        if(ans5 == 3){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 6");
        System.out.println("Which method of the Class.class is used to determine the name of a class represented by the class object as a String?");
        System.out.println("1. getClass()");
        System.out.println("2. intern()");
        System.out.println("3. getName()");
        System.out.println("4. toString()");
        int ans6 = sc.nextInt();
        if(ans6 == 3){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 7");
        System.out.println("In which process, a local variable has the same name as one of the instance variables?");
        System.out.println("1. Serialization");
        System.out.println("2. Variable Shadowing");
        System.out.println("3. Abstraction");
        System.out.println("4. Multi-threading");
        int ans7 = sc.nextInt();
        if(ans7 == 2){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 8");
        System.out.println("Which of the following is true about the anonymous inner class?");
        System.out.println("1. It has only methods");
        System.out.println("2. Objects can't be created");
        System.out.println("3. It has a fixed class name");
        System.out.println("4. It has no class name");
        int ans8 = sc.nextInt();
        if(ans8 == 4){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 9");
        System.out.println("Which package contains the Random class?");
        System.out.println("1. java.util package");
        System.out.println("2. java.lang package");
        System.out.println("3. java.awt package");
        System.out.println("4. java.io package");
        int ans9 = sc.nextInt();
        if(ans9 == 1){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 10");
        System.out.println(" An interface with no fields or methods is known as a ______.");
        System.out.println("1. Runnable Interface");
        System.out.println("2. Marker Interface");
        System.out.println("3. Abstract Interface");
        System.out.println("4. CharSequence Interface");
        int ans10 = sc.nextInt();
        if(ans10 == 2){
            count++;
        }
        else{
            count = count;
        }

        if(count > 8){
            System.out.println("Excellent Performance. ");
        }
        else if(count > 4 && count < 9){
            System.out.println("Better Performance. ");
        }
        else{
            System.out.println("Bad Performance. Better luck next time. ");
        }

        System.out.println("====================");
        System.out.println("Your total score is " + count*2);
        System.out.println("====================");
        System.out.println("Number of correctly answered questions are " + count);
        System.out.println("Summary: ");
        System.out.println("Qu.1 : Your chosen option is" + ans1 + ", Correct option is 3. \nQu.2 : Your chosen option is" + ans2 + ", Correct option is 4. \nQu.3: Your chosen option is " + ans3 + ", Correct option is 2. \nQu.4 : Your chosen option is " + ans3 + ", Correct option is 3. \nQu.5 : Your chosen option is " + ans5 + ", Correct option is 3. \nQu.6 : Your chosen option is " + ans6 + ", Correct option is 3. \nQu.7 : Your chosen option is " + ans7 + ", Correct option is 2. \nQu.8 : Your chosen option is " + ans8 + ", Correct option is 4. \nQu.9 : Your chosen option is " + ans9 + ", Correct option is 1. \nQu.10 : Your chosen option is " + ans10 + ", Correct option is 2.");
    }
}

class cpp{
    Scanner sc = new Scanner(System.in);

    void c1(){
        int count=0;
        System.out.println("INSTRUCTIONS: ");
        System.out.println("There ae total 10 questions. Each question carry 2 marks.");
        System.out.println("Read each question carefully before marking an option. ");

        System.out.println("Qu. 1");
        System.out.println("Which of the following is the correct syntax to print the message in C++ language?");
        System.out.println("1. Out <<'Hello world!;");
        System.out.println("2. Cout << Hello world! ;");
        System.out.println("3. cout <<'Hello world!';");
        System.out.println("4. None of the above");
        int ans1 = sc.nextInt();
        if(ans1 == 3){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 2");
        System.out.println("Which of the following is the address operator?");
        System.out.println("1. @");
        System.out.println("2. #");
        System.out.println("3. %");
        System.out.println("4. &");
        int ans2 = sc.nextInt();
        if(ans2 == 4){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 3");
        System.out.println("Which of the following is the correct identifier?");
        System.out.println("1. $var_name");
        System.out.println("2. VAR_123");
        System.out.println("3. varname@");
        System.out.println("4. None of the above");
        int ans3 = sc.nextInt();
        if(ans3 == 2){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 4");
        System.out.println("The programming language that has the ability to create new data types is called___.");
        System.out.println("1. Overloaded");
        System.out.println("2. Encapsulated");
        System.out.println("3. Extensible");
        System.out.println("4. Reprehensible");
        int ans4 = sc.nextInt();
        if(ans4 == 3){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 5");
        System.out.println("Which of the following is the original creator of the C++ language?");
        System.out.println("1. Dennis Ritchie");
        System.out.println("2. Ken Thompson");
        System.out.println("3. Bjarne Stroustrup");
        System.out.println("4. Brian Kernighan");
        int ans5 = sc.nextInt();
        if(ans5 == 3){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 6");
        System.out.println("Which of the following is the correct syntax to read the single character to console in the C++ language?");
        System.out.println("1. Read ch()");
        System.out.println("2. Getline vh()");
        System.out.println("3. get(ch)");
        System.out.println("4. Scanf(ch)");
        int ans6 = sc.nextInt();
        if(ans6 == 3){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 7");
        System.out.println("Which of the following statements is correct about the formal parameters in C++?");
        System.out.println("1. Parameters which are used in the definition of the function");
        System.out.println("2. Parameters with which functions are called");
        System.out.println("3. Variables other than passed parameters in a function");
        System.out.println("4. Variables that are never used in the function");
        int ans7 = sc.nextInt();
        if(ans7 == 2){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 8");
        System.out.println(" Which of the following features is required to be supported by the programming language to become a pure object-oriented programming language?");
        System.out.println("1. Encapsulation");
        System.out.println("2. Inheritance");
        System.out.println("3. Polymorphism");
        System.out.println("4. All of the above");
        int ans8 = sc.nextInt();
        if(ans8 == 4){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 9");
        System.out.println("The C++ language is ______ object-oriented language.");
        System.out.println("1. Semi Object-oriented or Partial Object-oriented");
        System.out.println("2. Pure Object oriented");
        System.out.println("3. Not Object oriented");
        System.out.println("4. None of the above");
        int ans9 = sc.nextInt();
        if(ans9 == 1){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 10");
        System.out.println("Which of the following comment syntax is correct to create a single-line comment in the C++ program?h no fields or methods is known as a ______.");
        System.out.println("1. /Comment/");
        System.out.println("2. //Comment");
        System.out.println("3. Comment//");
        System.out.println("4. None of the above");
        int ans10 = sc.nextInt();
        if(ans10 == 2){
            count++;
        }
        else{
            count = count;
        }

        if(count > 8){
            System.out.println("Excellent Performance. ");
        }
        else if(count > 4 && count < 9){
            System.out.println("Better Performance. ");
        }
        else{
            System.out.println("Bad Performance. Better luck next time. ");
        }

        System.out.println("====================");
        System.out.println("Your total score is " + count*2);
        System.out.println("====================");
        System.out.println("Number of correctly answered questions are " + count);
        System.out.println("Summary: ");
        System.out.println("Qu.1 : Your chosen option is" + ans1 + ", Correct option is 3. \nQu.2 : Your chosen option is" + ans2 + ", Correct option is 4. \nQu.3: Your chosen option is " + ans3 + ", Correct option is 2. \nQu.4 : Your chosen option is " + ans3 + ", Correct option is 3. \nQu.5 : Your chosen option is " + ans5 + ", Correct option is 3. \nQu.6 : Your chosen option is " + ans6 + ", Correct option is 3. \nQu.7 : Your chosen option is " + ans7 + ", Correct option is 2. \nQu.8 : Your chosen option is " + ans8 + ", Correct option is 4. \nQu.9 : Your chosen option is " + ans9 + ", Correct option is 1. \nQu.10 : Your chosen option is " + ans10 + ", Correct option is 2.");
    }
}

class python{
    Scanner sc = new Scanner(System.in);
    void py1(){
        int count=0;
        System.out.println("INSTRUCTIONS: ");
        System.out.println("There ae total 10 questions. Each question carry 2 marks.");
        System.out.println("Read each question carefully before marking an option. ");

        System.out.println("Qu. 1");
        System.out.println("Which of the following is the correct syntax to print the message in C++ language?");
        System.out.println("1. Out <<'Hello world!;");
        System.out.println("2. Cout << Hello world! ;");
        System.out.println("3. cout <<'Hello world!';");
        System.out.println("4. None of the above");
        int ans1 = sc.nextInt();
        if(ans1 == 3){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 2");
        System.out.println("Which character is used in Python to make a single line comment?");
        System.out.println("1. /");
        System.out.println("2. !");
        System.out.println("3. //");
        System.out.println("4. #");
        int ans2 = sc.nextInt();
        if(ans2 == 4){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 3");
        System.out.println(" In which year was the Python 3.0 version developed?");
        System.out.println("1. 2000");
        System.out.println("2. 2008");
        System.out.println("3. 2010");
        System.out.println("4. 2005");
        int ans3 = sc.nextInt();
        if(ans3 == 2){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 4");
        System.out.println("Which one of the following is the correct extension of the Python file?");
        System.out.println("1. .p");
        System.out.println("2. .python");
        System.out.println("3. .py");
        System.out.println("4. None of the above");
        int ans4 = sc.nextInt();
        if(ans4 == 3){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 5");
        System.out.println(" In which language is Python written?");
        System.out.println("1. English");
        System.out.println("2. PHP");
        System.out.println("3. C");
        System.out.println("4. All of the above");
        int ans5 = sc.nextInt();
        if(ans5 == 3){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 6");
        System.out.println("In which year was the Python language developed?");
        System.out.println("1. 1995");
        System.out.println("2. 1972");
        System.out.println("3. 1989");
        System.out.println("4. 1981");
        int ans6 = sc.nextInt();
        if(ans6 == 3){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 7");
        System.out.println("Who developed the Python language?");
        System.out.println("1. Zim Den");
        System.out.println("2. Guido van Rossum");
        System.out.println("3. Niene Stom");
        System.out.println("4. Wick van Rossum");
        int ans7 = sc.nextInt();
        if(ans7 == 2){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 8");
        System.out.println("What is the maximum possible length of an identifier?");
        System.out.println("1. 16");
        System.out.println("2. 32");
        System.out.println("3. 64");
        System.out.println("4. None of the above");
        int ans8 = sc.nextInt();
        if(ans8 == 4){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 9");
        System.out.println("What do we use to define a block of code in Python language?");
        System.out.println("1. Indentation");
        System.out.println("2. Key");
        System.out.println("3. Brackets");
        System.out.println("4. None of the above");
        int ans9 = sc.nextInt();
        if(ans9 == 1){
            count++;
        }
        else{
            count = count;
        }

        System.out.println("Qu. 10");
        System.out.println("What is the method inside the class in python language?");
        System.out.println("1. Object");
        System.out.println("2. Function");
        System.out.println("3. Attribute");
        System.out.println("4. Argument");
        int ans10 = sc.nextInt();
        if(ans10 == 2){
            count++;
        }
        else{
            count = count;
        }

        if(count > 8){
            System.out.println("Excellent Performance. ");
        }
        else if(count > 4 && count < 9){
            System.out.println("Better Performance. ");
        }
        else{
            System.out.println("Bad Performance. Better luck next time. ");
        }

        System.out.println("====================");
        System.out.println("Your total score is " + count*2);
        System.out.println("====================");
        System.out.println("Number of correctly answered questions are " + count);
        System.out.println("Summary: ");
        System.out.println("Qu.1 : Your chosen option is" + ans1 + ", Correct option is 3. \nQu.2 : Your chosen option is" + ans2 + ", Correct option is 4. \nQu.3: Your chosen option is " + ans3 + ", Correct option is 2. \nQu.4 : Your chosen option is " + ans3 + ", Correct option is 3. \nQu.5 : Your chosen option is " + ans5 + ", Correct option is 3. \nQu.6 : Your chosen option is " + ans6 + ", Correct option is 3. \nQu.7 : Your chosen option is " + ans7 + ", Correct option is 2. \nQu.8 : Your chosen option is " + ans8 + ", Correct option is 4. \nQu.9 : Your chosen option is " + ans9 + ", Correct option is 1. \nQu.10 : Your chosen option is " + ans10 + ", Correct option is 2.");
    }
}

public class task3 {
    public static void main(String[] args) {
        logA l1 = new logA();
        reg reg1 = new reg();
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Online Examination Portal!...");
        System.out.println("1. Login \n2. SignUp");
        System.out.println("Choose any option. ");
        int r = sc.nextInt();

        if(r==1){
            System.out.println("Welcome back");
            System.out.println("========== Login ==========");
            l1.m1();
        }
        else{
            System.out.println("========== Signup ==========");
            reg1.r1();
        }
    }
}
