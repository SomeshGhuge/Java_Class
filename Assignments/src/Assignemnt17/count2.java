package Assignemnt17;
import java.io.*;
import java.util.Scanner;
public class count2 {
	int vowelcount = 0;
	int numbercount =0;{

	
	try {
	// Creating Object of FileInputStream to get datafrom

	FileInputStream fileinputstream = new
	FileInputStream("C:\\\\Users\\\\HP\\\\Desktop\\\\IT sector   JAVA Course\\\\Java\\\\Velocity\\\\Java Backend Developer\\\\Practise\\\\abc.txt");

	// Creating Scanner class object and Passing the FileInputStream Object to

	// Scanner for Scanning data
	Scanner scanner = new Scanner(fileinputstream);
	while (scanner.hasNextLine()) {
	// Run the loop till next line is present in the given file

	String s = scanner.nextLine(); // Storing each line of String into s variable

	for (int i = 0; i < s.length(); i++) {
	// Running this loop till characters exits in the string

	char ch = s.charAt(i); // Storing each	character of String as per Index i

	if (ch == 65 || ch == 69 || ch == 73 || ch

	== 79 || ch == 85 || ch == 97 || ch == 101 || ch == 105

	|| ch == 111 || ch == 117) {
	// Checking for vowels using ASCII	values

	vowelcount++;
	// If character in a string is vowel 	then this will increase by one everytime

	}
	if (ch >= 48 && ch <= 57) {
	// to check if character in a string is number

	numbercount++; // if character in a 	string is number then this will increase everytime by on
	}
	}
	}
	System.out.println("Total Number of Vowels in file are>> " + vowelcount);

	System.out.println("Total Number of Numbers in file are>> " + numbercount);

	scanner.close();
	} catch (IOException e) {
	System.out.println(e);
	}
	}

}
