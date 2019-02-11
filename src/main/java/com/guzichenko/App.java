package com.guzichenko;

import java.io.IOException;

import com.guzichenko.view.MainMenu;

public class App {

	public static void main(String[] args) throws IOException {
		MainMenu menu = new MainMenu();
		menu.showMenu();
	}

}