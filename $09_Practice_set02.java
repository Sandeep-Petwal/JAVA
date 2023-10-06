public class $09_Practice_set02 {
    public static void main(String[] args) {
        //01 convert a string to uppercase
        String name = "uttrakhand is devbhoomi",name2 = "Mr. Robert";
        System.out.printf("\nOriginal : %s, Uppercase : %s",name,name.toUpperCase());

        //02 replace spaces with underscore
        System.out.printf("\n\nReplaced space with string : %s",name.replace(" ", "_"));

        //03 replcing a latter
        String ltr = "Dear <|name|>, thanks for using our  service.";
        String latter = ltr.replace("<|name|>",name2 );
        System.out.println("\n\n"+latter);

        System.out.printf("Double spaces detected at %d positon.",latter.indexOf("  "));

        // 04 latter
        System.out.println("\n\nDear harry,\n\tthis is nice,\n\t\"thanks for making this.\"");


    }
}
