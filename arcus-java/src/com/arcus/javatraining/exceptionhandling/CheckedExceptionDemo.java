package com.arcus.javatraining.exceptionhandling;

public class CheckedExceptionDemo {

	public static void main(String[] args) {

		int i = 10;
		int j = 0;
		String s = null;

		try {
			System.out.println("statement1");
			// System.out.println(i / j);
			System.out.println(s.length());

		}/* catch (ArithmeticException fe) {
			System.out.println("In ArithmeticException exception block");
			fe.printStackTrace();
		} catch (Exception fe) {
			System.out.println("In  exception block");
			fe.printStackTrace();
		}*/
			
			catch(Exception  e){
				//below assignment will throw compile time exception since e is final
				//e = new Exception();
				System.out.println(e.getMessage());
			}
		}

	}

