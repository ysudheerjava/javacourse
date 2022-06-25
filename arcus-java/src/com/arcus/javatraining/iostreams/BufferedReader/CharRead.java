package com.arcus.javatraining.iostreams.BufferedReader;
import java.io.*;

class CharRead
{
	public static void main(String args[]) throws IOException
{
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
char c = (char)br.read(); //Reading character
System.out.println(c);


}
}