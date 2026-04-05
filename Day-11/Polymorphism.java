
class Amazon{
    void search(String product){
        System.out.println(" products"+product);
    }
    void search(String product, int price){
        System.out.println("products "+product+" with price "+price);
    }
    void search(String product, String ele){
        System.out.println("products "+product+"electronic"+ele);
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        Amazon a = new Amazon();
        a.search("Laptop"); // Output: Searching for products...
        a.search("Laptop", 50000); // Output: Searching for products with price...
        a.search("Laptop", "electronic"); // Output: Searching for products with price...
    }
}
