package com.vkornieiev;

import com.vkornieiev.view.MainMenu;

import java.io.IOException;

public class App {

	public static void main(String[] args) throws IOException {
		MainMenu menu = new MainMenu();
		menu.showMenu();
	}

}