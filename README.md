Duplicate Finder in Java

This repository contains a simple Java program that checks if an array contains duplicate values. The program sorts the input array and then checks for adjacent duplicates.

Features

	•	Duplicate Detection: The program efficiently detects if there are any duplicate values in the input array.
	•	Sorting: Uses Arrays.sort() to sort the input array, making the detection process straightforward by comparing adjacent elements.

How it Works

The program follows these steps:

	1.	The input array is sorted using the built-in Arrays.sort() method.
	2.	After sorting, the program iterates through the array and checks if any consecutive elements are the same.
	3.	If a duplicate is found, the program returns true; otherwise, it returns false.
