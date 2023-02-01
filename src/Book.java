public class Book {
    private String name;
    private int date;
    private  String author;


    public Book(String name, int date, String author) {
        this.name = name;
        this.date = date;
        this.author=author;
    }

    public String getName() {
        return this.name;
    }

    public int getDate() {
        return this.date;
    }
    public String getAuthor() {
        return this.author;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String toString() {
        return "НАЗВАНИЕ КНИГИ - " + this.name + ". ГОД ПУБЛИКАЦИИ - " + this.date + ". ИМЯ АВТОРА - "+ this.author;
    }
    @Override
    public boolean equals(Object other) {
        if (getClass() != other.getClass()){
            return false;
        }
        Book book2 = (Book) other;
        return name.equals(book2.name) && this.date==book2.date && author.equals(book2.author);
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, date, author);
    }


}
