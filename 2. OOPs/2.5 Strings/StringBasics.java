class StringBasics{
    public static void main(String[] args) {
        String strName = "Tarpan";
        String strFirstName = "Tarpan";

        System.out.println(strName == strFirstName);
        System.out.println(strName.equals(strFirstName));

        // Both the above string refers to the same object/String "Tarpan"

        strName = new String("Vishal");
        strFirstName = new String("Vishal");

        System.out.println(strName == strFirstName);
        System.out.println(strName.equals(strFirstName));

        // Now, these two are different objects containing strings of their own.

        // Converting character array into a string

        char [] charArray = {'h','e','l','l','o'};
        String salute = new String(charArray);
        System.out.println(salute);

        // String concatenate

        String strFName = "Vishal";
        String StrLName = "Sharma";
        System.out.println(strFName.concat(" ").concat(StrLName));

        // Methods

        System.out.println("This is Sparta".charAt(5)); // charAt() method returns the character at given index
        System.out.println("This is Sparta".length()); // Length of the string
        System.out.println("This is Sparta".substring(1,13)); // begIndex is inclusive, but endIndex is exclusive
        System.out.println("This is Sparta".replace('s','t')); // Replace character 1 with character 2
        System.out.println("This is Sparta".indexOf('s')); // Find the index of the first character in the string
        System.out.println("This is sparta".toUpperCase());
        System.out.println("This is Sparta".toLowerCase());
        System.out.println("This is Sparta".contains("is"));
        System.out.println("            This is Sparta     ".trim()); // Removes spaces before and after string
        char [] backwardsConvert = "This is Sparta".toCharArray();
        System.out.println(backwardsConvert.getClass().getSimpleName()); // getClass().getSimpleName() returns the datatype

        // More methods in:
        // https://beginnersbook.com/2013/12/java-strings/

    }
}