//string methods in java by sandeep prasad_ with help of chatGPT
//strings are immutable and can't be changed
//The java.lang.String class provides many useful methods to perform
//operations on sequence of char values.
public class $08_2_string_methods {
    public static void main(String[] args) {

        // 1. length() - returns the length of the string
        String str = "Hello, World!";
        System.out.println("1. Length: " + str.length());

        // 2. charAt() - returns the character at the specified index
        System.out.println("2. Character at index 4: " + str.charAt(4));

        // 3. substring() - returns a substring from the specified index
        System.out.println("3. Substring from index 7: " + str.substring(7));

        // 4. indexOf() - returns the index of the specified character or substring
        System.out.println("4. Index of 'o': " + str.indexOf('o'));
        System.out.println("4. Index of 'World': " + str.indexOf("World"));

        // 5. contains() - checks if the string contains a specified substring
        System.out.println("5. Contains 'Hello': " + str.contains("Hello"));
        System.out.println("5. Contains 'Java': " + str.contains("Java"));

        // 6. startsWith() - checks if the string starts with a specified prefix
        System.out.println("6. Starts with 'Hello': " + str.startsWith("Hello"));
        System.out.println("6. Starts with 'World': " + str.startsWith("World"));

        // 7. endsWith() - checks if the string ends with a specified suffix
        System.out.println("7. Ends with 'World!': " + str.endsWith("World!"));
        System.out.println("7. Ends with 'Java!': " + str.endsWith("Java!"));

        // 8. toUpperCase() - converts the string to uppercase
        System.out.println("8. Uppercase: " + str.toUpperCase());

        // 9. toLowerCase() - converts the string to lowercase
        System.out.println("9. Lowercase: " + str.toLowerCase());

        // 10. replace() - replaces characters or substrings with another string
        System.out.println("10. Replace 'World' with 'Java': " + str.replace("World", "Java"));

        // 11. trim() - removes leading and trailing whitespaces
        String str2 = "   Trim   ";
        System.out.println("11. Trimmed string: " + str2.trim());

        // 12. equals() - checks if two strings are equal
        String str3 = "Hello";
        String str4 = "hello";
        System.out.println("12. Equals 'Hello': " + str3.equals(str4));

        // 13. equalsIgnoreCase() - checks if two strings are equal ignoring case
        System.out.println("13. EqualsIgnoreCase 'Hello': " + str3.equalsIgnoreCase(str4));

        // 14. isEmpty() - checks if the string is empty
        String str5 = "";
        System.out.println("14. Is Empty: " + str5.isEmpty());
    }
}
