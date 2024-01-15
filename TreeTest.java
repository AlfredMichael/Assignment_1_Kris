// Import the package
import java.util.*;

// Class TreeTest definition
public class TreeTest {
    public static void main(String[] args) {
        // Create a new Tree object
        Tree myTree = new Tree();

        // Declare an int variable to store the random value
        int intVal;

        // Declare and initialize a HashSet
        HashSet<Integer> set = new HashSet<Integer>();

        // Print a message
        System.out.println("Inserting the following values: ");

        // Loop from 1 to 9
        for (int i = 1; i < 10; i++) {
            // Generate a random value between 0 and 100
            intVal = (int) (Math.random() * 100);

            // Keep generating a new value until it is not in the Set
            while (set.contains(intVal)) {
                intVal = (int) (Math.random() * 100);
            }

            // Add the value to the Set and the tree
            set.add(intVal);
            myTree.insertNode(intVal);

            // Print the value
            System.out.println(intVal + " ");
        }

        // Print a blank line
        System.out.println();

        // Print a message
        System.out.println("\n\nPreorder traversal");

        // Call the preorderTraversal method of the tree
        myTree.preorderTraversal();

        // Print a message
        System.out.println("\n\nInorder traversal");

        // Call the inorderTraversal method of the tree
        myTree.inorderTraversal();

        // Print a message
        System.out.println("\n\nPostorder traversal");

        // Call the postorderTraversal method of the tree
        myTree.postorderTraversal();

        // Print a blank line
        System.out.println();

        // Exit the program
        System.exit(0);
    }
}
    