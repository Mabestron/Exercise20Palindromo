package com.Exercise20Palindromo.model;
import java.util.Stack;

public class StringAplications 
{
	
	
	////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////
	// palindromos con string
	
	public static boolean isPalindrome(String cad)
	{
		boolean isPal=true;
		
		//Se limpia la clase de signos de puntuacion
		String cadClean=cad.replace(" ", "");
		cadClean = cadClean.replace(".","");
		cadClean = cadClean.replace(",","");
		cadClean = cadClean.replace("!","");
		cadClean = cadClean.toLowerCase();
		
		//se evalua sí es palindromo
		for (int i=0; i<cadClean.length();i++)
		{
			if (cadClean.charAt(i)!=cadClean.charAt((cadClean.length()-1)-i))
			{
				
				isPal=false;
			}
		}
		
		//se imprime la cadena
		System.out.println(cadClean);
		
		//se regresa un true o false dependiendo sí es palindromo
		return isPal;
	}

///////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////7
	//Resolver palindromos con PILAS
	
	public static boolean isPalindromeStack(String cad)
	{
		boolean isPal=true;
		
		//Se limpia la clase de signos de puntuacion
		String cadClean=cad.replace(" ", "");
		cadClean = cadClean.replace(".","");
		cadClean = cadClean.replace(",","");
		cadClean = cadClean.replace("!","");
		cadClean = cadClean.toLowerCase();
		char [] cadArray = cadClean.toCharArray();
		
		//Se crean las pilas
		Stack<Character> letters1 = new Stack<Character>();
		Stack<Character> letters2 = new Stack<Character>();
		
		for (Character c: cadArray)
		{
			letters1.push(c);
		}
		
		for (int i=cadArray.length-1;i>=0;i--)
		{
			letters2.push(cadArray[i]);
		}
		
		while(!letters1.isEmpty())
		{
			if (letters1.pop()!=letters2.pop())
			{
				isPal=false;
			}
			
		}
		
		return isPal;
	}
	
	
}
