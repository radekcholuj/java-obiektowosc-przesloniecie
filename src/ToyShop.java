public class ToyShop {
    private Bear[] bears = new Bear[10];
    private int indexBear = 0;

    private Car[] cars = new Car[10];
    private int indexCar = 0;

    Book[] books = new Book[10];
    int bookIndex = 0;

    Puzzle[] puzzles = new Puzzle[10];
    int puzzleIndex = 0;


    public void addBear(Bear bear){
        if(indexBear < bears.length) {
            bears[indexBear++] = bear;
        }
    }

    public void addCar(Car car) {
        if(indexCar < cars.length) {
            cars[indexCar++] = car;
        }
    }
    public void addBook(Book book) {
        if (bookIndex < books.length) {
            books[bookIndex++] = book;
        }
    }
    public void addPuzzle(Puzzle puzzle) {
        if (puzzleIndex < puzzles.length) {
            puzzles[puzzleIndex++] = puzzle;
        }
    }

    public void displayAll(){
        for (int i = 0; i < indexBear; i++) {
            bears[i].display();
        }
        for (int i = 0; i < indexCar; i++) {
            cars[i].display();
        }
        for (int i = 0; i < bookIndex; i++) {
            books[i].display();
        }
        for (int i = 0; i < puzzleIndex; i++) {
            puzzles[i].display();
        }
    }
}
