import java.util.Scanner;
class Book{
	int bookId;
	String bookName;
	String bookAuthor;
	String bookCategory;
	double rating;
	double price;
	
	
	Book() {  //default constructor
		
		this.bookId = 0;
		this.bookName ="not given";
		this.bookAuthor ="not given";
		this.bookCategory = "not given";
		this.rating = rating=0;
		this.price = price=0;
	}
	//parameter constructor
	Book(int bookId, String bookName,String bookAuthor, String bookCategory, double rating, double price) {
		
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookAuthor=bookAuthor;
		this.bookCategory = bookCategory;
		this.rating = rating;
		this.price = price;
		
		
}
class Library
{
	static int max_book=100;
	Book[] b;
	int count;
		
	//constructor
Library() {
		super();
		b =new Book[max_book];
		
		count = 0;
		presentBook();
	}
void presentBook() {
	addpresentBook(1, "Mrutyunjay", "Shivaji_Sawant", "Historical_Novel", 29.7, 203.0);
    addpresentBook(2, "C Language", "Dennis Ritchie", "Programming", 10.2, 100.9);
    addpresentBook(3, "Panipat", "Vishwas Patil", "Historical Novel", 60.4, 342.4);
    addpresentBook(4, "Atomic Habits", "James Clear", "Self-Help", 9.3, 333.2);
     
}
void addpresentBook(int id,String name,String author,String category,double rating,double price) {
if(count<max_book) {
	b[count]=new Book(id,name,author,category,rating,price);
	count++;
 }
}
void displayDetails(Book[] book,int,count) {
    if (count == 0) {
        System.out.println("No Books Available.");
        return;
    }
    System.out.printf("\n%-5s %-25s %-25s %-20s %-6s\n","ID","Book Name","Author","Category","Rating","Price");
    System.out.println("--------------------------------------------------------------------------------");
			
    for (int i = 0; i < count; i++) {
        System.out.println("\n%-5d %-25s %-25s %-20s %-10.2f %-6.1f\n",
        		book[i].getId(),
        		book[i].getBookName(),
        		book[i].getbookAuthor(),
        		book[i].getbookCategory(),
        		book[i].getRating(),
        		book[i].getPrice(),
        		);
    }
}
boolean isBookIdUnique(int id) {
	for(int i=0;i<count;i++) {
		if(b[i].getId()==id) {
			return false;
		}
	}
	return true;
}
void addBook() {
    if (count >= max_book) {
        System.out.println("Array is Full. Cannot add more books.");
        return;
    }
    System.out.println("Enter Book Details:");
    int id;
    do {
    	System.out.println("enter unique book id :");
    	id=sc.nextInt();
    	if(!isBookIdUnique(id)) {
    		System.out.println("Book Id already exists! pls enter different Id");
    	}
    }
    while(!isBookIdUnique(id));
    sc.nextLine();
    

    System.out.println("Enter Book Name:");
    String bookName = sc.nextLine();
    System.out.println("Enter Author Name:");
    String bookAuthor = sc.nextLine();
    System.out.println("Enter Category:");
    String bookCategory = sc.nextLine();
    System.out.println("Enter Price:");
    double price = sc.nextInt();
    System.out.println("Enter Rating:");
    double rating = sc.nextInt();
    do {
    	System.out.println("Enter Price");
    	price=sc.nextDouble();
    	if(price<=0) {
    		System.out.println("Pls enter valid price");
    	}
    }
    while(price<=0) ;
    	double rating;
    do {
    	System.out.println("Enter Rating");
    	rating.sc=nextDouble();
    	if(rating<=0|| rating>5) {
    		System.out.println("Pls enter valid Rating");
    	}
    }
    while(rating<=0);
    b[count] = new Book(bookId, bookName, bookAuthor, bookCategory, price, rating);
    count++;
    System.out.println("Book Added Successfully!");
}
void updateBook() {
    System.out.println("Enter ID to Update:");
    int id = sc.nextInt();
   
    for (int i = 0; i < count; i++) {
        if (b[i].getId == id) {
        	double price;
        do {
            System.out.println("Enter new Price:");
            b[i].price = sc.nextInt();
            System.out.println("Enter new Rating:");
            b[i].rating = sc.nextInt();
            System.out.println("Book Updated Successfully!");
            found = true;
            break;
        }
    }
    if (!found) {
        System.out.println("Book Not Found!");
    }
}
void removeBook() {
    System.out.println("Enter ID to Remove:");
    int bookId = sc.nextInt();
    boolean removed = false;
    for (int i = 0; i < count; i++) {
        if (b[i].bookId ==bookId) {
            for (int j = i; j < count - 1; j++) {
                b[j] = b[j + 1];
            }
            count--;
            removed = true;
            System.out.println("Book Removed Successfully!");
            break;
        }
    }
    if (!removed) {
        System.out.println("Book Not Found!");
    }
}

void searchBook() {
    sc.nextLine();
    System.out.println("Enter part of Book Name:");
    String key = sc.nextLine().toLowerCase();
    boolean found = false;
    for (int i = 0; i < count; i++) {
        if (b[i].bookName.toLowerCase().contains(key)) {
            b[i].display();
            found = true;
        }
    }
    if (!found) {
        System.out.println("Book Not Found!");
    }
}

void showAuthor() {
    sc.nextLine();
    System.out.println("Enter Author Name:");
    String key = sc.nextLine().toLowerCase();
    boolean found = false;
    for (int i = 0; i < count; i++) {
        if (b[i].bookAuthor.toLowerCase().contains(key)) {
            b[i].display();
            found = true;
        }
    }
    if (!found) {
        System.out.println("No Books Found by this Author!");
    }
}

void showCategory() {
    sc.nextLine();
    System.out.println("Enter Category:");
    String key = sc.nextLine().toLowerCase();
    boolean found = false;
    for (int i = 0; i < count; i++) {
        if (b[i].bookCategory.toLowerCase().contains(key)) {
            b[i].display();
            found = true;
        }
    }
    if (!found) {
        System.out.println("No Books Found in this Category!");
    }
}

void sortBooks() {
    for (int i = 0; i < count - 1; i++) {
        for (int j = 0; j < count - i - 1; j++) {
            if (b[j].price < b[j + 1].price) {
                Book temp = b[j];
                b[j] = b[j + 1];
                b[j + 1] = temp;
            }
        }
    }
    System.out.println("Books Sorted by Price (High to Low).");
}
void menu() {
    int choice;
    do {
        System.out.println("\n--- Book Management System ---");
        System.out.println("1. Add Book");
        System.out.println("2. Display Books");
        System.out.println("3. Search Book");
        System.out.println("4. Update Book");
        System.out.println("5. Show Books by Author");
        System.out.println("6. Delete Book");
        System.out.println("7. Sort Books");
        System.out.println("8. Show Books by Category");
        System.out.println("9. Exit");
        System.out.print("Enter choice: ");
        choice = sc.nextInt();

        switch (choice) {
            case 1 : addBook();
            case 2 : displayDetails();
            case 3 : searchBook();
            case 4 : updateBook();
            case 5 : showAuthor();
            case 6 : removeBook();
            case 7 : {
                sortBooks();
                displayDetails();
            }
            case 8 : showCategory();
            case 9 : System.out.println("Exiting");
            default  System.out.println("Invalid Choice");
        }
    } while (choice != 9);
}
}

	
class BookManagement{
	
	public static void main(String[] args) {
        Library l1 = new Library(100);

        l1.b[0]=new Book(1, "Mrutyunjay", "Shivaji_Sawant", "Historical_Novel", 29.7, 203.0);
        l1.b[1]=new Book(2, "C Language", "Dennis Ritchie", "Programming", 10.2, 100.9);
        l1.b[2]=new Book(3, "Panipat", "Vishwas Patil", "Historical Novel", 60.4, 342.4);
        l1.b[3]=new Book(4, "Atomic Habits", "James Clear", "Self-Help", 9.3, 333.2);
        l1.b[4]=new Book(); 
        l1.count=5;
        l1.menu();
	}
}
