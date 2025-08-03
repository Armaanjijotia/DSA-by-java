public class stringbuilder {
    public static void main(String[] args) {
        // StringBuilder name=new StringBuilder("kingdom ");
        // System.out.println(name);
        // System.out.println(name.charAt(2)); //char at 2 will return

        // name.setCharAt(4, 'B');  // replace the 4th position char by new 
        // System.out.println(name);
        // name.setCharAt(0, 'Q');  // replace at starting position char by new 
        // System.out.println(name);
        // name.insert(5, 'S'); // insert add any element 
        // System.out.println(name);
        // name.delete(2, 5); // delete element 2th till 5th
        // System.out.println(name);
        // name.append("b"); //if there is a word then 
        // System.out.println(name); // output is QiSom b
        // StringBuilder king=new StringBuilder("h");
        // king.append("b"); //if there is a single alphabet (h) then 
        // System.out.println(king); // output is hb

        StringBuilder you=new StringBuilder("hello");
        // Loop from the start to the middle of the string
        for (int i = 0; i < you.length() / 2; i++) {
            // Index from the front
            int front = i;
            // Index from the back
            int back = you.length() - 1 - i;

            // Get characters at front and back
            char frontChar = you.charAt(front);
            char backChar = you.charAt(back);

            // Swap the characters
            you.setCharAt(front, backChar);
            you.setCharAt(back, frontChar);
        }
        // Print the reversed string
        System.out.println("Reversed: " + you);
    }
}
