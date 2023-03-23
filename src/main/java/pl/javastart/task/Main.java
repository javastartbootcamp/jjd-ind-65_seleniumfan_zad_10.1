package pl.javastart.task;

public class Main {
    private static final int NUMBER_OF_BOOKS = 3;

    public static void main(String[] args) {
        Book[] books = new Book[NUMBER_OF_BOOKS];
        System.out.println("Podaj informację o trzech unikalnych książkach");
        for (int i = 0; i < books.length; i++) {
            boolean isUnique = true;
            Book book = BookUtils.createBook();
            for (Book value : books) {
                if (book.equals(value)) {
                    System.out.println("Duplikat");
                    isUnique = false;
                    i--;
                }
            }
            if (isUnique) {
                books[i] = book;
            }
        }

        System.out.println("Obiekty zapisane w tablicy");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
