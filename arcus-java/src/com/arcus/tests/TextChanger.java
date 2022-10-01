package com.arcus.tests;

import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TextChanger {

	public static void writeTextToFile(String fileName, String text) {

		try (PrintWriter out = new PrintWriter(fileName)) {
			out.println(text);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

	}

	public static String readTextFromFile(String fileName) throws FileNotFoundException {

		String line = null;
		File file = new File(fileName);

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
			if (bufferedReader != null) {
				line = bufferedReader.readLine();

			}
		} catch (FileNotFoundException e) {
			throw e;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return line;
	}

	public static String getTextWithoutDotAndSpace(String text) {
		return text.replaceAll("[.,\\s]", "");
	}

	public static int getCountofChars(String text) {
		return text.length();
	}

	public static int getCountOfCharOccurence(String text, char c) {

		int count = 0;

		for (int i = 0; i < text.length(); i++) {
			if (text.charAt(i) == c) {
				count++;// count = count+1;
			}
		}

		return count;

	}

	public static String getModifiedText(String text) {
		String modifiedText = text.replace("I", "We");
		return modifiedText.replace("my", "our");
	}

	public static void main(String[] args) throws IOException {

		String text = "India is my country and all Indians are my brothers and sisters. I love my country and I am proud of its rich and varied heritage. I shall always strive to be worthy of it. I shall give respect to my parents,teachers and elders and treat everyone with courtesy. To my country and my people, I pledge my devotion. In their well being and prosperity alone, lies my happiness.";
		String fileName = "My Pledge.txt";
		String modifiedFileName = "Our Pledge.txt";

		System.out.println(getCountofChars(text));

		// Write text to file
		writeTextToFile(fileName, text);

		System.out.println(readTextFromFile(fileName));

		String textWithoutDotAndSpace = getTextWithoutDotAndSpace(text);

		System.out.println(getCountofChars(textWithoutDotAndSpace));

		System.out.println(getCountOfCharOccurence(text, 'I'));

		System.out.println(getModifiedText(text));

		String modifiedText = getModifiedText(text);

		writeTextToFile(modifiedFileName, modifiedText);

	}
}