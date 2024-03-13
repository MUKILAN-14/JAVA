class Library{
    Book book;
    Library(Book book){
        this.book=book;
    }
}
class Book extends Library{
    String title;
    String author;
    int publication_year;
    Book(String title,String author,int year,Book book){
        super(book)
        this.title=title;
        this.author=author;
        publication_year=year;
    }
}
class Author extends Library{
    String name;
    String biography;
    Author(String name,String biography){
        this.name=name;
        this.biography=biography;
    }
}
class main{
    public static void main(String[]args){

    }
}