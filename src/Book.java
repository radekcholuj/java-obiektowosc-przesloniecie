public class Book extends Toy{

    private int pagesNumber;
    private int age;

    public Book(String name, double price, int pagesNumber, int age) {
        super(name, price);
        this.pagesNumber = pagesNumber;
        this.age = age;
    }

    public void display(){
        super.display();
        System.out.println(pagesNumber);
        System.out.println(age);
    }
}
