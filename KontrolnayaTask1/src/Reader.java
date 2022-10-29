import java.lang.reflect.Array;
import java.util.Arrays;

public class Reader {

    public String FIO;

    public String NumberBilet;

    public String birthDate;

    public String tel;

    public String faculty;

    public Reader(String FIO, String NumberBilet, String birthDate, String tel, String faculty) {
        this.FIO = FIO;
        this.NumberBilet = NumberBilet;
        this.birthDate = birthDate;
        this.tel = tel;
        this.faculty = faculty;
    }

    public void takeBook(int col) {
        System.out.printf(this.FIO + " взял " + col + " книги \n");
    }

    public void takeBook(String... ArrayOfTitles) {
        System.out.printf(this.FIO + " взял следующие книги " + Arrays.toString(ArrayOfTitles) +"\n");
    }

    public void takeBook(Book... arrayOfBooks) {
        System.out.printf(this.FIO + " взял следующие книги " + Arrays.toString(arrayOfBooks)+"\n");
    }

    public void returnBook(int col) {
        System.out.printf(this.FIO + " вернул " + col + " книги");
    }

    public void returnBook(String... ArrayOfTitles) {
        System.out.printf(this.FIO + " вернул следующие книги " + Arrays.toString(ArrayOfTitles)+"\n");
    }

    public void returnBook(Book... arrayOfBooks) {
        System.out.printf(this.FIO + " вернул следующие книги " + Arrays.toString(arrayOfBooks)+"\n");
    }

}
