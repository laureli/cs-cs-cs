package forLab02;

//Program for Lab 02 
// Author: Barbara Li Santi


import java.util.Scanner;

public class TextOnlyMadLib {

	private static Scanner myScanner = new Scanner(System.in);

	public static void main(String[] args) {
		String noun1, noun2, noun3, noun4, noun5, noun6;
		String adj1, adj2, adj3, adj4, adj5, adj6, adj7;
		String container;
		String pastTenseVerb;
		String pluralNoun;
		System.out.println("Welcome to the text-only mad lib program.");
		System.out.println("Please enter the various kinds of words requested below.");
		System.out.println("After you have answered all the prompts,");
		System.out.println("your mad lib will be displayed.");
		System.out.println("Please enter noun #1.");
		noun1 = myScanner.nextLine();
		System.out.println("Please enter adjective #1.");
		adj1 = myScanner.nextLine();
		System.out.println("Please enter noun #2.");
		noun2 = myScanner.nextLine();
		System.out.println("Please enter noun #3.");
		noun3 = myScanner.nextLine();
		System.out.println("Please enter adjective #2.");
		adj2 = myScanner.nextLine();
		System.out.println("Please enter adjective #3.");
		adj3 = myScanner.nextLine();
		System.out.println("Please enter noun #4.");
		noun4 = myScanner.nextLine();
		System.out.println("Please enter the name of a container.");
		container = myScanner.nextLine();
		System.out.println("Please enter noun #5.");
		noun5 = myScanner.nextLine();
		System.out.println("Please enter noun #6.");
		noun6 = myScanner.nextLine();
		System.out.println("Please enter adjective #4.");
		adj4 = myScanner.nextLine();
		System.out.println("Please enter adjective #5.");
		adj5 = myScanner.nextLine();
		System.out.println("Please enter adjective #6.");
		adj6 = myScanner.nextLine();
		System.out.println("Please enter adjective #7.");
		adj7 = myScanner.nextLine();
		System.out.println("Please enter a past tense verb.");
		pastTenseVerb = myScanner.nextLine();
		System.out.println("Please enter a plural noun.");
		pluralNoun = myScanner.nextLine();

		System.out.println("\n\nFather Goose Rhymes\n\n");
		System.out.println("Old Mother Hubbard went to the " + noun1 + "\n");
		System.out.println("to get her "  +adj1 + " " + noun2 + " a bone.\n");
		System.out.println("When she got there, the " + noun3 + " was " 
				+ adj2 + "\n");
		System.out.println("And so her " + adj3 + " dog had none.\n");
		System.out.println();
		System.out.println("Jack and Jill went up the " + noun4 + "\n");
		System.out.println("to fetch a/an " + container + " of water.\n");
		System.out.println("Jack fell down and broke his " + noun5 + ",\n");
		System.out.println("And Jill came tumbling after.\n");
		System.out.println();
		System.out.println("There was a little girl who had a little curl\n");
		System.out.println("right in the middle of her " + noun6 + ".\n");
		System.out.println("And when she was " + adj4 + ", she was very, very "
				+ adj5 + ",\n");
		System.out.println("And when she was bad, she was " + adj6 + ".\n");
		System.out.println("There was a/an " + adj7 + " woman\n");
		System.out.println("who " + pastTenseVerb + " in a shoe.\n");
		System.out.println("She had so many " + pluralNoun + "\n");
		System.out.println("She didn't know what to do.\n");
	}//main

}//TextOnlyMadLib
