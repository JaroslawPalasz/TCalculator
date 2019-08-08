package com.javafee.view;

import java.util.Scanner;

import com.javafee.utils.Messages;

import javafx.util.Pair;

public class GetData {
	public Pair<Object, Boolean> getData(){
		//Scanner input = new Scanner(System.in);


		String[] sdfgh = new String[] {"aa", "aa",};
		String asdafa= "bb";

		Object a = sdfgh;
		Object b = asdafa;

		for(String text : (String[])a) {
			System.out.println(text);
		}

		System.out.println(b);

//		System.out.println(Messages.FIRST_VAR_MESSAGE);
//		String firstInput = input.next();
//		System.out.println(Messages.NEXT_VAR_MESSAGE);
//		String secondInput = input.next();
		return new Pair<>("", true);
	}
}
