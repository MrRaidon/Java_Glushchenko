import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Reader reader1 = new Reader("Андрей И.И.", "123", "12.12.2000", "89991233223", "Informatic");
        Reader reader2 = new Reader("Павел А.Н.", "321", "02.02.2007", "89921234234", "Informatic");
        reader1.takeBook(6);
        reader1.takeBook("Мастер и Маргарита", "Война и мир","Преступление и наказание");
        Book book1 = new Book("А.С. Пушкин", "Евгений Онегин");
        Book book2 = new Book("М.Ю. Лермонтов.", "Герой нашего времени");
        reader1.takeBook(book1,book2);
        reader1.returnBook(3);
        reader1.returnBook("Мастер и Маргарита", "Война и мир","Преступление и наказание");
        reader1.returnBook(book1,book2);

    }
}