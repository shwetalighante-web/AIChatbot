import java.util.Scanner;

public class Main {

    public static String getResponse(String message) {

        String text = message.toLowerCase().trim();

        // Simple NLP text processing
        text = text.replaceAll("[^a-zA-Z0-9 ]", "");

        if (text.contains("hello") ||
            text.contains("hi") ||
            text.contains("hey")) {
            return "Hello! How can I help you?";
        }

        if (text.contains("how are you")) {
            return "I am doing great! Thank you for asking.";
        }

        if (text.contains("your name")) {
            return "I am a Java-based AI Chatbot.";
        }

        if (text.contains("java")) {
            return "Java is an object-oriented programming language.";
        }

        if (text.contains("dsa") ||
            text.contains("data structure")) {
            return "DSA means Data Structures and Algorithms. Important topics include arrays, linked lists, stacks, queues, trees and graphs.";
        }

        if (text.contains("array")) {
            return "An array stores multiple values of the same data type.";
        }

        if (text.contains("linked list")) {
            return "A linked list is a collection of nodes connected using links.";
        }

        if (text.contains("stack")) {
            return "A stack follows LIFO: Last In, First Out.";
        }

        if (text.contains("queue")) {
            return "A queue follows FIFO: First In, First Out.";
        }

        if (text.contains("c language") ||
            text.equals("c")) {
            return "C is a procedural programming language.";
        }

        if (text.contains("oops") ||
            text.contains("oop")) {
            return "OOP stands for Object-Oriented Programming. Its concepts include inheritance, polymorphism, abstraction and encapsulation.";
        }

        if (text.contains("help")) {
            return "You can ask me about Java, C, DSA, OOP, arrays, linked lists, stacks or queues.";
        }

        if (text.contains("thank")) {
            return "You're welcome! Happy learning!";
        }

        if (text.contains("bye") ||
            text.contains("goodbye")) {
            return "Goodbye! Have a great day!";
        }

        return "Sorry, I don't understand. Please ask about Java, C, DSA or programming.";
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("=================================");
        System.out.println("        AI CHATBOT");
        System.out.println("=================================");
        System.out.println("Type 'bye' to exit.");
        System.out.println();

        while (true) {

            System.out.print("You: ");
            String message = sc.nextLine();

            String response = getResponse(message);

            System.out.println("AI Chatbot: " + response);
            System.out.println();

            if (message.toLowerCase().contains("bye")) {
                break;
            }
        }

        sc.close();
    }
}