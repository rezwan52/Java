// Zoo class

public class Zoo {
    public static void main(String[] args) {
        Shark shark = new Shark("Whale Shark", "gray", 50);

        shark.hunt("fish", 10);
        shark.display();
    }
}

// output: Whale Shark like to hunt fish
// output: Species: Whale Shark Color: gray Weight: 60.0