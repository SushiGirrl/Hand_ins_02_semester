package com.example.hand_ins

import java.util.Locale

fun main() {
    /*
    isEligible();

    val max : Int = getMax(1,18,8);
    val min : Int = getMin(1,18,-8);
    println(max);
    println(min);

    val list: List<Int> = listOf(3,3,6,7,7,9);
    println("Average: ${calculateAverage(list)}");

    val validCPR = "1203945678"
    val invalidCPR = "3206139999"

    println("Is $validCPR valid? ${isValidCPR(validCPR)}")
    println("Is $invalidCPR valid? ${isValidCPR(invalidCPR)}")

    printNumbers();

     */
    println(displayAbbreviationsOfNames("lykke flor andersen"));
}
/*
1.
A person is eligible to vote if his/her age is greater than or equal to 18.
Define a method to find out if he/she is elligible to vote.
Let the user input their age. Get inspiration in the terminal output below:
Please enter your age
6
You are not eligible to vote
*/
fun isEligible(){
    println("Enter age:");
    val age: Int = readln().toInt();
    if (age >= 18){
        println("You are eligible to vote")
    }
    else{
        println("You are not eligible to vote")
    }
}
/*
2.
Define two functions to print the maximum and the minimum number respectively among three numbers
val max : Int = getMax(1,18,8);

val min : Int = getMin(1,18,-8);

println(max); //18
println(min); //-8
*/
fun getMax(a: Int, b: Int, c: Int): Int{
    val array: List<Int> = listOf(a,b,c);
    val arrayDescending: List<Int> = array.sortedDescending();
    return arrayDescending[0];
}
fun getMin(a: Int, b: Int, c: Int): Int{
    val array: List<Int> = listOf(a,b,c);
    return array.sorted()[0]
}
/*
3.
Write a Kotlin function named calculateAverage that takes in a list of numbers and returns their average.
*/
fun calculateAverage(array: List<Int>): Double{
    var sum: Double = 0.0;
    for (number in array){
        number.toDouble();
        sum += number;
    }
    return sum / array.size;
}
/*
4.
Write a method that returns if a user has input a valid CPR number.
A valid CPR number has:
10 Digits.
The first 2 digits are not above 31.
The middle 2 digits are not above 12.
The method returns true if the CPR number is valid, false if it is not.
*/
fun isValidCPR(cprNumber: String): Boolean {
    val cprRegex = """^(0[1-9]|[1-2][0-9]|3[01])(0[1-9]|1[0-2])\d{6}$""".toRegex()

    return cprRegex.matches(cprNumber)
}
/*
5.
Write a program that prints the numbers from 1 to 100.
But for multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”.
For numbers which are multiples of both three and five print “FizzBuzz”.
*/
fun printNumbers(){
    for (i in 1..100){
        if (i % 3 == 0 && i % 5 == 0){
            println("FizzBuzz");
        }
        else if (i % 3 == 0){
            println("Fizz");
        }
        else if (i % 5 == 0){
            println("Buzz");
        }
        else {
            println(i)
        }
    }
}
/*
6.
Write a program that takes your full name as input and displays the
abbreviations of the first and middle names except the last name which is displayed as it is.
For example, if your name is Robert Brett Roser, then the output should be R.B. Roser.
Or Benjamin Dalsgaard Hughes will be B.D. Hughes
*/
fun displayAbbreviationsOfNames(input: String): String{
    //split string into words
    val words: List<String> = input.split(" ");

    //the first letters of the words
    val initials: String = words.dropLast(1).joinToString(". ") { it.first().uppercaseChar().toString()}

    //add the last word
    val result = if (initials.isNotEmpty()) {
        "$initials. ${words.last().replaceFirstChar { it.uppercaseChar() }}"
    }
    else {
        "You did not input your full name, try again."
    }
    return  result;
}
/*
7.
Write a program that takes a numerical grade (0-100) as input
and prints out the corresponding american letter grade.
Implement a function calculateGrade that takes an integer parameter representing
the grade and returns a string representing the letter grade according to the following scale:
90-100: "A"
80-89: "B"
70-79: "C"
60-69: "D"
Below 60: "F"
*/

/*
8.
Write a Kotlin function named filterWordsByLength that takes in a list of strings and a minimum length,
and returns a list containing only the words that have a length greater than
or equal to the specified minimum length.
Use filter function and lambda expressions
*/