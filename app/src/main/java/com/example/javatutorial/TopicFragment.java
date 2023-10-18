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

import java.util.ArrayList;

public class TopicFragment extends Fragment implements TopicListner{

    ArrayList<TopicModel> arr;
    RecyclerView recyclerView;
    Activity context;
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
        setdata();
        //setAdapter();
        RecycleTopicAdapter adapter = new RecycleTopicAdapter(getContext(), arr,this);
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

        arr.add(new TopicModel("dffsf","dedf"));
        arr.add(new TopicModel("dffsf","dedf"));
        arr.add(new TopicModel("dffsf","dedf"));


        Log.i("array","all data enter");

    }

    public void onItemClick(TopicModel tm) {
        Intent intent = new Intent(context,TopicActivity.class);
        intent.putExtra("Name",tm.name);
        intent.putExtra("description",tm.description);
        //Toast.makeText(this,tm.name,Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}