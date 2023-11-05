package com.example.javatutorial;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class TopicFragment extends Fragment implements TopicListner{

    ArrayList<TopicModel> arr;
    RecyclerView recyclerView;
    Activity context;
    SearchView searchView;
    RecycleTopicAdapter adapter;
    public TopicFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context = getActivity();
        // Inflate the layout for this fragment
        View root=inflater.inflate(R.layout.fragment_topic, container, false);
        return root;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        arr=new ArrayList<>();
        recyclerView = context.findViewById(R.id.topicrecycleview);
        searchView = context.findViewById(R.id.search);
        searchView.clearFocus();
        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String s) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String s) {
                filterlist(s);
                return true;
            }
        });
        setdata();
        //setAdapter();
        adapter = new RecycleTopicAdapter(getContext(), arr,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

    }

    void setdata(){

        arr.add(new TopicModel("Introduction","\n" +
                "Java is a simple and yet powerful object oriented programming language and it is in many respects similar to C++.\n" +
                "\n" +
                "Java is created by James Gosling from Sun Microsystems (Sun) in 1991. The first publicly available version of Java (Java 1.0) was released in 1995.\n" +
                "\n" +
                "Java is defined by a specification and consists of a programming language, a compiler, core libraries and a runtime machine(Java virtual machine).\n" +
                "\n" +
                "The Java runtime allows software developers to write program code in other languages than the Java programming language which still runs on the Java virtual machine.\n" +
                "\n" +
                "The Java platform is usually associated with the Java virtual machine and the Java core libraries.\n" +
                "\n" +
                "Java virtual machine\n" +
                "\n" +
                "The Java virtual machine (JVM) is a software implementation of a computer that executes programs like a real machine.\n" +
                "\n" +
                "Java Runtime Environment vs. Java Development Kit A Java distribution typically comes in two flavors, the Java Runtime Environment (JRE) and the Java Development Kit (JDK).\n" +
                "\n" +
                "The JRE consists of the JVM and the Java class libraries. Those contain the necessary functionality to start Java programs.\n" +
                "\n" +
                "The JDK additionally contains the development tools necessary to create Java programs. The JDK therefore consists of a Java compiler, the Java virtual machine and the Java class libraries."));


        arr.add(new TopicModel("Features","1. Simple\n" +
                "\n" +
                "Java is easy to learn and its syntax is quite simple and easy to understand.\n" +
                "\n" +
                "2. Object-Oriented\n" +
                "\n" +
                "In java everything is Object which has some data and behaviour. Java can be easily extended as it is based on Object Model.\n" +
                "\n" +
                "3. Platform independent\n" +
                "\n" +
                "Unlike other programming languages such as C, C++ etc which are compiled into platform specific machines. Java is guaranteed to be write-once, run-anywhere language.\n" +
                "\n" +
                "On compilation Java program is compiled into bytecode. This bytecode is platform independent and can be run on any machine, plus this bytecode format also provide security. Any machine with Java Runtime Environment can run Java Programs.\n" +
                "\n" +
                "4. Secured\n" +
                "\n" +
                "When it comes to security, Java is always the first choice. With java secure features it enable us to develop virus free, temper free system.Java program always runs in Java runtime environment with almost null interaction with system OS, hence it is more secure.\n" +
                "\n" +
                "5. Robust\n" +
                "\n" +
                "Java makes an effort to eliminate error prone codes by emphasizing mainly on compile time error checking and runtime checking. But the main areas which Java improved were Memory Management and mishandled Exceptions by introducing automatic Garbage Collector and Exception Handling.\n" +
                "\n" +
                "6. Architecture neutral\n" +
                "\n" +
                "Compiler generates bytecodes, which have nothing to do with a particular computer architecture, hence a Java program is easy to intrepret on any machine.\n" +
                "\n" +
                "7. Portable\n" +
                "\n" +
                "Java Bytecode can be carried to any platform. No implementation dependent features. Everything related to storage is predefined, example: size of primitive data types\n" +
                "\n" +
                "8. High Performance\n" +
                "\n" +
                "Java is an interpreted language, so it will never be as fast as a compiled language like C or C++. But, Java enables high performance with the use of just-in-time compiler.\n" +
                "\n" +
                "9. Multithreaded\n" +
                "\n" +
                "Java multithreading feature makes it possible to write program that can do many tasks simultaneously.Benefit of multithreading is that it utilizes same memory and other resources to execute multiple threads at the same time, like While typing, grammatical errors are checked along.\n" +
                "\n" +
                "10. Distributed\n" +
                "\n" +
                "We can create distributed applications in java. RMI and EJB are used for creating distributed applications. We may access files by calling the methods from any machine on the internet.\n" +
                "\n" +
                "11. Interpreted\n" +
                "\n" +
                "An interpreter is needed in order to run Java programs. The programs are compiled into Java Virtual Machine code called bytecode. The bytecode is machine independent and is able to run on any machine that has a Java interpreter. With Java,\n" +
                "\n" +
                "the program need only be compiled once, and the\n" +
                "\n" +
                "bytecode generated by the Java compiler can run on\n" +
                "\n" +
                "any platform."));


        arr.add(new TopicModel("Pros and Cons","Pros:\n" +
                "\n" +
                "1. Java is Simple\n" +
                "\n" +
                "2. Java is object-oriented because programming in Java is centered on creating objects, manipulating objects, and making objects work together. This allows you to create modular programs and reusable code.\n" +
                "\n" +
                "3. One of the most significant advantages of Java is Platform indenpendence.\n" +
                "\n" +
                "4. Java is Secure: Java is one of the first programming languages to consider security as part of its design.\n" +
                "\n" +
                "5. Java is Multithreaded: Multithreaded is the capability for a program to perform several tasks simultaneously within a program.\n" +
                "\n" +
                "6. Java is Robust: Robust means reliable and no programming language can really assure reliability.\n" +
                "\n" +
                "Cons:\n" +
                "\n" +
                "1. Java can be perceived as significantly slower and more memory-consuming than natively compiled languages such as C or C++.\n" +
                "\n" +
                "2. No local constants. In Java, variables that belong to a class can be made constant by declaring them to be final. Variables that are local to a method cannot be declared final, however.\n" +
                "\n" +
                "3. Java is predominantly a single-paradigm language. However, with the addition of static imports in Java 5.0 the procedural paradigm is better accommodated than in earlier versions of Java."));

        arr.add(new TopicModel("Environment Setup","We need to install the Java Development Toolkit aka JDK, which is bundled with the Java Runtime Environment.\n" +
                "\n" +
                "At this moment, the latest JDK versions is JDK 8. All you have to do is head to the main download page provided by Oracle, and download the latest version that you will find.\n" +
                "\n" +
                "Follow the instructions to download java and run the .exe to install Java on your machine.Once you installed Java on your machine, you would need to set environment variables to point to correct installation directories.\n" +
                "\n" +
                "Assuming you have installed Java in c:\\Program Files\\Java\\jdk\n" +
                "\n" +
                "1. Right-click on 'My Computer' and select 'Properties'.\n" +
                "\n" +
                "2. Click on the 'Environment variables' button under the 'Advanced' tab.\n" +
                "\n" +
                "3. Now, alter the 'Path' variable so that it also contains the path to the Java executable.\n" +
                "\n" +
                "Example, if the path is currently set to 'C:\\WINDOWS\\SYSTEM32', then change your path to read 'C:\\WINDOWS\\SYSTEM32; c:\\Program Files\\java\\jdk\\bin'.\n" +
                "\n" +
                "Setting up the path for Linux, Ubuntu, UNIX, Solaris Environment variable PATH should be set to point to where the Java binaries have been installed.\n" +
                "\n" +
                "Refer to your shell documentation if you have trouble doing this.\n" +
                "\n" +
                "Example, if you use bash as your shell, then you would add the following line to the end of your '.bashrc: export PATH=/path/to/java:$PATH'\n" +
                "\n" +
                "Up until now we have installed a variety of tools towards setting up our Java Development environment.\n" +
                "\n" +
                "Since the JDK is already installed (from step one) we could actually jump to coding just by using our text editor of choice (NotePad++, TextPad, NotePad, Ultra Edit etc)and invoking the javac and java commands from the command line.\n" +
                "\n" +
                "Free IDE for Java\n" +
                "\n" +
                "Netbeans: NetBeans IDE provides Java developers with all the tools needed to create professional desktop, mobile and enterprise applications.\n" +
                "\n" +
                "Eclipse:Eclipse is another free Java IDE for developers and programmers and it is mostly written in Java.Eclipse lets you create various cross platform Java applications for use on mobile, web, desktop and enterprise domains."));

        arr.add(new TopicModel("First Program","class Simple\n" +
                "\n" +
                "public static void main(String args[]){ System.out.println(\"Hello Java\"); } }\n" +
                "\n" +
                "save this file as Simple.java To compile:javac Simple.java To execute:java Simple It will give output as Hello Java\n" +
                "\n" +
                "Lets see what this is : class keyword is used to declare a class in java.\n" +
                "\n" +
                "public keyword is an access modifier which represents visibility, it means it is visible to all.\n" +
                "\n" +
                "static is a keyword, if we declare any method as static, it is known as static method. The main method is executed by the JVM, it doesn't require to create object to invoke the main method. So it saves memory.\n" +
                "\n" +
                "void is the return type of method, it means it doesn't return any value.\n" +
                "\n" +
                "main is a entry point of the program. Execution of programs starts from main. It is called by Runtime System\n" +
                "\n" +
                "String[] args is used for command line argument. We will learn it later.\n" +
                "\n" +
                "System.out.println() is used print statement."));
        arr.add(new TopicModel("Variables","A variable provides us with named storage that our programs can manipulate. Each variable in Java has a specific type, which determines the size and layout of the variable's memory; the range of values that can be stored within that memory; and the set of operations that can be applied to the variable.\n" +
                "\n" +
                "You must declare all variables before they can be used. The basic form of a variable declaration is shown here: data_type variable = value;\n" +
                "\n" +
                "Here data type is one of Java's datatypes and variable is the name of the variable. To declare more than one variable of the specified type, you can use a comma-separated list.\n" +
                "\n" +
                "Following are valid examples of variable declaration and initialization in Java: int a, b, c;\n" +
                "\n" +
                "//Declares three ints, a, b, and c.\n" +
                "\n" +
                "int a = 10, b = 10;\n" +
                "\n" +
                "// Example of initialization\n" +
                "\n" +
                "double pi = 3.14159;\n" +
                "\n" +
                "// declares and assigns a value of PI.\n" +
                "\n" +
                "char a = 'a\n" +
                "\n" +
                "// the char variable a iis initialized with value 'a'\n" +
                "\n" +
                "Constant: During the execution of program, value of variable may change. A constant represents permanent data that never changes.\n" +
                "\n" +
                "If you want use some value likes p=3.14159; no need to type every time instead you can simply define constant for p, following is the syntax for declaring constant.\n" +
                "\n" +
                "Static final datatype ConstantName value; =\n" +
                "\n" +
                "Example: static final float PI=3.14159;"));

        arr.add(new TopicModel("Data type\n",
                "Every variable in Java has a data type. Data types specify the size and type of values that can be stored.\n" +
                        "Data types in Java divided primarily in two tyeps: \n" +
                        "Primitive(intrinsic) and Non-primitive.\n" +
                        "\n" +
                        "Primitive types contains Integer, Floating points, Characters, Booleans And Non-primitive types contains Classes, Interface and Arrays.\n" +
                        "\n" +
                        "Integer:This group includes byte, short, int and long, which are whole signed numbers.\n" +
                        "Floating-point Numbers: This group includes float and double, which represent number with fraction precision.\n" +
                        "Characters: This group includes char, which represents character set like letters and number\n" +
                        "Boolean: This group includes Boolean, which is special type of representation of true or false value.\n" +
                        "\n" +
                        "Some data types with their range and size:\n" +
                        "byte: -128 to 127 (1 byte)\n" +
                        "\n" +
                        "short: -32,768 to +32,767 (2 bytes)\n" +
                        "\n" +
                        "int: -2,147,483,648 to +2,147,483,647 (4 bytes)\n" +
                        "\n" +
                        "float: 3.4e-038 to 1.7e+0.38 (4 bytes)\n" +
                        "\n" +
                        "double: 3.4e-038 to 1.7e+308 (8 bytes)\n" +
                        "\n" +
                        "char : holds only a single character(2 bytes)\n" +
                        "\n" +
                        "boolean : can take only true or false (1 bytes) \n" +
                        "\n" ));

        arr.add(new TopicModel("Variable scope",
                "There are three kinds of variables in Java:\n" +
                "\n" +
                "Local Variable:\n" +
                "1. A variable that is declared inside the method is called local variable.\n" +
                "2. Local variables are created when the method, constructor or block is entered and the variable will be destroyed once it exits the method, constructor or block.\n" +
                "3. Access modifiers cannot be used for local variables.\n" +
                "4. Local variables are visible only within the declared method, constructor or block.\n" +
                "5. There is no default value for local variables so local variables should be declared and an initial value should be assigned before the first use.\n" +
                "\n" +
                "Instance Variable\n" +
                "1. A variable that is declared inside the class but outside the method is called instance variable . It is not declared as static.\n" +
                "2. Instance variables are created when an object is created with the use of the keyword 'new' and destroyed when the object is destroyed.\n" +
                "3. Instance variables hold values that must be referenced by more than one method, constructor or block, or essential parts of an object's state that must be present throughout the class.\n" +
                "4. Instance variables can be declared in class level before or after use.\n" +
                "5. Access modifiers can be given for instance variables.\n" +
                "6. Instance variables have default values. For numbers the default value is 0, for Booleans it is false and for object references it is null. Values can be assigned during the declaration or within the constructor.\n" +
                "7. Instance variables can be accessed directly by calling the variable name inside the class. However within static methods and different class ( when instance variables are given accessibility) should be called using the fully qualified name . ObjectReference.VariableName.\n" +
                "\n" +
                "Class/static variables:\n" +
                "1. A variable that is declared as static is called static variable. It cannot be local.\n" +
                "2. Class variables also known as static variables are declared with the static keyword in a class, but outside a method, constructor or a block.\n" +
                "3. There would only be one copy of each class variable per class, regardless of how many objects are created from it.\n" +
                "4. Static variables are stored in static memory.\n" +
                "5. Static variables are created when the program starts and destroyed when the program stops.\n" +
                "6. Visibility is similar to instance variables.\n" +
                "7. Static variables can be accessed by calling with the class name ClassName.VariableName.\n" +
                "\n" +
                "Example\n" +
                "class A{ \n" +
                "int data=50;\n" +
                "//instance variable \n" +
                "\n" +
                "static int m=100;\n" +
                "//static variable \n" +
                "\n" +
                "void method(){ \n" +
                "int n=90;\n" +
                "//local variable \n" +
                "} \n" +
                "}//end of class A"));

        arr.add(new TopicModel("Typecasting",
                "Casting is an operation that converts a value of one data type into a value of another data type. \n" +
                "The syntax for type casting is to give the target type in parenthesis followed by the variable name.\n" +
                "\n" +
                "Example:\n" +
                "float f = (float) 10.1;\n" +
                "Int i = (int)f; \n" +
                "in this case, value of i is 10, the fractional part is discarded, while using type casting there is a chance of lost information that might lead to inaccurate result.\n" +
                "\n" +
                "Example:\n" +
                "int i = 10000;\n" +
                "byte s = (short) i;\n" +
                "In this example value of s becomes 10, which is totally distorted, to ensure correctness; you can test if the value is in the correct target type range before using type casting. \n" +
                "\n" +
                "Casts that results in no loss of information\n" +
                "byte =>short, char, int, long, float, double\n" +
                "\n" +
                "short =>int, long, float, double\n" +
                "\n" +
                "char =>int, long, float, double\n" +
                "\n" +
                "int => long, float, double\n" +
                "\n" +
                "long => float, double\n" +
                "\n" +
                "float => double\n"));

        arr.add(new TopicModel("Operators",
                "Java provides a rich set of operators to manipulate variables. We can divide all the Java operators into the following groups:\n" +
                "- Arithmetic Operators\n" +
                "- Relational Operators\n" +
                "- Bitwise Operators\n" +
                "- Logical Operators\n" +
                "- Assignment Operators\n" +
                "- Misc Operators\n" +
                "\n" +
                "Arithmetic Operators:\n" +
                "Arithmetic operators are used in mathematical expressions in the same way that they are used in algebra.\n" +
                "arithmetic operators:\n" +
                "+ Additive operator (also used for String concatenation)\n" +
                "- Subtraction operator\n" +
                "* Multiplication operator\n" +
                "/ Division operator\n" +
                "% Remainder operator\n" +
                "\n" +
                "Relational Operators:\n" +
                "There are following relational operators supported by Java language\n" +
                "> Greater than\n" +
                "< Less than\n" +
                "== Equal to\n" +
                "!= Not equal to\n" +
                ">= Greater than or equal to\n" +
                "<= Less than or equal to\n" +
                "\n" +
                "Bitwise Operators:\n" +
                "Java defines several bitwise operators, which can be applied to the integer types, long, int, short, char, and byte.\n" +
                "Bitwise operator works on bits and performs bit-by-bit operation. \n" +
                "\n" +
                "~ Unary bitwise complement\n" +
                "<< Signed left shift\n" +
                ">> Signed right shift\n" +
                ">>> Unsigned right shift & Bitwise AND\n" +
                "^ Bitwise exclusive OR\n" +
                "| Bitwise inclusive OR\n" +
                "\n" +
                "Logical Operators:\n" +
                "The following table lists the logical operators:\n" +
                "&& Conditional-AND\n" +
                "|| Conditional-OR\n" +
                "?: Ternary (shorthand for if-then-else statement)\n" +
                "\n" +
                "Assignment Operators:\n" +
                "There are following assignment operators supported by Java language:\n" +
                "= Simple assignment operator\n" +
                "+= Add AND assignment operator\n" +
                "-= Subtract AND assignment operator\n" +
                "*= Multiply AND assignment operator\n" +
                "/= Divide AND assignment operator\n" +
                "%= Modulus AND assignment operator\n" +
                "<<= Left shift AND assignment operator.\n" +
                ">>= Right shift AND assignment operator\n" +
                "&= Bitwise AND assignment operator.\n" +
                "^= bitwise exclusive OR and assignment operator.\n" +
                "|= bitwise inclusive OR and assignment operator.\n" +
                "\n" +
                "Increment and Decrement Operators\n" +
                "Increment and decrement operators are used to add or subtract 1 from the current value of oprand.\n" +
                "++ increment\n" +
                "-- decrement\n" +
                "\n" +
                "Increment and Decrement operators can be prefix or postfix. \n" +
                "In the prefix style the value of oprand is changed before the result of expression and in the postfix style the variable is modified after result.\n" +
                "\n" +
                "For eg.\n" +
                "a = 9;\n" +
                "b = a++ + 5;\n" +
                "/* a=10 b=14 */\n" +
                "\n" +
                "a = 9;\n" +
                "b = ++a + 5;\n" +
                "/* a=10 b=15 */\n" +
                "\n" +
                "Miscellaneous Operators\n" +
                "There are few other operators supported by Java Language.\n" +
                "Conditional Operator ( ? : )\n" +
                "Conditional operator is also known as the ternary operator.\n" +
                "The operator is written as:\n" +
                "variable x = (expression) ? value if true : value if false\n" +
                "\n" +
                "Instance of Operator:\n" +
                "This operator is used only for object reference variables.\n" +
                "instanceof operator is wriiten as:\n" +
                "( Object reference variable ) instanceof (class/interface type)\n"));

   arr.add(new TopicModel("Expression",
           "Expressions perform operations on data and move data around. Some expressions will be evaluated for their results, some for their side effects, some for both.\n" +
           "\n" +
           "An assignment expression has the following form.\n" +
           "variable-expression assignment-operator expression\n" +
           "\n" +
           "The variable expression can be just the name of a variable, or it can be an expression that selects a variable using array indices. The value type of the right-hand-side expression must be compatible with the variable type.\n" +
           "\n" +
           "An assignment expression is most often used for its side effect: it changes the value of the variable selected by the variable expression to the value of the expression on the right-hand side. The value of the assignment expression is the value that is assigned to the selected variable. \n" +
           "\n" +
           "An expression can have three kinds of result:\n" +
           "1. a value, such as the result of: (4 * i)\n" +
           "2. a variable, such as the result of: i = 4\n" +
           "3. nothing (in the case of an invocation of a method declared as void)\n" +
           "\n" +
           "In most common assignment expressions, the assignment operator is =. Then the assignment expression has the following form.\n" +
           "variable-expression = expression\n" +
           "\n" +
           "The Java arithmetic and bitwise operators can be combined with = to form assignment operators. \n" +
           "For example, the += assignment operator indicates that the right-hand side should be added to the variable, and the *= assignment operator indicates that the right-hand side should be multiplied into the variable. \n" +
           "\n" ));

        arr.add(new TopicModel("Operator precedence\n",
                "Certain operators have higher priorities than others. Operator precedence determines the grouping of terms in an expression. This affects how an expression is evaluated. for example, the dot operator has higher precedence than the any other operator.\n" +
                "\n" +
                "Precedence 15\n" +
                "() Parentheses\n" +
                "[] Array subscript\n" +
                "· Member selection\n" +
                "\n" +
                "Precedence 14\n" +
                "++ Unary post-increment\n" +
                "-- Unary post-decrement\n" +
                "\n" +
                "Precedence 13\n" +
                "+ Unary plus\n" +
                "- Unary minus\n" +
                "++ Unary pre-increment\n" +
                "-- Unary pre-decrement\n" +
                "! Unary logical negation\n" +
                "~ Unary bitwise complement\n" +
                "(type) Unary type cast \n" +
                "\n" +
                "Precedence 12\n" +
                "* Multiplication\n" +
                "/ Division\n" +
                "% Modulus\n" +
                "\n" +
                "Precedence 11\n" +
                "+ Addition\n" +
                "- Subtraction\n" +
                "\n" +
                "Precedence 10\n" +
                "<< Bitwise left shift\n" +
                ">> Bitwise right shift with sign extension\n" +
                ">>> Bitwise right shift with zero extension\n" +
                "\n" +
                "Precedence 9\n" +
                "< Relational less than\n" +
                "> Relational greater than\n" +
                "<= Relational less than or equal\n" +
                ">= Relational greater than or equal\n" +
                "instanceof Type comparison (objects only)\n" +
                "\n" +
                "Precedence 8\n" +
                "== Relational is equal to\n" +
                "!= Relational is not equal to\n" +
                "\n" +
                "Precedence 7\n" +
                "& Bitwise AND\n" +
                "\n" +
                "Precedence 6\n" +
                "^ \tBitwise exclusive OR \n" +
                "\n" +
                "Precedence 5\n" +
                "| Bitwise inclusive OR \n" +
                "\n" +
                "Precedence 4\n" +
                "&& Logical AND\n" +
                "\n" +
                "Precedence 3\n" +
                "|| Logical OR \n" +
                "\n" +
                "Precedence 2\n" +
                "? : Ternary conditional\n" +
                "\n" +
                "Precedence 1\n" +
                "= Assignment\n" +
                "+= Addition assignment\n" +
                "-= Subtraction assignment\n" +
                "*= Multiplication assignment\n" +
                "/= Division assignment\n" +
                "%= Modulus assignment\n" ));

        arr.add(new TopicModel("if statment",
                "if statement\n" +
                "An if statement contains a Boolean expression and block of statements enclosed within braces.\n" +
                "\n" +
                "if(conditional expression)\n" +
                "//statement or compound statement;\n" +
                "else \n" +
                "//optional\n" +
                "//statement or compound statement; \n" +
                "//optional\n" +
                "\n" +
                "If the Boolean expression is true then statement block is executed otherwise (if false) program directly goes to next statement without executing Statement block.\n" +
                "\n" +
                "if....else\n" +
                "If statement block with else statement is known as as if...else statement. Else portion is non-compulsory.\n" +
                "\n" +
                "if ( condition_one ) \n" +
                "{\n" +
                "//statements\n" +
                "}\n" +
                "else if ( condition_two )\n" +
                "{\n" +
                "//statements\n" +
                "}\n" +
                "else\n" +
                "{\n" +
                "//statements\n" +
                "}\n" +
                "\n" +
                "If the condition is true, then compiler will execute the if block of statements, if false then else block of statements will be executed.\n" +
                "\n" +
                "nested if...else\n" +
                "when a series of decisions are involved, we may have to use more than one if...else statement in nested form as follows:\n" +
                "\n" +
                "if(test condition1)\n" +
                "{\n" +
                "if(test condition2)\n" +
                "{\n" +
                "//statement1;\n" +
                "}\n" +
                "else\n" +
                "{\n" +
                "//statement2;\n" +
                "}\n" +
                "}\n" +
                "else\n" +
                "{\n" +
                "//statement3;\n" +
                "}\n" +
                "//statement x;\n" ));

        arr.add(new TopicModel("Switch statment",
                "A switch statement is used instead of nested if...else statements. It is multiple branch decision statement. \n" +
                "A switch statement tests a variable with list of values for equivalence. Each value is called a case.The case value must be a constant i.\n" +
                "\n" +
                "SYNTAX\n" +
                "switch(expression){\n" +
                "case constant:\n" +
                "//sequence of optional statements\n" +
                "break; //optional\n" +
                "case constant:\n" +
                "//sequence of optional statements\n" +
                "break; //optional\n" +
                ".\n" +
                ".\n" +
                ".\n" +
                "default : //optional\n" +
                "//sequence of optional statements\n" +
                "}\n" +
                "\n" +
                "\n" +
                "Individual case keyword and a semi-colon (:) is used for each constant. \n" +
                "Switch tool is used for skipping to particular case, after jumping to that case it will execute all statements from cases beneath that case this is called as ''Fall Through''.\n" +
                "\n" +
                "In the example below, for example, if the value 2 is entered, then the program will print two one something else!\n" +
                "\n" +
                "switch(i)\n" +
                "{\n" +
                "case 4: System.out.println(''four''); \n" +
                "break;\n" +
                "case 3: System.out.println(''three''); \n" +
                "break;\n" +
                "case 2: System.out.println(''two'');\n" +
                "case 1: System.out.println(''one'');\n" +
                "default: System.out.println(''something else!'');\n" +
                "}\n" +
                "\n" +
                "To avoid fall through, the break statements are necessary to exit the switch.\n" +
                "If value 4 is entered, then in case 4 it will just print four and ends the switch.\n" +
                "\n" +
                "The default label is non-compulsory, It is used for cases that are not present.\n" ));

        arr.add(new TopicModel("While loop",
                "Java while loop is used to execute statement(s) until a condition holds true.\n" +
                "SYNTAX\n" +
                "while (condition(s)) {\n" +
                "// statements\n" +
                "}\n" +
                "\n" +
                "If the condition holds true then the body of loop is executed, after execution of loop body condition is tested again and if the condition is true then body of loop is executed again and the process repeats until condition becomes false. \n" +
                "\n" +
                "1. Condition is always evaluated to true or false and if it is a constant, For example while (c) { …} where c is a constant then any non zero value of c is considered true and zero is considered false.\n" +
                "\n" +
                "2. You can test multiple conditions such as\n" +
                "\n" +
                "while ( a > b && c != 0) {\n" +
                "// statements\n" +
                "}\n" +
                "\n" +
                "Loop body is executed till value of a is greater than value of b and c is not equal to zero.\n" +
                "\n" +
                "3. Body of loop can contain more than one statement.\n" +
                "For multiple statements you need to place them in a block using {} and if body of loop contain only single statement you can optionally use {}. \n" +
                "\n" +
                "It is recommended to use braces always to make your program easily readable and understandable. \n" +
                "\n" ));

        arr.add(new TopicModel("For loop",
                "Java for loop used to repeat execution of statement(s) until a certain condition holds true. \n" +
                "The general form of the for statement can be expressed as follows:\n" +
                "\n" +
                "for (initialization; termination; increment)\n" +
                "{\n" +
                "statement(s)...\n" +
                "}\n" +
                "\n" +
                "You can initialize multiple variables, test many conditions and perform increments or decrements on many variables according to requirement. \n" +
                "All three components of for loop are optional. \n" +
                "\n" +
                "For example, to execute a statement 5 times:\n" +
                "for (i = 0; i < 5; i++)\n" +
                "statements...;\n" +
                "\n" +
                "\n" +
                "Another way of doing this is:i = 4;\n" +
                "while (i>=0)\n" +
                "statements...;\n" +
                "\n" ));

        arr.add(new TopicModel("Classes basics",
                "Classes\n" +
                "Java is a true object-oriented language and therefore the underlying structure of all Java programs is classes.\n" +
                "A class is nothing but a blueprint or a template for creating different objects which defines its properties and behaviours. Java class objects exhibit the properties and behaviours defined by its class. A class can contain fields and methods to describe the behaviour of an object.\n" +
                "\n" +
                "Defining a class\n" +
                "Once the class type has been defined, we can create ''variables'' of that type using declaration that are similar to the basic type declarations.In Java, these variables are termed as instances of classes, which are the actual objects.\n" +
                "The basic form of a class definition is :\n" +
                "\n" +
                "class classname [extends superclassname]\n" +
                "{\n" +
                " [ filelds declaration; ]\n" +
                " [ methods declaration; ]\n" +
                "}\n" +
                "\n" +
                "Fields\n" +
                "A Java field is a variable inside a class. For instance, in a class representing an employee, the Employee class might contain the following fields:\n" +
                "-name\n" +
                "-position\n" +
                "-salary\n" +
                "-hiredDate\n" +
                "\n" +
                "Field Declaration Syntax\n" +
                "A Java field is declared using the following syntax:\n" +
                "\n" +
                "[access_modifier] [static] [final] type name [= initial value] ;\n" +
                "The square brackets [ ] around some of the keywords mean that this option is optional. Only type and name are required.\n" +
                "\n" +
                "Methods\n" +
                "Methods are nothing but members of a class that provide a service for an object or perform some business logic. Java fields and member functions names are case sensitive. Current states of a class's corresponding object are stored in the object's instance variables. Methods define the operations that can be performed in Java programming.\n" +
                "\n" +
                "Method Declaration Syntax\n" +
                "type methodname (parameter-list)\n" +
                "{\n" +
                "  method body;\n" +
                "}\n" +
                "\n" +
                "Below is an example showing the Objects and Classes of the Cube class that defines 3 fields namely length, breadth and height. Also the class contains a member function getVolume().\n" +
                "\n" +
                "public class Cube {\n" +
                "\tint length;\n" +
                "\tint breadth;\n" +
                "\tint height;\n" +
                "\tpublic int getVolume() {\n" +
                "\t return (length * breadth * height);\n" +
                "\t}\n" +
                "}\n" +
                "\n"));

        arr.add(new TopicModel("Class Objects",
                "Classes\n" +
                "Java is a true object-oriented language and therefore the underlying structure of all Java programs is classes.\n" +
                "A class is nothing but a blueprint or a template for creating different objects which defines its properties and behaviours. Java class objects exhibit the properties and behaviours defined by its class. A class can contain fields and methods to describe the behaviour of an object.\n" +
                "\n" +
                "Defining a class\n" +
                "Once the class type has been defined, we can create ''variables'' of that type using declaration that are similar to the basic type declarations.In Java, these variables are termed as instances of classes, which are the actual objects.\n" +
                "The basic form of a class definition is :\n" +
                "\n" +
                "class classname [extends superclassname]\n" +
                "{\n" +
                " [ filelds declaration; ]\n" +
                " [ methods declaration; ]\n" +
                "}\n" +
                "\n" +
                "Fields\n" +
                "A Java field is a variable inside a class. For instance, in a class representing an employee, the Employee class might contain the following fields:\n" +
                "-name\n" +
                "-position\n" +
                "-salary\n" +
                "-hiredDate\n" +
                "\n" +
                "Field Declaration Syntax\n" +
                "A Java field is declared using the following syntax:\n" +
                "\n" +
                "[access_modifier] [static] [final] type name [= initial value] ;\n" +
                "The square brackets [ ] around some of the keywords mean that this option is optional. Only type and name are required.\n" +
                "\n" +
                "Methods\n" +
                "Methods are nothing but members of a class that provide a service for an object or perform some business logic. Java fields and member functions names are case sensitive. Current states of a class's corresponding object are stored in the object's instance variables. Methods define the operations that can be performed in Java programming.\n" +
                "\n" +
                "Method Declaration Syntax\n" +
                "type methodname (parameter-list)\n" +
                "{\n" +
                "  method body;\n" +
                "}\n" +
                "\n" +
                "Below is an example showing the Objects and Classes of the Cube class that defines 3 fields namely length, breadth and height. Also the class contains a member function getVolume().\n" +
                "\n" +
                "public class Cube {\n" +
                "\tint length;\n" +
                "\tint breadth;\n" +
                "\tint height;\n" +
                "\tpublic int getVolume() {\n" +
                "\t return (length * breadth * height);\n" +
                "\t}\n" +
                "}\n"));


        arr.add(new TopicModel("Constructors",
                "Constructor in java is a special type of method that is used to initialize the object.\n" +
                "Java constructor is invoked at the time of object creation. It constructs the values i.e. provides data for the object therefore it is known as constructor.\n" +
                "\n" +
                "Rules for creating java constructor\n" +
                "There are basically two rules defined for the constructor.\n" +
                "- Constructor name must be same as its class name\n" +
                "- Constructor must have no explicit return type\n" +
                "\n" +
                "Types of java constructors\n" +
                "There are two types of constructors:\n" +
                "Default constructor (no-arg constructor)\n" +
                "Parameterized constructor\n" +
                "\n" +
                "Java Default Constructor\n" +
                "A constructor that have no parameter is known as default constructor.\n" +
                "Syntax of default constructor:\n" +
                "<class_name>(){ } \n" +
                "\n" +
                "Example\n" +
                "In this example, we are creating the no-arg constructor in the Bike class. It will be invoked at the time of object creation.\n" +
                "\n" +
                "class Bike1{ \n" +
                "Bike1(){\n" +
                "System.out.println(\"Bike is created\");\n" +
                "} \n" +
                "public static void main(String args[]){ \n" +
                "Bike1 b=new Bike1(); \n" +
                "} \n" +
                "} \n" +
                "\n" +
                "Java parameterized constructor\n" +
                "A constructor that have parameters is known as parameterized constructor.\n" +
                "\n" +
                "Why use parameterized constructor?\n" +
                "Parameterized constructor is used to provide different values to the distinct objects.\n" +
                "\n" +
                "Example\n" +
                "In this example, we have created the constructor of Student class that have two parameters. We can have any number of parameters in the constructor.\n" +
                "\n" +
                "class Student4{ \n" +
                "int id; \n" +
                "String name; \n" +
                "Student4(int i,String n){ \n" +
                "id = i; \n" +
                "name = n; \n" +
                "} \n" +
                "\n" +
                "void display(){\n" +
                "System.out.println(id+\" \"+name);\n" +
                "} \n" +
                "\n" +
                "public static void main(String args[]){ \n" +
                "Student4 s1 = new Student4(111,\"Karan\"); \n" +
                "Student4 s2 = new Student4(222,\"Aryan\"); \n" +
                "s1.display(); \n" +
                "s2.display(); \n" +
                "} \n" +
                "} \n" +
                "\n" ));

        arr.add(new TopicModel("Method Overloading",
                "If a class have multiple methods by same name but different parameters, it is known as Method Overloading.\n" +
                "If we have to perform only one operation, having same name of the methods increases the readability of the program.\n" +
                "\n" +
                "Suppose you have to perform addition of the given numbers but there can be any number of arguments, if you write the method such as a(int,int) for two parameters, and b(int,int,int) for three parameters then it may be difficult for you as well as other programmers to understand the behaviour of the method because its name differs. \n" +
                "\n" +
                "So, we perform method overloading to figure out the program quickly. \n" +
                "\n" +
                "Argument lists could differ in:\n" +
                "1. Number of parameters.\n" +
                "2. Data type of parameters.\n" +
                "3. Sequence of Data type of parameters.\n" +
                "\n" +
                "Method overloading is also known as Static Polymorphism.\n" +
                "\n" +
                "Points to Note:\n" +
                "1. Static Polymorphism is also known as compile time binding or early binding.\n" +
                "2. Static binding happens at compile time. Method overloading is an example of static binding where binding of method call to its definition happens at Compile time.\n" +
                "\n" +
                "There are two ways to overload the method in java\n" +
                "1. By changing number of arguments\n" +
                "2. By changing the data type\n" +
                "\n" +
                "1. By changing number of arguments\n" +
                "class DisplayOverloading\n" +
                "{\n" +
                "public void disp(char c)\n" +
                "{\n" +
                "System.out.println(c);\n" +
                "}\n" +
                "public void disp(char c, int num) \n" +
                "{\n" +
                "System.out.println(c + \" \"+num);\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "class Sample\n" +
                "{\n" +
                "public static void main(String args[])\n" +
                "{\n" +
                "DisplayOverloading obj = new DisplayOverloading();\n" +
                "obj.disp('a');\n" +
                "obj.disp('a',10);\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "Output:\n" +
                "a\n" +
                "a 10\n" +
                "\n" +
                "2. By changing the data type\n" +
                "class DisplayOverloading\n" +
                "{\n" +
                "public void disp(char c)\n" +
                "{\n" +
                "System.out.println(c);\n" +
                "}\n" +
                "public void disp(int c)\n" +
                "{\n" +
                "System.out.println(c );\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "class Sample2\n" +
                "{\n" +
                "public static void main(String args[])\n" +
                "{\n" +
                "DisplayOverloading obj = new DisplayOverloading();\n" +
                "obj.disp('a');\n" +
                "obj.disp(5);\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "Output:\n" +
                "a\n" +
                "5\n" +
                "\n"));


        arr.add(new TopicModel("Method Overriding",
                "If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in java.\n" +
                "In other words, If subclass provides the specific implementation of the method that has been provided by one of its parent class, it is known as method overriding.\n" +
                "\n" +
                "Rules for method overriding:\n" +
                "1. The argument list should be exactly the same as that of the overridden method.\n" +
                "2. The return type should be the same or a subtype of the return type declared in the original overridden method in the superclass.\n" +
                "3. The access level cannot be more restrictive than the overridden method's access level.\n" +
                "4. Instance methods can be overridden only if they are inherited by the subclass.\n" +
                "5. A method declared final cannot be overridden.\n" +
                "6. A method declared static cannot be overridden but can be re-declared.\n" +
                "7. If a method cannot be inherited, then it cannot be overridden.\n" +
                "8. A subclass within the same package as the instance's superclass can override any superclass method that is not declared private or final.\n" +
                "9. A subclass in a different package can only override the non-final methods declared public or protected.\n" +
                "10. Constructors cannot be overridden.\n" +
                "\n" +
                "Advantage:\n" +
                "The main advantage of method overriding is that the class can give its own specific implementation to a inherited method without even modifying the parent class(base class).\n" +
                "\n" +
                "Example: \n" +
                "class Base{\n" +
                "public void display()\n" +
                "{\n" +
                "System.out.println(\"this is base class\");\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "class Child extends Base{\n" +
                "public void display(){\n" +
                "System.out.println(\"this is child class\");\n" +
                "}\n" +
                "public static void main( String args[]) {\n" +
                "Child obj = new Child();\n" +
                "obj.display();\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "output\n" +
                "this is child class\n" +
                "\n" +
                "Using the super keyword:\n" +
                "When invoking a base class version of an overridden method the super keyword is used.class Base{\n" +
                "public void display()\n" +
                "{\n" +
                "System.out.println(\"this is base class\");\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "class Child extends Base{\n" +
                "public void display(){\n" +
                "super.display(); // invokes the super class method System.out.println(\"this is child class\");\n" +
                "}\n" +
                "public static void main( String args[]) {\n" +
                "Child obj = new Child();\n" +
                "obj.display();\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "output\n" +
                "this is base class\n" +
                "this is child class\n" +
                "\n"));


        arr.add(new TopicModel("Static Keyword",
                "The static keyword in java is used for memory management mainly. We can apply java static keyword with variables, methods, blocks and nested class. The static keyword belongs to the class than instance of the class.\n" +
                "\n" +
                "The static can be:\n" +
                "1. variable (also known as class variable)\n" +
                "2. method (also known as class method)\n" +
                "3. block\n" +
                "4. nested class\n" +
                "\n" +
                "Variables and methods marked static belong to the class rather than to any particular instance of the class. These can be used without having any instances of that class at all. Only the class is sufficient to invoke a static method or access a static variable. A static variable is shared by all the instances of that class i.e only one copy of the static variable is maintained.\n" +
                "\n" +
                "class Counter\n" +
                "{\n" +
                "static int animalCount=0;\n" +
                "public Counter()\n" +
                "{\n" +
                "count+=1;\n" +
                "}\n" +
                "public static void main(String[] args)\n" +
                "{\n" +
                "new Counter();\n" +
                "new Counter();\n" +
                "new Counter();\n" +
                "System.out.println(''The Number of Animals is: ''+count);\n" +
                "}\n" +
                "}\n" +
                "Output:\n" +
                "The Number of Animals is: 3.\n" +
                "\n" +
                "A static method cannot access non-static/instance variables, because a static method is never associated with any instance.The same applies with the non-static methods as well, a static method can't directly invoke a non-static method.But static method can access non-static methods by means of declaring instances and using them.\n" +
                "\n" +
                "Accessing static variables and methods\n" +
                "In case of instance methods and instance variables, instances of that class are used to access them.\n" +
                "\n" +
                "<objectReference>.<instanceVariable>\n" +
                "<objectReference>.<instanceMethod>\n" +
                "\n" +
                "class Counter\n" +
                "{\n" +
                "static int count=0;\n" +
                "public Counter()\n" +
                "{\n" +
                "count+=1;\n" +
                "}\n" +
                "public static int getCount()\n" +
                "{\n" +
                "return count;\n" +
                "}\n" +
                "}\n" +
                "class TestAnimal\n" +
                "{\n" +
                "public static void main(String[] args)\n" +
                "{\n" +
                "new Counter();\n" +
                "new Counter();\n" +
                "new Counter();\n" +
                "System.out.println(''The Counter is: ''+ Counter.getCount());\n" +
                "\n" +
                "/*Notice the way in which the Static method is called using the class name followed by static method. */\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "Remember that static methods can't be overridden. They can be redefined in a subclass, but redifining and overriding aren't the same thing. Its called as Hiding.\n" +
                "\n"));


        arr.add(new TopicModel("Inheritance",
                "Inheritance is one of the key features of Object Oriented Programming. \n" +
                "Inheritance provided mechanism that allowed a class to inherit property of another class.When a Class extends another class it inherits all non-private members including fields and methods.\n" +
                "\n" +
                "The class which inherits the properties of other is known as subclass (derived class, child class) and the class whose properties are inherited is known as superclass (base class, parent class). \n" +
                "\n" +
                "Inheritance defines is-a relationship between a Super class and its Sub class. extends and implements keywords are used to describe inheritance in Java.\n" +
                "\n" +
                "Why use inheritance in java\n" +
                "-For Method Overriding (so runtime polymorphism can be achieved).\n" +
                "-For Code Reusability.\n" +
                "\n" +
                "Syntax of Java Inheritance\n" +
                "class Subclass-name extends Superclass-name\n" +
                "{ \n" +
                "//methods and fields\n" +
                "}\n" +
                "\n" +
                "extends is the keyword used to inherit the properties of a class.\n" +
                "\n" +
                "super keyword\n" +
                "In Java, super keyword is used to refer to immediate parent class of a class. In other words super keyword is used by a subclass whenever it need to refer to its immediate super class.\n" +
                "\n"));


        arr.add(new TopicModel("Types of Inheritance",
                "Syntax of Java Inheritance\n" +
                "Single inheritance is damn easy to understand. When a class extends another one class only then we call it a single inheritance. The below example shows that class B extends only one class which is A. Here A is a parent class of B and B would be a child class of A.\n" +
                "\n" +
                "class A{\n" +
                "}\n" +
                "class B extends A{\n" +
                "}\n" +
                "\n" +
                "2) Multiple Inheritance\n" +
                "''Multiple Inheritance'' refers to the concept of one class extending (Or inherits) more than one base class. The inheritance we learnt earlier had the concept of one base class or parent. The problem with ''multiple inheritance'' is that the derived class will have to manage the dependency on two base classes.\n" +
                "\n" +
                "Most of the new OO languages like Small Talk, Java, C# do not support Multiple inheritance. Multiple Inheritance is supported in C++.\n" +
                "\n" +
                "class A{\n" +
                "}\n" +
                "class B{\n" +
                "}\n" +
                "class C extends A,B{\n" +
                "}\n" +
                "\n" +
                "3) Multilevel Inheritance\n" +
                "Multilevel inheritance refers to a mechanism in OO technology where one can inherit from a derived class, thereby making this derived class the base class for the new class. As you can see in below example C is subclass or child class of B and B is a child class of A.\n" +
                "\n" +
                "class A{\n" +
                "}\n" +
                "class B extends A{\n" +
                "}\n" +
                "class C extends B{\n" +
                "}\n" +
                "\n" +
                "4) Hierarchical Inheritance\n" +
                "In such kind of inheritance one class is inherited by many sub classes. In below example class B,C and D inherits the same class A. A is parent class (or base class) of B,C & D.\n" +
                "\n" +
                "class A{\n" +
                "}\n" +
                "class B extends A{\n" +
                "}\n" +
                "class C extends A{\n" +
                "}\n" +
                "class D extends A{\n" +
                "}\n" +
                "\n" +
                "5) Hybrid Inheritance\n" +
                "In simple terms you can say that Hybrid inheritance is a combination of Single and Multiple inheritance. \n" +
                "\n" +
                "A hybrid inheritance can be achieved in the java in a same way as multiple inheritance can be!! Using interfaces. yes you heard it right. By using interfaces you can have multiple as well as hybrid inheritance in Java.\n" +
                "\n" ));

        arr.add(new TopicModel(" Types of Inheritance",
                "Syntax of Java Inheritance\n" +
                "Single inheritance is damn easy to understand. When a class extends another one class only then we call it a single inheritance. The below example shows that class B extends only one class which is A. Here A is a parent class of B and B would be a child class of A.\n" +
                "\n" +
                "class A{\n" +
                "}\n" +
                "class B extends A{\n" +
                "}\n" +
                "\n" +
                "2) Multiple Inheritance\n" +
                "''Multiple Inheritance'' refers to the concept of one class extending (Or inherits) more than one base class. The inheritance we learnt earlier had the concept of one base class or parent. The problem with ''multiple inheritance'' is that the derived class will have to manage the dependency on two base classes.\n" +
                "\n" +
                "Most of the new OO languages like Small Talk, Java, C# do not support Multiple inheritance. Multiple Inheritance is supported in C++.\n" +
                "\n" +
                "class A{\n" +
                "}\n" +
                "class B{\n" +
                "}\n" +
                "class C extends A,B{\n" +
                "}\n" +
                "\n" +
                "3) Multilevel Inheritance\n" +
                "Multilevel inheritance refers to a mechanism in OO technology where one can inherit from a derived class, thereby making this derived class the base class for the new class. As you can see in below example C is subclass or child class of B and B is a child class of A.\n" +
                "\n" +
                "class A{\n" +
                "}\n" +
                "class B extends A{\n" +
                "}\n" +
                "class C extends B{\n" +
                "}\n" +
                "\n" +
                "4) Hierarchical Inheritance\n" +
                "In such kind of inheritance one class is inherited by many sub classes. In below example class B,C and D inherits the same class A. A is parent class (or base class) of B,C & D.\n" +
                "\n" +
                "class A{\n" +
                "}\n" +
                "class B extends A{\n" +
                "}\n" +
                "class C extends A{\n" +
                "}\n" +
                "class D extends A{\n" +
                "}\n" +
                "\n" +
                "5) Hybrid Inheritance\n" +
                "In simple terms you can say that Hybrid inheritance is a combination of Single and Multiple inheritance. \n" +
                "\n" +
                "A hybrid inheritance can be achieved in the java in a same way as multiple inheritance can be!! Using interfaces. yes you heard it right. By using interfaces you can have multiple as well as hybrid inheritance in Java.\n" +
                "\n" ));

        arr.add(new TopicModel("Abstraction",
                "Abstraction is a process of hiding the implementation details and showing only functionality to the user.\n" +
                "\n" +
                "Another way, it shows only important things to the user and hides the internal details for example sending sms, you just type the text and send the message. You don't know the internal processing about the message delivery.\n" +
                "\n" +
                "Abstraction lets you focus on what the object does instead of how it does it.\n" +
                "\n" +
                "There are two ways to achieve abstraction in java\n" +
                "- Abstract class (0 to 100%)\n" +
                "- Interface (100%)\n" +
                "\n" +
                "Abstract class\n" +
                "A class that is declared as abstract is known as abstract class. It needs to be extended and its method implemented. It cannot be instantiated.\n" +
                "\n" +
                "Example abstract class\n" +
                "abstract class A{\n" +
                "} \n" +
                "\n" +
                "Abstract method\n" +
                "A method that is declared as abstract and does not have implementation is known as abstract method.\n" +
                "\n" +
                "Example abstract method\n" +
                "abstract void printStatus();\n" +
                "//no body and abstract \n" +
                "\n"));

        arr.add(new TopicModel("Arrays",
                "Array is an object the contains elements of similar data type. It is a data structure where we store similar elements. We can store only fixed set of elements in a java array.\n" +
                "Array in java is index based, first element of the array is stored at 0 index.\n" +
                "\n" +
                "Types of Array in java\n" +
                "1. Single Dimensional Array\n" +
                "2. Multidimensional Array\n" +
                "\n" +
                "1. Single Dimensional Array\n" +
                "Declaring Array Variables:\n" +
                "To use an array in a program, you must declare a variable to reference the array, and you must specify the type of array the variable can reference. Here is the syntax for declaring an array variable:\n" +
                "\n" +
                "dataType[] arrayName; \n" +
                "or\n" +
                "dataType arrayName[];\n" +
                "\n" +
                "Instantiating Arrays:\n" +
                "You can instantiate an array by using the new operator with the following syntax:\n" +
                "\n" +
                "arrayName = new dataType[arraySize];\n" +
                "\n" +
                "The above statement does two things:\n" +
                "It creates an array using new dataType[arraySize];\n" +
                "It assigns the reference of the newly created array to the variable arrayName.\n" +
                "\n" +
                "2. Multidimensional Array\n" +
                "Syntax to Declare Multidimensional Array in java\n" +
                "\n" +
                "dataType[][] arrayName; or \n" +
                "dataType arrayName[][];\n" +
                "\n" +
                "Example to instantiate Multidimensional Array\n" +
                "int[][] arr=new int[2][3];\n" +
                "//2 row and 3 column \n" +
                "\n" +
                "Example to initialize Multidimensional Array in java\n" +
                "arr[0][0]=1; \n" +
                "arr[0][1]=2; \n" +
                "arr[0][2]=3; \n" +
                "arr[1][0]=4; \n" +
                "arr[1][1]=5; \n" +
                "arr[1][2]=6; \n" +
                "\n" +
                "Passing Arrays to Methods:\n" +
                "Just as you can pass primitive type values to methods, you can also pass arrays to methods. For example, the following method displays the elements in an int array:\n" +
                "public static void display(int[] arr) {\n" +
                "for (int i = 0; i < arr.length; i++) {\n" +
                "System.out.print(arr[i] + \" \");\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "Returning an Array from a Method:\n" +
                "A method may also return an array. For example, the method shown below returns an array that is the copy of another array:\n" +
                "public static int[] copyarray(int[] list) {\n" +
                "int[] result = new int[list.length];\n" +
                "\n" +
                "for (int i = 0; i < list.length - 1 ; i++) {\n" +
                "result[i] = list[i];\n" +
                "}\n" +
                "return result;\n" +
                "}\n" +
                "\n" +
                "Arrays Methods :\n" +
                "Arrays.binarySearch(Object[] a, Object key)\n" +
                "Searches the specified array of Object ( Byte, Int , double, etc.) for the specified value using the binary search algorithm. The array must be sorted prior to making this call. This returns index of the search key.\n" +
                "\n" +
                "Arrays.equals(long[] a, long[] a2)\n" +
                "Returns true if the two specified arrays of longs are equal to one another. Two arrays are considered equal if both arrays contain the same number of elements, and all corresponding pairs of elements in the two arrays are equal.\n" +
                "\n" +
                "Arrays.fill(int[] a, int val)\n" +
                "Assigns the specified int value to each element of the specified array of ints. Same method could be used by all other primitive data types (Byte, short, Int etc.)\n" +
                "\n" +
                "Arrays.sort(Object[] a)\n" +
                "Sorts the specified array of objects into ascending order, according to the natural ordering of its elements. Same method could be used by all other primitive data types ( Byte, short, Int, etc.)\n" +
                "\n" ));


        arr.add(new TopicModel("String","//4.3 String\n" +
                "In java, string is basically an object that represents sequence of char values.The Java platform provides the String class to create and manipulate strings.\n" +
                "\n" +
                "Creating Strings:\n" +
                "1) The most direct way to create a string is to write:\n" +
                "String str1 = \"Hello Java!\";\n" +
                "\n" +
                "2) Using another String object\n" +
                "String str2 = new String(str1);\n" +
                "\n" +
                "3) Using new Keyword\n" +
                "String str3 = new String(\"Java\");\n" +
                "\n" +
                "4) Using + operator (Concatenation)\n" +
                "String str4 = str1 + str2;\n" +
                "or,\n" +
                "String str5 = \"hello\"+\"Java\";\n" +
                "\n" +
                "String Length:\n" +
                "length() method returns the number of characters contained in the string object.\n" +
                "String str1 = \"Hello Java\";\n" +
                "int len = str1.length();\n" +
                "System.out.println( \"String Length is : \" + len );\n" +
                "\n" +
                "Concatenating Strings:\n" +
                "The String class includes a method for concatenating two strings:\n" +
                "string1.concat(string2);\n" +
                "This returns a new string that is string1 with string2 added to it at the end. You can also use the concat() method with string literals, as in:\n" +
                "\"Hello \".concat(\"Java\");\n" +
                "Strings are more commonly concatenated with the + operator, as in:\n" +
                "\"Hello \" + \" Java\" + \"!\"\n" +
                "which results in:\n" +
                "\"Hello Java!\"\n" +
                "\n" +
                "String Methods :\n" +
                "1 char charAt(int index) \n" +
                "returns char value for the particular index\n" +
                "\n" +
                "2 int length() \n" +
                "returns string length\n" +
                "\n" +
                "3 static String format(String format, Object... args) \n" +
                "returns formatted string\n" +
                "\n" +
                "4 static String format(Locale l, String format, Object... args) \n" +
                "returns formatted string with given locale\n" +
                "\n" +
                "5 String substring(int beginIndex) \n" +
                "returns substring for given begin index\n" +
                "\n" +
                "6 String substring(int beginIndex, int endIndex) \n" +
                "returns substring for given begin index and end index\n" +
                "\n" +
                "7 boolean contains(CharSequence s) \n" +
                "returns true or false after matching the sequence of char value\n" +
                "\n" +
                "8 static String join(CharSequence delimiter, CharSequence... elements) \n" +
                "returns a joined string\n" +
                "\n" +
                "9 static String join(CharSequence delimiter, Iterable<? extends CharSequence> elements) \n" +
                "returns a joined string\n" +
                "\n" +
                "10 boolean equals(Object another) \n" +
                "checks the equality of string with object\n" +
                "\n" +
                "11 boolean isEmpty() \n" +
                "checks if string is empty\n" +
                "\n" +
                "12 String concat(String str) \n" +
                "concatinates specified string\n" +
                "\n" +
                "13 String replace(char old, char new) \n" +
                "replaces all occurrences of specified char value\n" +
                "\n" +
                "14 String replace(CharSequence old, CharSequence new) \n" +
                "replaces all occurrences of specified CharSequence\n" +
                "\n" +
                "15 String trim() \n" +
                "returns trimmed string omitting leading and trailing spaces\n" +
                "\n" +
                "16 String split(String regex) \n" +
                "returns splitted string matching regex\n" +
                "\n" +
                "17 String split(String regex, int limit) \n" +
                "returns splitted string matching regex and limit\n" +
                "\n" +
                "18 String intern() \n" +
                "returns interned string\n" +
                "\n" +
                "19 int indexOf(int ch) \n" +
                "returns specified char value index\n" +
                "\n" +
                "20 int indexOf(int ch, int fromIndex) \n" +
                "returns specified char value index starting with given index\n" +
                "\n" +
                "21 int indexOf(String substring) \n" +
                "returns specified substring index\n" +
                "\n" +
                "22 int indexOf(String substring, int fromIndex) \n" +
                "returns specified substring index starting with given index\n" +
                "\n" +
                "23 String toLowerCase() \n" +
                "returns string in lowercase.\n" +
                "\n" +
                "24 String toLowerCase(Locale l) \n" +
                "returns string in lowercase using specified locale.\n" +
                "\n" +
                "25 String toUpperCase() \n" +
                "returns string in uppercase.\n" +
                "\n" +
                "26 String toUpperCase(Locale l) \n" +
                "returns string in uppercase using specified locale.\n" +
                "\n" ));


        arr.add(new TopicModel("Vectors",
                "Vector implements List Interface. Like ArrayList it also maintains insertion order but it is rarely used in non-thread environment as it is synchronized and due to which it gives poor performance in searching, adding, delete and update of its elements.\n" +
                "\n" +
                "Three ways to create vector class object:\n" +
                "Method 1:\n" +
                "Vector vec = new Vector();\n" +
                "\n" +
                "It creates an empty Vector with the default initial capacity of 10. It means the Vector will be re-sized when the 11th elements needs to be inserted into the Vector. Note: By default vector doubles its size. \n" +
                "\n" +
                "i.e. In this case the Vector size would remain 10 till 10 insertions and once we try to insert the 11th element It would become 20 (double of default capacity 10).\n" +
                "\n" +
                "Method 2:\n" +
                "Vector object= new Vector(int initialCapacity)\n" +
                "\n" +
                "Vector vec = new Vector(3);\n" +
                "It will create a Vector of initial capacity of 3.\n" +
                "\n" +
                "Method 3:\n" +
                "Vector object= new vector(int initialcapacity, capacityIncrement)\n" +
                "\n" +
                "Vector vec= new Vector(4, 6)\n" +
                "Here we have provided two arguments. The initial capacity is 4 and capacityIncrement is 6. It means upon insertion of 5th element the size would be 10 (4+6) and on 11th insertion it would be 16(10+6).\n" +
                "\n" +
                "Vector Methods:\n" +
                "void addElement(Object element):\n" +
                "It inserts the element at the end of the Vector.\n" +
                "\n" +
                "int capacity():\n" +
                "This method returns the current capacity of the vector.\n" +
                "\n" +
                "int size():\n" +
                "It returns the current size of the vector.\n" +
                "\n" +
                "void setSize(int size):\n" +
                "It changes the existing size with the specified size.\n" +
                "\n" +
                "boolean contains(Object element):\n" +
                "This method checks whether the specified element is present in the Vector. If the element is been found it returns true else false.\n" +
                "\n" +
                "boolean containsAll(Collection c):\n" +
                "It returns true if all the elements of collection c are present in the Vector.\n" +
                "\n" +
                "Object elementAt(int index):\n" +
                "It returns the element present at the specified location in Vector.\n" +
                "\n" +
                "Object firstElement():\n" +
                "It is used for getting the first element of the vector.\n" +
                "\n" +
                "Object lastElement():\n" +
                "Returns the last element of the array.\n" +
                "\n" +
                "Object get(int index):\n" +
                "Returns the element at the specified index.\n" +
                "\n" +
                "boolean isEmpty():\n" +
                "This method returns true if Vector doesn't have any element.\n" +
                "\n" +
                "boolean removeElement(Object element):\n" +
                "Removes the specifed element from vector.\n" +
                "\n" +
                "boolean removeAll(Collection c):\n" +
                "It Removes all those elements from vector which are present in the Collection c.\n" +
                "\n" +
                "void setElementAt(Object element, int index):\n" +
                "It updates the element of specifed index with the given element.\n" +
                "\n"));
        arr.add(new TopicModel(" Wrapper Class",
                "As the name says, a wrapper class wraps (encloses) around a data type and gives it an object appearance. \n" +
                "Wherever, the data type is required as an object, this object can be used. Wrapper classes include methods to unwrap the object and give back the data type. \n" +
                "It can be compared with a chocolate. The manufacturer wraps the chocolate with some foil or paper to prevent from pollution. The user takes the chocolate, removes and throws the wrapper and eats it. \n" +
                "\n" +
                "The list of eight wrapper classes are given below:\n" +
                "Primitive Type\t=> Wrapper class\n" +
                "boolean\t=> Boolean\n" +
                "char\t\t=> Character\n" +
                "byte\t\t=> Byte\n" +
                "short\t\t=> Short\n" +
                "int\t\t\t=> Integer\n" +
                "long\t\t=> Long\n" +
                "float\t\t=> Float\n" +
                "double\t=> Double\n" +
                "\n" +
                "Creating objects of the Wrapper classes\n" +
                "All the wrapper classes have constructors which can be used to create the corresponding Wrapper class \n" +
                "For example\n" +
                "Integer intObject = new Integer (15);\n" +
                "\n" +
                "Retrieving the value wrapped by a wrapper class object\n" +
                "Each of the eight wrapper classes have a method to retrieve the value that was wrapped in the object. \n" +
                "For example, to retrieve the value stored in the Integer object intObject, we use the following statement. \n" +
                "int x = intObject.intValue();\n" +
                "\n" +
                "Similarly, we have methods for the other seven wrapper classes: byteValue(), shortValue(), longValue(), floatValue(), doubleValue(), charValue(), booleanValue(). \n" +
                "\n" +
                "Auto boxing and auto unboxing\n" +
                "Above given method can become quite cumbersome. \n" +
                "As an alternative, there exists auto boxing and autounboxing.\n" +
                "Auto boxing refers to an implicit call to the constructor and auto unboxing refers to an implicit call to the *value() method. \n" +
                "\n" +
                "Therefore, a new wrapper object can be created by specifying the value to be wrapped just as we would do for a primitive data type variable. Also, the value can be retrieved and used in a simple way by specifying the object name.\n" +
                "Look at the following code:\n" +
                "Integer intObject = 34;\n" +
                "int x=intObject;\n" +
                "int x = intObject + 7;\n" +
                "\n" +
                "The above statements are equivalent to the following set of statements\n" +
                "Integer intObject = new Integer (34);\n" +
                "int x = intObject.intValue();\n" +
                "int x = intObject .intValue()+ 7;\n" +
                "Similarly, auto boxing and auto boxing apply to other wrapper classes also.\n" +
                "\n" ));

        arr.add(new TopicModel("Defining Interfaces",
                "An interface is a reference type in Java, it is similar to class, it is a collection of abstract methods.\n" +
                "\n" +
                "A class implements an interface, thereby inheriting the abstract methods of the interface.Along with abstract methods an interface may also contain constants, default methods, static methods, and nested types. Method bodies exist only for default methods and static methods.\n" +
                "\n" +
                "Writing an interface is similar to writing a class. But a class describes the attributes and behaviours of an object. And an interface contains behaviours that a class implements.\n" +
                "\n" +
                "Unless the class that implements the interface is abstract, all the methods of the interface need to be defined in the class.\n" +
                "\n" +
                "The General form of an interface definition is:\n" +
                "[visibility] interface InterfaceName [extends other interfaces]\n" +
                "{\n" +
                "variables declarations;\n" +
                "abstract method declarations;\n" +
                "}\n" +
                "\n" +
                "here, interface is the keyword and InterfaceName is any valid java variable(just like class name).\n" +
                "variables are declared as follows:\n" +
                "static final tyoe VariableName=Value;\n" +
                "\n" +
                "example:\n" +
                "interface printable{\n" +
                "void print(); \n" +
                "} \n" +
                "\n" +
                "class A6 implements printable{ \n" +
                "public void print(){System.out.println(\"Hello\");} \n" +
                "\n" +
                "public static void main(String args[]){ \n" +
                "A6 obj = new A6(); \n" +
                "obj.print(); \n" +
                "} \n" +
                "} \n" +
                "\n" +
                "Output: Hello\n" +
                "\n" ));
        arr.add(new TopicModel("Extending Interfaces",
                "An interface can extend another interface, similarly to the way that a class can extend another class. \n" +
                "\n" +
                "The extends keyword is used to extend an interface, and the child interface inherits the methods of the parent interface.\n" +
                "this is achieved using the keyword extends as shown below:\n" +
                "public class C extends A implements B {\n" +
                "//trying to override doSomthing...\n" +
                "public int myMethod(int x) {\n" +
                "return doSomthingElse(x);\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "Example\n" +
                "interface ItemConstants\n" +
                "{\n" +
                "int code=2015;\n" +
                "string name=\"Akshay\";\n" +
                "}\n" +
                "interface Item extends ItemConstants\n" +
                "{\n" +
                "void display();\n" +
                "}\n" +
                "\n" ));

        arr.add(new TopicModel("Implementing Interfaces",
                "A class uses the implements keyword to implement an interface. The implements keyword appears in the class declaration following the extends portion of the declaration.\n" +
                "\n" +
                "class classname implements interfacename\n" +
                "{\n" +
                "body of classname\n" +
                "}\n" +
                "\n" +
                "here the classname \"implements\" the interface interfacename. A more general form of implementation may look like this:\n" +
                "class classname extends superclass implements interface1,interface2,...\n" +
                "{\n" +
                "body of classname\n" +
                "}\n" +
                "\n" +
                "Example:\n" +
                "interface MyInterface\n" +
                "{\n" +
                "public void method1();\n" +
                "public void method2();\n" +
                "}\n" +
                "\n" +
                "class XYZ implements MyInterface\n" +
                "{\n" +
                "public void method1()\n" +
                "{\n" +
                "System.out.println(\"implementation of method1\");\n" +
                "}\n" +
                "public void method2()\n" +
                "{\n" +
                "System.out.println(\"implementation of method2\");\n" +
                "}\n" +
                "\n" +
                "public static void main(String arg[])\n" +
                "{\n" +
                "MyInterface obj = new XYZ();\n" +
                "obj. method1();\n" +
                "}\n" +
                "}\n" +
                "Output:\n" +
                "implementation of method1\n" +
                "\n"));


        arr.add(new TopicModel(" Accessing Interface",
                "interfaces can be used to declare a set of constants that can be used in different classes. \n" +
                "This is similar to creating header files in c++ to contain large number of constants.\n" +
                "\n" +
                "Since such interfaces do not contain methods,there is no need to worry about implementing any methods. \n" +
                "\n" +
                "The constant value will be available to any class that implements the interface.\n" +
                "The values can be used in any method, as part of any variable declaration, or anywhere where we can use a final value.\n" +
                "\n" +
                "Example:\n" +
                "interface A \n" +
                "{\n" +
                "int m=10;\n" +
                "int n=50;\n" +
                "}\n" +
                "class B implements A\n" +
                "{ \n" +
                "int x=m;\n" +
                "void methodB(int size)\n" +
                "{\n" +
                "...\n" +
                "...\n" +
                "\tif(size<n)\n" +
                "\t}\n" +
                "}\n" +
                "\n" ));



        Log.i("array","all data enter");

    }

    public void onItemClick(TopicModel tm) {
        Intent intent = new Intent(context,TopicActivity.class);
        intent.putExtra("Name",tm.name);
        intent.putExtra("description",tm.description);
        //Toast.makeText(this,tm.name,Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }

    public void filterlist(String s){
        ArrayList<TopicModel> flist = new ArrayList<>();
        for(TopicModel item : arr){
            if(item.getName().toLowerCase().contains(s.toLowerCase())){
                flist.add(item);
            }
        }

        if(flist.isEmpty()){
            Toast.makeText(context,"no data found",Toast.LENGTH_SHORT).show();
        }
        else {
            adapter.setFilterList(getContext(), flist,this);
        }
    }
}