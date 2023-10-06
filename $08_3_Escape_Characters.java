public class $08_3_Escape_Characters {
    public static void main(String[] args) {
        // Using escape sequence characters in strings
        // \n - Newline character: Moves the cursor to the beginning of the next line.
        // \t - Tab character: Inserts a horizontal tab space.
        // \\ - Backslash character: Prints a single backslash.
        // \" - Double quote character: Prints a double quote.
        // \' - Single quote character: Prints a single quote.
        
        System.out.println("This is a normal string.");
        System.out.println("This string contains a newline character.\nIt will be printed on a new line.");
        System.out.println("This string contains a tab character.\tIt will produce a tab space.");
        System.out.println(
                "This string contains a form feed character.\fIt may cause a page break (depending on the console).");
        System.out.println("This string contains a backslash character.\\ It will be printed as a single backslash.");
        System.out.println("This string contains a double quote character.\" It will be printed as a double quote.");
        System.out.println("This string contains a single quote character.' It will be printed as a single quote.");
    }
}
