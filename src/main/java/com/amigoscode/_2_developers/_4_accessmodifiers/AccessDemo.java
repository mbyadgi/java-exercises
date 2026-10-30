package com.amigoscode._2_developers._4_accessmodifiers;

/**
 * Access Modifiers Demo
 *
 * Demonstrates how different access modifiers behave when accessing members
 * from another class in the SAME package. Complete the AccessModifiers class first.
 */
public class AccessDemo {

    public static void main(String[] args) {
        //  1 - Create an instance of AccessModifiers.
        AccessModifiers accessModifiers = new AccessModifiers();

        System.out.println("=== Calling Public Method ===");
        //  2 - Call the publicGreeting() method on your instance and print the result.
        //  This works because public methods are accessible from anywhere.
        System.out.println(accessModifiers.publicGreeting());

        System.out.println("\n=== Calling Package-Private Method ===");
        //  3 - Call the packageGreeting() method on your instance and print the result.
        //  This works because AccessDemo is in the SAME package as AccessModifiers.
        System.out.println(accessModifiers.packageGreeting());

        System.out.println("\n=== Accessing Private Field Through Getter ===");
        //  4 - Use setSecret() to set a value, then use getSecret() to read it back.
        //  Print the result. This demonstrates proper encapsulation:
        //  we access the private field only through public getter/setter methods.
        accessModifiers.setSecret("secret value");
        System.out.println(accessModifiers.getSecret());

        System.out.println("\n=== Why Direct Private Access Won't Work ===");
        //  5 - Write a comment explaining why the following line would NOT compile:
        //  // instance.secret = "trying direct access";
        //  Then leave the line commented out, preceded by your explanation.
        //  Hint: think about what 'private' means for field visibility outside the class.
        // the following line would not compile because a field with access modifier as private
        // is only accessible within the scope of its own class
        // accessModifiers.secret = "trying direct access";
    }
}
