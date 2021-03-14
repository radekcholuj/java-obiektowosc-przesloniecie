public class Puzzle extends Toy {
    int elements;

    public Puzzle(String name, double price, int elements) {
        super(name, price);
        this.elements = elements;
    }

    public void display() {
        super.display();
        System.out.println("Number of elements: " + elements);
    }
}
