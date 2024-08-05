public class JavaMini06 {

    // Fields (variables)
    private String name;
    private int value;

    // Constructor
    public JavaMini06(String name, int value) {
        this.name = name;
        this.value = value;
    }

    // Getter for name
    public String getName() {
        return name;
    }

    // Setter for name
    public void setName(String name) {
        this.name = name;
    }

    // Getter for value
    public int getValue() {
        return value;
    }

    // Setter for value
    public void setValue(int value) {
        this.value = value;
    }

    // Method to display object information
    public void displayInfo() {
        System.out.println("Name: " + name + ", Value: " + value);
    }

    // Main method to test the class
    public static void main(String[] args) {
        // Creating an instance of JavaMini06
        JavaMini06 obj = new JavaMini06("Example", 42);

        // Displaying initial information
        obj.displayInfo();

        // Modifying the object's properties
        obj.setName("New Example");
        obj.setValue(100);

        // Displaying updated information
        obj.displayInfo();
    }
}
