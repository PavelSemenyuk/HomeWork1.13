public class HomeWork {
    /* Реализуйте методы toString, equals и hashCode в классах Author и Book, которые вы создали на прошлом уроке.
Обратите внимание, что toString книги не должен дублировать код из toString автора,
а должен делегировать (вызывать) его версию метода.*/

    public static void main(String[] args) {
        Book book1 =  new Book("Мастер и Маргарита", 1928, "Михаил Булгаков.");
        System.out.println(book1);
        Avthor avthor1= new Avthor("Михаил ","Булгаков");
        System.out.println(avthor1);
        book1.setDate(1956);
        System.out.println("Год переиздания = " + book1.getDate());

        System.out.println();

        Book book2 = new Book("Атлант расправил плечи", 1957, "Айн Рэйн.");
        System.out.println(book2);
        Avthor avthor2= new Avthor("Айн ","Рэйн");
        System.out.println(avthor2);
        book2.setDate(1988);
        System.out.println("Год переиздания = " + book2.getDate());


        System.out.println(book1.equals(book2));
        System.out.println(avthor1.equals(avthor2));

    }


}

