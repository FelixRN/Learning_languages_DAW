package com.p01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import com.p01.view.MainView;

public class Main {
	public static void main(String[] args) {
		String configPath= "C:\\Users\\USUARIO\\Desktop\\book.config";
		MainView mainView = new MainView();
		mainView.run();
	}
	private String loadConfig(String configPath) {
		return null;
	} {
		String value = null;
		try {
		Object configPath;
		Scanner scanner = new Scanner(new File(configPath));
		value = scanner.nextLine();
		scanner.close();
}catch  (FileNotFoundException e) {
	e.printStackTrace();
	value = "model_type=memory";
}
return value;
}
}