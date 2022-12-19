public class Main {
    public static void main(String[] args) {

        Author author1 = new Author("Лев", "Толстой");
        Author author2 = new Author("Александр", "Пушкин");
        Book book1 = new Book("Война и мир", author1 , 1865);
        System.out.println(book1);
        System.out.println("Корректировка даты публикации");
        book1.setYearPublication(1869);
        System.out.println(book1);
        Book book2 = new Book("Евгений Онегин", author2, 1825);
        System.out.println(book2);

    }
}