public class $19_Array {
    public static void main(String[] args) {
        // Arrays are used to store multiple values in a single variable, instead of declaring
        // separate variables for each value.To declare an array, define the variable type with
        // square brackets:
        // Integer Array
        int[] numbers = { 1, 2, 3, 4, 5 };
        System.out.println("Integer Array:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number at index " + i + ": " + numbers[i]);
        }

        // Character Array
        char[] characters = { 'a', 'b', 'c', 'd', 'e' };
        System.out.println("\nCharacter Array:");
        for (int i = 0; i < characters.length; i++) {
            System.out.println("Character at index " + i + ": " + characters[i]);
        }

        // Float Array
        float[] floats = { 1.1f, 2.2f, 3.3f, 4.4f, 5.5f };
        System.out.println("\nFloat Array:");
        for (int i = 0; i < floats.length; i++) {
            System.out.println("Float at index " + i + ": " + floats[i]);
        }

        // String Array
        String[] names = { "ram", "suresh", "raghu", "ashish", "gaurav" };
        System.out.println("\nString Array:");
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name at index " + i + ": " + names[i]);
        }
    }
}
