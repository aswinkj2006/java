class Library {
    int bookId;
    String name;
    int ava = 1; // 1 = available, 0 = not available

    void insert(int a, String b) {
        bookId = a;
        name = b;
    }

    void borrow() {
        if (ava == 1) {
            ava = 0;
            System.out.println("\n" + name + " Book Borrowed!");
        } else {
            System.out.println("\n" + name + " is already borrowed!");
        }
    }

    void returnBook() {
        ava = 1;
        System.out.println("\n" + name + " Book Returned!");
    }

    void check() {
        if (ava == 1) {
            System.out.println("\n" + name + " Book Available");
        } else {
            System.out.println("\n" + name + " Book Not Available");
        }
    }
}

class Main2 {
    public static void main(String[] args) {
        Library b1 = new Library();
        Library b2 = new Library();

        b1.insert(123, "Harry Potter");
        b2.insert(556, "Goosebumps");

        b1.borrow();   // Borrow Harry Potter
        b2.borrow();   // Borrow Goosebumps
        b2.returnBook(); // Return Goosebumps

        b1.check();    // Check Harry Potter
        b2.check();    // Check Goosebumps
    }
}
