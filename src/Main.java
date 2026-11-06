//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        Author author = new Author("Yevgeny", "Zamyatin");
        Book book1 = new Book("We", author, 1920);

        System.out.println("Автор - " + book1.getAuthor().getSurname() + " " + book1.getAuthor().getName());
        System.out.println("Название - " + book1.getName());
        System.out.println("Год написания - " + book1.getYear());
        book1.setYear(1888);
        System.out.println("book1.getYear() = " + book1.getYear());

        Author author2 = new Author("Stephen", "King");
        Book book2 = new Book("It", author2, 1986);
        System.out.println("Автор - " + book2.getAuthor().getSurname() + " " + book2.getAuthor().getName());
        System.out.println("Название - " + book2.getName());
        System.out.println("Год написания - " + book2.getYear());

        Author author3 = new Author("Fyodor", "Dostoevsky");
        Book book3 = new Book("Idiot", author3, 1868);
        System.out.println("Автор - " + book3.getAuthor().getSurname() + " " + book3.getAuthor().getName());
        System.out.println("Название - " + book3.getName());
        System.out.println("Год написания - " + book3.getYear());

    }
}