package temperature_converter;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	static Scanner scanner = new Scanner(System.in);
	static String message = "Выбрерите операцию:  \nвведите "
			+ "'0' чтобы : конвертировать из Цельсия в Фаренгейт. \nвведите "
			+ "'1' чтобы : конвертировать  из Фаренгейта в Цельсий. ";

	public static void main(String[] arr) {

		System.out.println(message);
		int choice = choice();

		System.out.println("Введите температуру: ");
		int temp = valid();
		int convent;

		switch (choice) {
		case 0:
			convent = (int) Math.round(((double) temp) * 9 / 5 + 32);
			System.out.println(temp + "°C = " + convent + "℉");
			break;
		case 1:
			convent = (int) Math.round((((double) temp) - 32) * 5 / 9);
			System.out.println(temp + "℉ = " + convent + "°C");
			break;
		}

	}

	public static int choice() {

		int choise = 0;
		while (true) {
			String user = scanner.next();
			switch (user) {
			case "0":
				return choise;
			case "1":
				choise = 1;
				return choise;
			default:
				System.out.println(message);
			}
		}

	}

	public static int valid() {
		int num = 0;

		boolean loop = true;
		while (loop) {
			try {
				num = scanner.nextInt();
				loop = false;
			} catch (InputMismatchException e) {
				System.out.println("Введите целое число! ");
				scanner.next();
			}
		}

		return num;
	}
}
