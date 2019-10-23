package com.Exercise20Palindromo.app;
import com.Exercise20Palindromo.model.StringAplications;

public class PalindromeApp 
{

	public static void main(String[] args) 
	{
		//se declaran los string a evaluar
		String cadPalindrome1="Anita lava la tina.";
		String cadPalindrome2="Yo dono rosas, oro no doy!!.";
		String cadPalindrome3="Isaac no ronca asi";
		
		//se imprime el resultado de las clases con string
		System.out.println(StringAplications.isPalindrome(cadPalindrome1));
		System.out.println(StringAplications.isPalindrome(cadPalindrome2));
		System.out.println(StringAplications.isPalindrome(cadPalindrome3));
		
		System.out.println(" ");
		
		//se imprime el resultado de pilas
		System.out.println(StringAplications.isPalindromeStack(cadPalindrome1));
		System.out.println(StringAplications.isPalindromeStack(cadPalindrome2));
		System.out.println(StringAplications.isPalindromeStack(cadPalindrome3));

	}

}
