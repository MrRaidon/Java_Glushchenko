public class Book {
    public String title;
    public String auth;

    public Book(String auth, String title){
        this.auth = auth;
        this.title = title;
    }

    public String toString(){return this.title + " под авторством " + this.title;}
}
