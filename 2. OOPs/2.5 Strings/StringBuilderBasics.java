// String builder is not synchronized while String Buffer is. It is not thread safe.
// Since multiple threads can use a StringBuilder simultaneously, is faster than StringBuffer

public class StringBuilderBasics {
    public static void main(String[] args) {

        // StringBuilder()
        StringBuilder sb1 = new StringBuilder();
        sb1.append("StringBuilder example 1");
        System.out.println(sb1);

        // StringBuilder(String strExample)
        String strS = "StringBuilder example 2";
        StringBuilder sb2 = new StringBuilder(strS);
        System.out.println(sb2);

        // StringBuilder(int capacity)
        StringBuilder sb3 = new StringBuilder(45);
        System.out.println(sb3.capacity());

        // StringBuilder(String charSeq)
        StringBuilder sb4 = new StringBuilder("StringBuilder example 4");
        System.out.println(sb4);

        // StringBuilder methods

        StringBuilder sb = new StringBuilder();

        sb.append("Hello");
        System.out.println(sb);

        sb.insert(1,"Vishal");
        System.out.println(sb);

        sb.replace(1, 3, "Sharma");
        System.out.println(sb);

        sb.delete(1,11);
        System.out.println(sb);

        System.out.println(sb.capacity());

        System.out.println(sb.length());

        System.out.println(sb.charAt(3));

        System.out.println(sb.substring(2,4));

        System.out.println(sb.indexOf("el"));


        // reverse(), charAt(), trimToSize(), etc.
        // More methods in:
        // https://beginnersbook.com/2022/10/java-stringbuffer-class/
        
    }
}
