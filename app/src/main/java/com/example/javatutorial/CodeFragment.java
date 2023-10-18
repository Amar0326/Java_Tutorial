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

public class CodeFragment extends Fragment implements CodeLister {
    ArrayList<CodeModel> arr;
    RecyclerView recyclerView;
    Activity context;
    public CodeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        context = getActivity();
        // Inflate the layout for this fragment
        View root = inflater.inflate(R.layout.fragment_code, container, false);
        return root;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        arr=new ArrayList<>();
        recyclerView = context.findViewById(R.id.coderecycleview);
        setdata();
        //setAdapter();
        RecycleCodeAdapter adapter = new RecycleCodeAdapter(getContext(), arr,this);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setAdapter(adapter);

    }

    void setdata(){
        arr.add(new CodeModel("2D Array Example",
                "class TwoDArray\n" +
                        "{\n" +
                        "public static void main(String args[])\n" +
                        "{\n" +
                        "int twoD[][]=new int[4][5];\n" +
                        "int k=0,i,j;\n" +
                        "for(i=0;i<4;i++)\n" +
                        "for(j=0;j<5;j++)\n" +
                        "{\n" +
                        "twoD[i][j]=k;\n" +
                        "k++;\n" +
                        "}\n" +
                        "for(i=0;i<4;i++)\n" +
                        "{\n" +
                        "for(j=0;j<5;j++)\n" +
                        "System.out.print(twoD[i][j]+\" \");\n" +
                        "System.out.println();\n" +
                        "}\n" +
                        "}\n" +
                        "}","s"));
        arr.add(new CodeModel("Addition","import java.util.Scanner;\n" +
                "\n" +
                "class AddNumbers\n" +
                "{\n" +
                "public static void main(String args[])\n" +
                "{\n" +
                "int x, y, z;\n" +
                "\n" +
                "System.out.println(\"Enter two integers to calculate their sum \");\n" +
                "Scanner in = new Scanner(System.in);\n" +
                "\n" +
                "x = in.nextInt();\n" +
                "y = in.nextInt();\n" +
                "z = x + y;\n" +
                "System.out.println(\"Sum of entered integers = \"+z);\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Area of Circle","import java.io.BufferedReader;\n" +
                "import java.io.IOException;\n" +
                "import java.io.InputStreamReader;\n" +
                "\n" +
                "public class CircleArea {\n" +
                "\n" +
                "public static void main(String[] args) {\n" +
                "\n" +
                "int radius = 0;\n" +
                "System.out.println(\"Please enter radius of a circle\");\n" +
                "\n" +
                "try\n" +
                "{\n" +
                "//get the radius from console\n" +
                "BufferedReader br = new BufferedReader(new InputStreamReader(System.in));\n" +
                "radius = Integer.parseInt(br.readLine());\n" +
                "}\n" +
                "//if invalid value was entered\n" +
                "catch(NumberFormatException ne)\n" +
                "{\n" +
                "System.out.println(\"Invalid radius value\" + ne);\n" +
                "System.exit(0);\n" +
                "}\n" +
                "catch(IOException ioe)\n" +
                "{\n" +
                "System.out.println(\"IO Error :\" + ioe);\n" +
                "System.exit(0);\n" +
                "}\n" +
                "\n" +
                "/*\n" +
                "* Area of a circle is\n" +
                "* pi * r * r\n" +
                "* where r is a radius of a circle.\n" +
                "*/","Output"));
        arr.add(new CodeModel("Area of Rectangle","import java.io.BufferedReader;\n" +
                "import java.io.IOException;\n" +
                "import java.io.InputStreamReader;\n" +
                "\n" +
                "public class RectArea {\n" +
                "\n" +
                "public static void main(String[] args) {\n" +
                "\n" +
                "int width = 0;\n" +
                "int length = 0;\n" +
                "\n" +
                "try\n" +
                "{\n" +
                "//read the length from console\n" +
                "BufferedReader br = new BufferedReader(new InputStreamReader(System.in));\n" +
                "\n" +
                "System.out.println(\"Please enter length of a rectangle\");\n" +
                "length = Integer.parseInt(br.readLine());\n" +
                "\n" +
                "//read the width from console\n" +
                "System.out.println(\"Please enter width of a rectangle\");\n" +
                "width = Integer.parseInt(br.readLine());\n" +
                "\n" +
                "}\n" +
                "//if invalid value was entered\n" +
                "catch(NumberFormatException ne)\n" +
                "{\n" +
                "System.out.println(\"Invalid value\" + ne);\n" +
                "System.exit(0);\n" +
                "}\n" +
                "catch(IOException ioe)\n" +
                "{\n" +
                "System.out.println(\"IO Error :\" + ioe);\n" +
                "System.exit(0);\n" +
                "}\n" +
                "\n" +
                "/*\n" +
                "* Area of a rectangle is\n" +
                "* length * width\n" +
                "*/\n" +
                "\n" +
                "int area = length * width;\n" +
                "\n" +
                "System.out.println(\"Area of a rectangle is \" + area);\n" +
                "}\n" +
                "\n" +
                "}","Output"));
        arr.add(new CodeModel("Array Copy","class ArrayCopy\n" +
                "{\n" +
                "public static void main(String args[])\n" +
                "{\n" +
                "int A1[]={10,20,30,40,50,60,70,80,90,100};\n" +
                "int A2[]={1,2,3,4,5,6,7,8,9,10};\n" +
                "\n" +
                "System.out.println(\"The first Array is:\");\n" +
                "for(int i=0;i<10;i++)\n" +
                "System.out.print(A1[i]+\" \");\n" +
                "\n" +
                "System.out.println(\"\\nThe Second Array is:\");\n" +
                "for(int i=0;i<10;i++)\n" +
                "System.out.print(A2[i]+\" \");\n" +
                "\n" +
                "System.arraycopy(A1,5,A2,5,5);\n" +
                "//Copying last 5 elements of A1 to A2\n" +
                "\n" +
                "System.out.println(\"\\n The second Array after calling arraycopy():\");\n" +
                "for(int i=0;i<10;i++)\n" +
                "System.out.print(A2[i]+\" \");\n" +
                "}\n" +
                "}\n","Output"));
        arr.add(new CodeModel("Average of array","public class ArrayAverage {\n" +
                "\n" +
                "public static void main(String[] args) {\n" +
                "\n" +
                "//define an array\n" +
                "int[] numbers = new int[]{10,20,15,25,16,60,100};\n" +
                "\n" +
                "//calculate sum of all array elements\n" +
                "int sum = 0;\n" +
                "\n" +
                "for(int i=0; i < numbers.length ; i++)\n" +
                "sum = sum + numbers[i];\n" +
                "\n" +
                "//calculate average value\n" +
                "double average = sum / numbers.length;\n" +
                "\n" +
                "System.out.println(\"Average value of array elements is : \" + average);\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Binary Search","import java.util.Scanner;\n" +
                "\n" +
                "class BinarySearch \n" +
                "{\n" +
                "public static void main(String args[])\n" +
                "{\n" +
                "int c, first, last, middle, n, search, array[];\n" +
                "\n" +
                "Scanner in = new Scanner(System.in);\n" +
                "System.out.println(\"Enter number of elements\");\n" +
                "n = in.nextInt(); \n" +
                "array = new int[n];\n" +
                "\n" +
                "System.out.println(\"Enter \" + n + \" integers\");\n" +
                "\n" +
                "\n" +
                "for (c = 0; c < n; c++)\n" +
                "array[c] = in.nextInt();\n" +
                "\n" +
                "System.out.println(\"Enter value to find\");\n" +
                "search = in.nextInt();\n" +
                "\n" +
                "first = 0;\n" +
                "last = n - 1;\n" +
                "middle = (first + last)/2;\n" +
                "\n" +
                "while( first <= last )\n" +
                "{\n" +
                "if ( array[middle] < search )\n" +
                "first = middle + 1; \n" +
                "else if ( array[middle] == search ) \n" +
                "{\n" +
                "System.out.println(search + \" found at location \" + (middle + 1) + \".\");\n" +
                "break;\n" +
                "}\n" +
                "else\n" +
                "last = middle - 1;\n" +
                "\n" +
                "middle = (first + last)/2;\n" +
                "}\n" +
                "if ( first > last )\n" +
                "System.out.println(search + \" is not present in the list.\\n\");\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Binary to Decimal","import java.util.Scanner;\n" +
                "\n" +
                "public class Binary_Decimal {\n" +
                "Scanner scan;\n" +
                "int num;\n" +
                "\n" +
                "void getVal() {\n" +
                "System.out.println(\"Binary to Decimal\");\n" +
                "scan = new Scanner(System.in);\n" +
                "\n" +
                "System.out.println(\"\\nEnter the number :\");\n" +
                "num = Integer.parseInt(scan.nextLine(), 2);\n" +
                "}\n" +
                "\n" +
                "void convert() {\n" +
                "String decimal = Integer.toString(num);\n" +
                "System.out.println(\"Decimal Value is : \" + decimal);\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "class MainClass {\n" +
                "public static void main(String args[]) {\n" +
                "Binary_Decimal obj = new Binary_Decimal();\n" +
                "\n" +
                "obj.getVal();\n" +
                "obj.convert();\n" +
                "}\n" +
                "}\n","Output"));
        arr.add(new CodeModel("Bitwise Addition","import java.util.Scanner;\n" +
                "public class Bitwise_Addition \n" +
                "{\n" +
                "static int add(int x, int y)\n" +
                "{\n" +
                "int carry;\n" +
                "\n" +
                "while(y!=0){\n" +
                "carry = x & y;\n" +
                "x = x ^ y;\n" +
                "y = carry << 1;\n" +
                "}\n" +
                "\n" +
                "return x;\n" +
                "}\n" +
                "\n" +
                "public static void main(String args[])\n" +
                "{\n" +
                "Scanner input = new Scanner(System.in);\n" +
                "System.out.println(\"Enter the numbers to be added:\");\n" +
                "\n" +
                "int x = input.nextInt();\n" +
                "int y = input.nextInt();\n" +
                "\n" +
                "System.out.println(\"The Summation is: \"+add(x, y));\n" +
                "input.close();\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Bubble Sort","import java.util.Random;\n" +
                "\n" +
                "public class Bubble_Sort{\n" +
                "static int[] sort(int[] sequence){\n" +
                "// Bubble Sort\n" +
                "for (int i = 0; i < sequence.length; i++)\n" +
                "for (int j = 0; j < sequence.length - 1; j++)\n" +
                "if (sequence[j] > sequence[j + 1]){\n" +
                "sequence[j] = sequence[j] + sequence[j + 1];\n" +
                "sequence[j + 1] = sequence[j] - sequence[j + 1];\n" +
                "sequence[j] = sequence[j] - sequence[j + 1];\n" +
                "}\n" +
                "\n" +
                "return sequence;\n" +
                "}\n" +
                "\n" +
                "\n" +
                "static void printSequence(int[] sorted_sequence){\n" +
                "for (int i = 0; i < sorted_sequence.length; i++)\n" +
                "System.out.print(sorted_sequence[i] + \" \");\n" +
                "}\n" +
                "\n" +
                "\n" +
                "public static void main(String args[]) \n" +
                "{\n" +
                "System.out.println(\"Sorting of randomly generated numbers using BUBBLE SORT\");\n" +
                "\n" +
                "Random random = new Random();\n" +
                "int N = 20;\n" +
                "int[] sequence = new int[N];\n" +
                "\n" +
                "for (int i = 0; i < N; i++)\n" +
                "sequence[i] = Math.abs(random.nextInt(1000));\n" +
                "\n" +
                "System.out.println(\"\\nOriginal Sequence: \");\n" +
                "printSequence(sequence);\n" +
                "\n" +
                "System.out.println(\"\\nSorted Sequence: \");\n" +
                "printSequence(sort(sequence));\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Calculate Percentage","import java.util.Scanner;\n" +
                "\n" +
                "public class PercentageCalculator \n" +
                "{ \n" +
                "public static void main(String[] args) \n" +
                "{ \n" +
                "double x = 0;\n" +
                "double y = 0;\n" +
                "\n" +
                "Scanner scanner = new Scanner(System.in); \n" +
                "System.out.println(\"Enter the value of x : \"); \n" +
                "x = scanner.nextDouble(); \n" +
                "System.out.println(\"Enter the value of y : \"); \n" +
                "y = scanner.nextDouble(); \n" +
                "System.out.println(); \n" +
                "System.out.println(\"Calculating percentage : (x % of y) : \");\n" +
                "\n" +
                "System.out.println(x + \" % of \" + y + \" is \" + result); \n" +
                "System.out.println();\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Char Array to String","public class CharArrayToString {\n" +
                "\n" +
                "public static void main(String args[]){\n" +
                "\n" +
                "char[] charArray = new char[]{'J','a','v','a'};\n" +
                "\n" +
                "/*\n" +
                "To convert char array to String in Java, use String(Char[] ch) constructor of Java String class.\n" +
                "*/\n" +
                "\n" +
                "String str = new String(charArray);\n" +
                "\n" +
                "System.out.println(\"Char array converted to String: \" + str);\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Constructor Example","class Programming {\n" +
                "//constructor method\n" +
                "Programming() {\n" +
                "System.out.println(\"Constructor method called.\");\n" +
                "}\n" +
                "\n" +
                "public static void main(String[] args) {\n" +
                "Programming object = new Programming(); //creating object\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Continue Example","public class ContinueExample {\n" +
                "\n" +
                "public static void main(String[] args) {\n" +
                "/*\n" +
                "* Continue statement is used to skip a particular iteration of the loop\n" +
                "*/\n" +
                "int intArray[] = new int[]{1,2,3,4,5};\n" +
                "\n" +
                "System.out.println(\"All numbers except for 3 are :\");\n" +
                "\n" +
                "for(int i=0; i < intArray.length; i++)\n" +
                "{\n" +
                "if(intArray[i] == 3)\n" +
                "continue;\n" +
                "else\n" +
                "System.out.println(intArray[i]);\n" +
                "}\n" +
                "}\n" +
                "}\n","Output"));
        arr.add(new CodeModel("Create Directory","import java.io.*;\n" +
                "\n" +
                "public class CreateDirectory\n" +
                "{\n" +
                "public static void main(String[] args)\n" +
                "{\n" +
                "File dir = new File(\"C://FileIO//DemoDirectory\");\n" +
                "\n" +
                "boolean isDirectoryCreated = dir.mkdir();\n" +
                "\n" +
                "if(isDirectoryCreated)\n" +
                "System.out.println(\"Directory created successfully\");\n" +
                "else\n" +
                "System.out.println(\"Directory was not created successfully\");\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Create File","import java.io.File;\n" +
                "import java.io.IOException;\n" +
                "\n" +
                "public class Main {\n" +
                "public static void main(String[] args) {\n" +
                "try{\n" +
                "File file = new File(\"C:/myfile.txt\");\n" +
                "if(file.createNewFile())\n" +
                "System.out.println(\"Success!\");\n" +
                "else\n" +
                "System.out.println\n" +
                "(\"Error, file already exists.\");\n" +
                "}\n" +
                "catch(IOException ioe) {\n" +
                "ioe.printStackTrace();\n" +
                "}\n" +
                "}\n" +
                "}\n","Output"));
        arr.add(new CodeModel("Date Time","import java.util.*;\n" +
                "\n" +
                "class GetCurrentDateAndTime\n" +
                "{\n" +
                "public static void main(String args[])\n" +
                "{\n" +
                "int day, month, year;\n" +
                "int second, minute, hour;\n" +
                "GregorianCalendar date = new GregorianCalendar();\n" +
                "\n" +
                "day = date.get(Calendar.DAY_OF_MONTH);\n" +
                "month = date.get(Calendar.MONTH);\n" +
                "year = date.get(Calendar.YEAR);\n" +
                "\n" +
                "second = date.get(Calendar.SECOND);\n" +
                "minute = date.get(Calendar.MINUTE);\n" +
                "hour = date.get(Calendar.HOUR);\n" +
                "\n" +
                "System.out.println(\"Current date is \"+day+\"/\"+(month+1)+\"/\"+year);\n" +
                "System.out.println(\"Current time is \"+hour+\" : \"+minute+\" : \"+second);\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Date to String","import java.text.DateFormat;\n" +
                "import java.text.SimpleDateFormat;\n" +
                "import java.util.Date;\n" +
                "\n" +
                "public class DateToString {\n" +
                "\n" +
                "public static void main(String args[]){\n" +
                "\n" +
                "Date date = new Date();\n" +
                "\n" +
                "/* To convert java.util.Date to String, use SimpleDateFormat class. */\n" +
                "\n" +
                "DateFormat dateFormat = new SimpleDateFormat(\"yyyy-mm-dd hh:mm:ss\");\n" +
                "\n" +
                "//to convert Date to String, use format method of SimpleDateFormat class.\n" +
                "String strDate = dateFormat.format(date);\n" +
                "\n" +
                "System.out.println(\"Date converted to String: \" + strDate);\n" +
                "\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Decimal to Binary","import java.util.Scanner;\n" +
                "\n" +
                "public class DecimalToBinary {\n" +
                "public String toBinary(int n) {\n" +
                "if (n == 0) {\n" +
                "return \"0\";\n" +
                "}\n" +
                "String binary = \"\";\n" +
                "while (n > 0) {\n" +
                "int rem = n % 2;\n" +
                "binary = rem + binary;\n" +
                "n = n / 2;\n" +
                "}\n" +
                "return binary;\n" +
                "}\n" +
                "\n" +
                "public static void main(String[] args) {\n" +
                "Scanner scanner = new Scanner(System.in);\n" +
                "System.out.print(\"Enter a number: \");\n" +
                "int decimal = scanner.nextInt();\n" +
                "\n" +
                "DecimalToBinary dtb = new DecimalToBinary();\n" +
                "String binary = dtb.toBinary(decimal);\n" +
                "System.out.println(\"The binary representation is \" + binary);\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Decimal to Hex","import java.util.Scanner;\n" +
                "\n" +
                "public class Decimal_Hexa {\n" +
                "Scanner scan;\n" +
                "int num;\n" +
                "\n" +
                "void getVal() {\n" +
                "System.out.println(\"Decimal to HexaDecimal\");\n" +
                "scan = new Scanner(System.in);\n" +
                "\n" +
                "System.out.println(\"\\nEnter the number :\");\n" +
                "num = Integer.parseInt(scan.nextLine());\n" +
                "}\n" +
                "\n" +
                "void convert() {\n" +
                "String hexa = Integer.toHexString(num);\n" +
                "\n" +
                "System.out.println(\"HexaDecimal Value is : \" + hexa);\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "class MainClass {\n" +
                "public static void main(String args[]) {\n" +
                "\n" +
                "Decimal_Hexa obj = new Decimal_Hexa();\n" +
                "\n" +
                "obj.getVal();\n" +
                "obj.convert();\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Decimal to Octal","import java.util.Scanner;\n" +
                "\n" +
                "public class Decimal_Octal {\n" +
                "Scanner scan;\n" +
                "int num;\n" +
                "\n" +
                "void getVal() {\n" +
                "System.out.println(\"Decimal to Octal\");\n" +
                "scan = new Scanner(System.in);\n" +
                "\n" +
                "System.out.println(\"\\nEnter the number :\");\n" +
                "num = Integer.parseInt(scan.nextLine());\n" +
                "}\n" +
                "\n" +
                "void convert() {\n" +
                "String octal = Integer.toOctalString(num);\n" +
                "System.out.println(\"Octal Value is : \" + octal);\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "class MainClass {\n" +
                "public static void main(String args[]) {\n" +
                "Decimal_Octal obj = new Decimal_Octal();\n" +
                "\n" +
                "obj.getVal();\n" +
                "obj.convert();\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Delete Directory","import java.io.*;\n" +
                "\n" +
                "public class DeleteFileOrDirectory {\n" +
                "\n" +
                "public static void main(String[] args) {\n" +
                "\n" +
                "File file = new File(\"C://FileIO/DeleteDemo.txt\");\n" +
                "\n" +
                "boolean blnDeleted = file.delete();\n" +
                "\n" +
                "System.out.println(\"Was file deleted ? : \" + blnDeleted);\n" +
                "\n" +
                "/*\n" +
                "Please note that delete method returns false if the file did not exists or the directory was not empty.\n" +
                "*/\n" +
                "}\n" +
                "}\n","Output"));
        arr.add(new CodeModel("Delete element from Array","public class DeleteArray {\n" +
                "\n" +
                "public static void main(String[] arguments) {\n" +
                "int arg[] = { 5, 6, 8, 9, 10 };\n" +
                "int pos = 3;\n" +
                "\n" +
                "for (int k = 0; k < arg.length; k++) {\n" +
                "System.out.println(arg[k]);\n" +
                "}\n" +
                "for (int i = 0; i < arg.length; i++) {\n" +
                "\n" +
                "if (pos == i) {\n" +
                "for (int j = i + 1; i < arg.length - 1; j++) {\n" +
                "arg[i] = arg[j];\n" +
                "i++;\n" +
                "}\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "System.out.println(\"The output of Array After Delete\");\n" +
                "for (int i = 0; i < arg.length - 1; i++) {\n" +
                "System.out.println(arg[i]);\n" +
                "}\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Display IP Address","import java.net.InetAddress;\n" +
                "\n" +
                "class IPAddress\n" +
                "{\n" +
                "public static void main(String args[]) throws Exception\n" +
                "{\n" +
                "System.out.println(InetAddress.getLocalHost());\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Do While Example","public class DoWhileExample {\n" +
                "\n" +
                "public static void main(String[] args) {\n" +
                "/*\n" +
                "Do while loop executes statment until certain condition become false.\n" +
                "*/\n" +
                "\n" +
                "int i =0; \n" +
                "do\n" +
                "{\n" +
                "System.out.println(\"i is : \" + i);\n" +
                "i++;\n" +
                "\n" +
                "}while(i < 5);\n" +
                "\n" +
                "}\n" +
                "}\n","Output"));
        arr.add(new CodeModel("Even or Odd","import java.util.Scanner;\n" +
                "\n" +
                "class OddOrEven\n" +
                "{\n" +
                "public static void main(String args[])\n" +
                "{\n" +
                "int x;\n" +
                "System.out.println(\"Enter an integer to check if it is odd or even \");\n" +
                "Scanner in = new Scanner(System.in);\n" +
                "x = in.nextInt();\n" +
                "\n" +
                "if ( x % 2 == 0 )\n" +
                "System.out.println(\"You entered an even number.\");\n" +
                "else\n" +
                "System.out.println(\"You entered an odd number.\");\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Factorial using recursion","import java.io.BufferedReader;\n" +
                "import java.io.IOException;\n" +
                "import java.io.InputStreamReader;\n" +
                "\n" +
                "public class Factorial {\n" +
                "\n" +
                "public static void main(String args[]) throws NumberFormatException, IOException{\n" +
                "\n" +
                "System.out.println(\"Enter an integer to calculate it's factorial \");\n" +
                "\n" +
                "//get input from the user\n" +
                "BufferedReader br=new BufferedReader(new InputStreamReader(System.in));\n" +
                "int a = Integer.parseInt(br.readLine());\n" +
                "\n" +
                "//call the recursive function to generate factorial\n" +
                "int result= fact(a);\n" +
                "\n" +
                "\n" +
                "System.out.println(\"Factorial of \"+a+\" is = \" + result);\n" +
                "}\n" +
                "\n" +
                "static int fact(int b)\n" +
                "{\n" +
                "if(b <= 1)\n" +
                "//if the number is 1 then return 1\n" +
                "return 1;\n" +
                "else\n" +
                "//else call the same function with the value - 1\n" +
                "return b * fact(b-1);\n" +
                "}\n" +
                "}\n","Output"));
        arr.add(new CodeModel("Finally Example","public class FinallyExample {\n" +
                "public static void main(String[] argv) {\n" +
                "new FinallyExample().doTheWork();\n" +
                "}\n" +
                "public void doTheWork() {\n" +
                "Object o = null;\n" +
                "for (int i=0; i7lt;5; i++) {\n" +
                "try {\n" +
                "o = makeObj(i);\n" +
                "}\n" +
                "catch (IllegalArgumentException e) {\n" +
                "System.err.println\n" +
                "(\"Error: (\"+ e.getMessage()+\").\");\n" +
                "return; \n" +
                "}\n" +
                "finally {\n" +
                "System.err.println(\"All done\");\n" +
                "if (o==null)\n" +
                "System.exit(0);\n" +
                "}\n" +
                "System.out.println(o); \n" +
                "}\n" +
                "}\n" +
                "public Object makeObj(int type) \n" +
                "throws IllegalArgumentException {\n" +
                "if (type == 1) \n" +
                "throw new IllegalArgumentException\n" +
                "(\"Don't like type \" + type);\n" +
                "return new Object();\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Find Armstrong Number","import java.util.Scanner;\n" +
                "\n" +
                "class ArmstrongNumber\n" +
                "{\n" +
                "public static void main(String args[])\n" +
                "{\n" +
                "int n, sum = 0, temp, remainder, digits = 0;\n" +
                "\n" +
                "Scanner in = new Scanner(System.in);\n" +
                "System.out.println(\"Input a number to check if it is an Armstrong number\"); \n" +
                "n = in.nextInt();\n" +
                "\n" +
                "temp = n;\n" +
                "\n" +
                "// Count number of digits\n" +
                "\n" +
                "while (temp != 0) {\n" +
                "digits++;\n" +
                "temp = temp/10;\n" +
                "}\n" +
                "\n" +
                "temp = n;\n" +
                "\n" +
                "while (temp != 0) {\n" +
                "remainder = temp%10;\n" +
                "sum = sum + power(remainder, digits);\n" +
                "temp = temp/10;\n" +
                "}\n" +
                "\n" +
                "if (n == sum)\n" +
                "System.out.println(n + \" is an Armstrong number.\");\n" +
                "else\n" +
                "System.out.println(n + \" is not an Armstrong number.\"); \n" +
                "}\n" +
                "\n" +
                "static int power(int n, int r) {\n" +
                "int c, p = 1;\n" +
                "\n" +
                "for (c = 1; c <= r; c++) \n" +
                "p = p*n;\n" +
                "\n" +
                "return p; \n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Find Factorial","import java.util.Scanner;\n" +
                "\n" +
                "class Factorial\n" +
                "{\n" +
                "public static void main(String args[])\n" +
                "{\n" +
                "int n, c, fact = 1;\n" +
                "\n" +
                "System.out.println(\"Enter an integer to calculate it's factorial\");\n" +
                "Scanner in = new Scanner(System.in);\n" +
                "\n" +
                "n = in.nextInt();\n" +
                "\n" +
                "if ( n < 0 )\n" +
                "System.out.println(\"Number should be non-negative.\");\n" +
                "else\n" +
                "{\n" +
                "for ( c = 1 ; c <= n ; c++ )\n" +
                "fact = fact*c;\n" +
                "\n" +
                "System.out.println(\"Factorial of \"+n+\" is = \"+fact);\n" +
                "}\n" +
                "}\n" +
                "}\n","Output"));
        arr.add(new CodeModel("Floyd Traingle","import java.util.Scanner;\n" +
                "\n" +
                "class FloydTriangle\n" +
                "{\n" +
                "public static void main(String args[])\n" +
                "{\n" +
                "int n, num = 1, c, d;\n" +
                "Scanner in = new Scanner(System.in);\n" +
                "\n" +
                "System.out.println(\"Enter the number of rows of floyd's triangle you want\");\n" +
                "n = in.nextInt();\n" +
                "\n" +
                "System.out.println(\"Floyd's triangle :-\");\n" +
                "\n" +
                "for ( c = 1 ; c <= n ; c++ )\n" +
                "{\n" +
                "for ( d = 1 ; d <= c ; d++ )\n" +
                "{\n" +
                "System.out.print(num+\" \");\n" +
                "num++;\n" +
                "}\n" +
                "\n" +
                "System.out.println();\n" +
                "}\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("For loop Example","class ForLoop {\n" +
                "public static void main(String[] args) {\n" +
                "int c;\n" +
                "\n" +
                "for (c = 1; c <= 10; c++) {\n" +
                "System.out.println(c);\n" +
                "}\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("GCD & LCM","import java.util.Scanner;\n" +
                "\n" +
                "public class GCD_LCM {\n" +
                "static int gcd(int x, int y){\n" +
                "int r=0, a, b;\n" +
                "a = (x > y) ? x : y; // a is greater number\n" +
                "b = (x < y) ? x : y; // b is smaller number\n" +
                "r = b;\n" +
                "while(a % b != 0){\n" +
                "r = a % b;\n" +
                "a = b;\n" +
                "b = r;\n" +
                "}\n" +
                "return r;\n" +
                "}\n" +
                "\n" +
                "static int lcm(int x, int y){\n" +
                "int a;\n" +
                "a = (x > y) ? x : y; // a is greater number\n" +
                "while(true){\n" +
                "if(a % x == 0 && a % y == 0)\n" +
                "return a;\n" +
                "++a;\n" +
                "}\t\n" +
                "}\n" +
                "\n" +
                "public static void main(String args[])\n" +
                "{\n" +
                "Scanner input = new Scanner(System.in);\n" +
                "System.out.println(\"Enter the two numbers: \");\n" +
                "int x = input.nextInt();\n" +
                "int y = input.nextInt();\n" +
                "\n" +
                "System.out.println(\"The GCD of two numbers is: \" + gcd(x, y));\n" +
                "System.out.println(\"The LCM of two numbers is: \" + lcm(x, y));\n" +
                "input.close();\t\t\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Garbage Collection","import java.util.*;\n" +
                "\n" +
                "class GarbageCollection\n" +
                "{\n" +
                "public static void main(String s[]) throws Exception\n" +
                "{\n" +
                "Runtime rs = Runtime.getRuntime();\n" +
                "System.out.println(\"Free memory in JVM before Garbage Collection = \"+rs.freeMemory());\n" +
                "rs.gc();\n" +
                "System.out.println(\"Free memory in JVM after Garbage Collection = \"+rs.freeMemory());\n" +
                "}\n" +
                "}\n","Output"));
        arr.add(new CodeModel("Hello World","class HelloWorld\n" +
                "{\n" +
                "public static void main(String args[])\n" +
                "{\n" +
                "System.out.println(\"Hello World\");\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Hex to Decimal","import java.util.Scanner;\n" +
                "\n" +
                "public class Hexa_Decimal {\n" +
                "Scanner scan;\n" +
                "int num;\n" +
                "\n" +
                "void getVal() {\n" +
                "System.out.println(\"HexaDecimal to Decimal\");\n" +
                "scan = new Scanner(System.in);\n" +
                "\n" +
                "System.out.println(\"\\nEnter the number :\");\n" +
                "num = Integer.parseInt(scan.nextLine(), 16);\n" +
                "}\n" +
                "\n" +
                "void convert() {\n" +
                "String decimal = Integer.toString(num);\n" +
                "System.out.println(\"Decimal Value is : \" + decimal);\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "class MainClass {\n" +
                "public static void main(String args[]) {\n" +
                "Hexa_Decimal obj = new Hexa_Decimal();\n" +
                "\n" +
                "obj.getVal();\n" +
                "obj.convert();\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("If Else Example","import java.util.Scanner;\n" +
                "\n" +
                "class IfElse {\n" +
                "public static void main(String[] args) {\n" +
                "int marksObtained, passingMarks;\n" +
                "\n" +
                "passingMarks = 40;\n" +
                "\n" +
                "Scanner input = new Scanner(System.in);\n" +
                "\n" +
                "System.out.println(\"Input marks scored by you\");\n" +
                "\n" +
                "marksObtained = input.nextInt();\n" +
                "\n" +
                "if (marksObtained >= passingMarks) {\n" +
                "System.out.println(\"You passed the exam.\");\n" +
                "}\n" +
                "else {\n" +
                "System.out.println(\"Unfortunately you failed to pass the exam.\");\n" +
                "}\n" +
                "}\n" +
                "}\n","Output"));
        arr.add(new CodeModel("Insertion Sort","import java.util.Scanner;\n" +
                "\n" +
                "/* Class InsertionSort */\n" +
                "public class InsertionSort{\n" +
                "/* Insertion Sort function */\n" +
                "public static void sort( int arr[] ){\n" +
                "int N = arr.length;\n" +
                "int i, j, temp;\n" +
                "\n" +
                "for (i = 1; i< N; i++){\n" +
                "j = i;\n" +
                "temp = arr[i]; \n" +
                "\n" +
                "while (j > 0 && temp < arr[j-1]){\n" +
                "arr[j] = arr[j-1];\n" +
                "j = j-1;\n" +
                "}\n" +
                "\n" +
                "arr[j] = temp; \n" +
                "} \n" +
                "} \n" +
                "\n" +
                "/* Main method */\n" +
                "public static void main(String[] args){\n" +
                "Scanner scan = new Scanner( System.in ); \n" +
                "System.out.println(\"Insertion Sort Test\\n\");\n" +
                "int n, i;\n" +
                "\n" +
                "/* Accept number of elements */\n" +
                "System.out.println(\"Enter number of integer elements\");\n" +
                "n = scan.nextInt();\n" +
                "\n" +
                "/* Create integer array on n elements */\n" +
                "int arr[] = new int[ n ];\n" +
                "\n" +
                "/* Accept elements */\n" +
                "System.out.println(\"\\nEnter \"+ n +\" integer elements\");\n" +
                "\n" +
                "for (i = 0; i < n; i++)\n" +
                "arr[i] = scan.nextInt();\n" +
                "\n" +
                "/* Call method sort */\n" +
                "sort(arr);\n" +
                "\n" +
                "/* Print sorted Array */\n" +
                "System.out.println(\"\\nElements after sorting \"); \n" +
                "\n" +
                "for (i = 0; i < n; i++)\n" +
                "System.out.print(arr[i]+\" \"); \n" +
                "System.out.println(); \n" +
                "} \n" +
                "}","Output"));
        arr.add(new CodeModel("Interface Example","interface Info {\n" +
                "static final String language = \"Java\"; \n" +
                "public void display();\n" +
                "}\n" +
                "\n" +
                "class Simple implements Info {\n" +
                "public static void main(String []args) {\n" +
                "Simple obj = new Simple();\n" +
                "obj.display();\n" +
                "} \n" +
                "\n" +
                "// Defining method declared in interface\n" +
                "\n" +
                "public void display() {\n" +
                "System.out.println(language + \" is awesome\");\n" +
                "} \n" +
                "}","Output"));
        arr.add(new CodeModel("Largest Smallest","public class LargestSmallest {\n" +
                "\n" +
                "public static void main(String[] args) {\n" +
                "\n" +
                "//array of 10 numbers\n" +
                "int numbers[] = new int[]{32,43,53,54,32,65,63,98,43,23};\n" +
                "\n" +
                "//assign first element of an array to largest and smallest\n" +
                "int smallest = numbers[0];\n" +
                "int largetst = numbers[0];\n" +
                "\n" +
                "for(int i=1; i< numbers.length; i++)\n" +
                "{\n" +
                "if(numbers[i] > largetst)\n" +
                "largetst = numbers[i];\n" +
                "else if (numbers[i] < smallest)\n" +
                "smallest = numbers[i];\n" +
                "\n" +
                "}\n" +
                "\n" +
                "System.out.println(\"Largest Number is : \" + largetst);\n" +
                "System.out.println(\"Smallest Number is : \" + smallest);\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Largest of 3 no","import java.util.Scanner;\n" +
                "\n" +
                "class LargestOfThreeNumbers\n" +
                "{\n" +
                "public static void main(String args[])\n" +
                "{\n" +
                "int x, y, z;\n" +
                "System.out.println(\"Enter three integers \");\n" +
                "Scanner in = new Scanner(System.in);\n" +
                "\n" +
                "x = in.nextInt();\n" +
                "y = in.nextInt();\n" +
                "z = in.nextInt();\n" +
                "\n" +
                "if ( x > y && x > z )\n" +
                "System.out.println(\"First number is largest.\");\n" +
                "else if ( y > x && y > z )\n" +
                "System.out.println(\"Second number is largest.\");\n" +
                "else if ( z > x && z > y )\n" +
                "System.out.println(\"Third number is largest.\");\n" +
                "else \n" +
                "System.out.println(\"Entered numbers are not distinct.\");\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Last Modification Time","import java.io.*;\n" +
                "import java.util.Date;\n" +
                "\n" +
                "public class GetLastMod {\n" +
                "\n" +
                "public static void main(String[] args) {\n" +
                "\n" +
                "File file = new File(\"C://FileIO//demo.txt\");\n" +
                "\n" +
                "long lastModified = file.lastModified();\n" +
                "\n" +
                "System.out.println(\"File was last modifed at : \" + new Date(lastModified));\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Leap Year","public class LeapYear {\n" +
                "\n" +
                "public static void main(String[] args) {\n" +
                "\n" +
                "//year we want to check\n" +
                "int year = 2004;\n" +
                "\n" +
                "//if year is divisible by 4, it is a leap year\n" +
                "\n" +
                "if((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0)))\n" +
                "System.out.println(\"Year \" + year + \" is a leap year\");\n" +
                "else\n" +
                "System.out.println(\"Year \" + year + \" is not a leap year\");\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Linear Search","import java.util.Scanner;\n" +
                "\n" +
                "class LinearSearch \n" +
                "{\n" +
                "public static void main(String args[])\n" +
                "{\n" +
                "int c, n, search, array[];\n" +
                "\n" +
                "Scanner in = new Scanner(System.in);\n" +
                "System.out.println(\"Enter number of elements\");\n" +
                "n = in.nextInt(); \n" +
                "array = new int[n];\n" +
                "\n" +
                "System.out.println(\"Enter \" + n + \" integers\");\n" +
                "\n" +
                "for (c = 0; c < n; c++)\n" +
                "array[c] = in.nextInt();\n" +
                "\n" +
                "System.out.println(\"Enter value to find\");\n" +
                "search = in.nextInt();\n" +
                "\n" +
                "for (c = 0; c < n; c++)\n" +
                "{\n" +
                "if (array[c] == search) /* Searching element is present */\n" +
                "{\n" +
                "System.out.println(search + \" is present at location \" + (c + 1) + \".\");\n" +
                "break;\n" +
                "}\n" +
                "}\n" +
                "if (c == n) /* Searching element is absent */\n" +
                "System.out.println(search + \" is not present in array.\");\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("List Contents of Dir","import java.io.*;\n" +
                "\n" +
                "public class ListOfDirectory {\n" +
                "public static void main(String[] args) {\n" +
                "\n" +
                "File file = new File(\"C://FileIO\");\n" +
                "\n" +
                "String[] files = file.list();\n" +
                "\n" +
                "System.out.println(\"Listing contents of \" + file.getPath());\n" +
                "for(int i=0 ; i < files.length ; i++)\n" +
                "{\n" +
                "System.out.println(files[i]);\n" +
                "}\n" +
                "}\n" +
                "}\n","Output"));
        arr.add(new CodeModel("Matrix Multiplication","import java.util.Scanner;\n" +
                "\n" +
                "public class MatixMultiplication{\n" +
                "public static void main(String args[]){\n" +
                "int n;\n" +
                "\n" +
                "Scanner input = new Scanner(System.in);\n" +
                "System.out.println(\"Enter the base of squared matrices\");\n" +
                "n = input.nextInt();\n" +
                "\n" +
                "int[][] a = new int[n][n];\n" +
                "int[][] b = new int[n][n];\n" +
                "int[][] c = new int[n][n];\n" +
                "\n" +
                "System.out.println(\"Enter the elements of 1st martix row wise \\n\");\n" +
                "\n" +
                "for (int i = 0; i < n; i++){\n" +
                "for (int j = 0; j < n; j++){\n" +
                "a[i][j] = input.nextInt();\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "System.out.println(\"Enter the elements of 2nd martix row wise \\n\");\n" +
                "\n" +
                "for (int i = 0; i < n; i++){\n" +
                "for (int j = 0; j < n; j++){\n" +
                "b[i][j] = input.nextInt();\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "System.out.println(\"Multiplying the matrices...\");\n" +
                "\n" +
                "for (int i = 0; i < n; i++){\n" +
                "for (int j = 0; j < n; j++){\n" +
                "for (int k = 0; k < n; k++){\n" +
                "c[i][j] = c[i][j] + a[i][k] * b[k][j];\n" +
                "}\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "System.out.println(\"The product is:\");\n" +
                "\n" +
                "for (int i = 0; i < n; i++){\n" +
                "for (int j = 0; j < n; j++){\n" +
                "System.out.print(c[i][j] + \" \");\n" +
                "}\n" +
                "System.out.println();\n" +
                "}\n" +
                "\n" +
                "input.close();\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Matrix Transpose","import java.util.Scanner;\n" +
                "\n" +
                "class TransposeAMatrix\n" +
                "{\n" +
                "public static void main(String args[])\n" +
                "{\n" +
                "int m, n, c, d;\n" +
                "\n" +
                "Scanner in = new Scanner(System.in);\n" +
                "System.out.println(\"Enter the number of rows and columns of matrix\");\n" +
                "m = in.nextInt();\n" +
                "n = in.nextInt();\n" +
                "\n" +
                "int matrix[][] = new int[m][n];\n" +
                "\n" +
                "System.out.println(\"Enter the elements of matrix\");\n" +
                "\n" +
                "for ( c = 0 ; c < m ; c++ )\n" +
                "for ( d = 0 ; d < n ; d++ )\n" +
                "matrix[c][d] = in.nextInt();\n" +
                "\n" +
                "int transpose[][] = new int[n][m];\n" +
                "\n" +
                "for ( c = 0 ; c < m ; c++ )\n" +
                "{\n" +
                "for ( d = 0 ; d < n ; d++ ) \n" +
                "transpose[d][c] = matrix[c][d];\n" +
                "}\n" +
                "\n" +
                "System.out.println(\"Transpose of entered matrix:-\");\n" +
                "\n" +
                "for ( c = 0 ; c < n ; c++ )\n" +
                "{\n" +
                "for ( d = 0 ; d < m ; d++ )\n" +
                "System.out.print(transpose[c][d]+\"\\t\");\n" +
                "\n" +
                "System.out.print(\"\\n\");\n" +
                "}\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("Merge Sort","import java.util.Scanner;\n" +
                "\n" +
                "/* Class MergeSort */\n" +
                "public class MergeSort{\n" +
                "/* Merge Sort function */\n" +
                "public static void sort(int[] a, int low, int high) {\n" +
                "int N = high - low; \n" +
                "\n" +
                "if (N <= 1) \n" +
                "return; \n" +
                "\n" +
                "int mid = low + N/2; \n" +
                "\n" +
                "// recursively sort \n" +
                "sort(a, low, mid); \n" +
                "sort(a, mid, high); \n" +
                "\n" +
                "// merge two sorted subarrays\n" +
                "int[] temp = new int[N];\n" +
                "int i = low, j = mid;\n" +
                "\n" +
                "for (int k = 0; k < N; k++){\n" +
                "if (i == mid) \n" +
                "temp[k] = a[j++];\n" +
                "else if (j == high) \n" +
                "temp[k] = a[i++];\n" +
                "else if (a[j]<a[i]) \n" +
                "temp[k] = a[j++];\n" +
                "else \n" +
                "temp[k] = a[i++];\n" +
                "} \n" +
                "\n" +
                "for (int k = 0; k < N; k++) \n" +
                "a[low + k] = temp[k]; \n" +
                "}\n" +
                "\n" +
                "/* Main method */\n" +
                "public static void main(String[] args) \n" +
                "{\n" +
                "Scanner scan = new Scanner( System.in ); \n" +
                "System.out.println(\"Merge Sort Test\\n\");\n" +
                "int n, i;\n" +
                "\n" +
                "/* Accept number of elements */\n" +
                "System.out.println(\"Enter number of integer elements\");\n" +
                "n = scan.nextInt();\n" +
                "\n" +
                "/* Create array of n elements */\n" +
                "int arr[] = new int[ n ];\n" +
                "\n" +
                "/* Accept elements */\n" +
                "System.out.println(\"\\nEnter \"+ n +\" integer elements\");\n" +
                "for (i = 0; i < n; i++)\n" +
                "arr[i] = scan.nextInt();\n" +
                "\n" +
                "/* Call method sort */\n" +
                "sort(arr, 0, n);\n" +
                "\n" +
                "/* Print sorted Array */\n" +
                "System.out.println(\"\\nElements after sorting \"); \n" +
                "\n" +
                "for (i = 0; i < n; i++)\n" +
                "System.out.print(arr[i]+\" \"); \n" +
                "\n" +
                "System.out.println(); \n" +
                "} \n" +
                "}","Output"));
        arr.add(new CodeModel("Multiple Catch","public class Main {\n" +
                "public static void main (String args[]) {\n" +
                "int array[]={20,20,40};\n" +
                "int num1=15,num2=0;\n" +
                "int result=0;\n" +
                "\n" +
                "try {\n" +
                "result = num1/num2;\n" +
                "System.out.println(\"The result is\" +result);\n" +
                "\n" +
                "for(int i =2;i 7gt;=0; i--){\n" +
                "System.out.println\n" +
                "(\"The value of array is\" +array[i]);\n" +
                "}\n" +
                "}\n" +
                "catch (ArrayIndexOutOfBoundsException e) {\n" +
                "System.out.println\n" +
                "(\"Error:. Array is out of Bounds\"+e);\n" +
                "}\n" +
                "catch (ArithmeticException e) {\n" +
                "System.out.println \n" +
                "(\"Can't be divided by Zero\"+e);\n" +
                "}\n" +
                "}\n" +
                "}\n","Output"));
        arr.add(new CodeModel("Octal to Decimal","import java.util.Scanner;\n" +
                "\n" +
                "public class Octal_Decimal {\n" +
                "Scanner scan;\n" +
                "int num;\n" +
                "\n" +
                "void getVal() {\n" +
                "System.out.println(\"Octal to Decimal\");\n" +
                "scan = new Scanner(System.in);\n" +
                "\n" +
                "System.out.println(\"\\nEnter the number :\");\n" +
                "num = Integer.parseInt(scan.nextLine(), 8);\n" +
                "}\n" +
                "\n" +
                "void convert() {\n" +
                "String decimal = Integer.toString(num);\n" +
                "System.out.println(\"Decimal Value is : \" + decimal);\n" +
                "}\n" +
                "}\n" +
                "\n" +
                "class MainClass {\n" +
                "public static void main(String args[]) {\n" +
                "Octal_Decimal obj = new Octal_Decimal();\n" +
                "\n" +
                "obj.getVal();\n" +
                "obj.convert();\n" +
                "}\n" +
                "}","Output"));
        arr.add(new CodeModel("ArrayArray","Code","Output"));
        Log.i("array","all data enter");
    }

    @Override
    public void onItemClick(CodeModel tm) {
        Intent intent = new Intent(context,CodeActivity.class);
        intent.putExtra("Name",tm.name);
        intent.putExtra("description",tm.description);
        intent.putExtra("code",tm.output);
        //Toast.makeText(this,tm.name,Toast.LENGTH_SHORT).show();
        startActivity(intent);
    }
}