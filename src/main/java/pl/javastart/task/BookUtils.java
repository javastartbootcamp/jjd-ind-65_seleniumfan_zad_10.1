package pl.javastart.task;

import java.util.Scanner;

public class BookUtils {
    private static final Scanner scanner = new Scanner(System.in);

    public static Book createBook() {
        System.out.println("Podaj tytuł");
        String title = scanner.nextLine();
        System.out.println("Podaj ilość stron");
        int numberOfPages = scanner.nextInt();
        scanner.nextLine();
        return new Book(title, numberOfPages);
    }
}
