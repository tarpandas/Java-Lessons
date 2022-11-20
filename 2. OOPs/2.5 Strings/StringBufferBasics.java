public class StringBufferBasics {
    public static void main(String[] args) {

        // StringBuffer()
        StringBuffer sb1 = new StringBuffer();
        sb1.append("StringBuffer example 1");
        System.out.println(sb1);

        // StringBuffer(String strExample)
        String strS = "StringBuffer example 2";
        StringBuffer sb2 = new StringBuffer(strS);
        System.out.println(sb2);

        // StringBuffer(int capacity)
        StringBuffer sb3 = new StringBuffer(45);
        System.out.println(sb3.capacity());

        // StringBuffer(String charSeq)
        StringBuffer sb4 = new StringBuffer("StringBuffer example 4");
        System.out.println(sb4);

        // StringBuffer methods

        StringBuffer sb = new StringBuffer();

        sb.append("Hello");
        System.out.println(sb);

        sb.insert(1,"Vishal");
        System.out.println(sb);

        sb.replace(1, 3, "Vishal");
        System.out.println(sb);

        sb.delete(1,11);
        System.out.println(sb);

        System.out.println(sb.capacity());

        // reverse(), charAt(), length(), substring(), indexOf(), trimToSize(), etc.
        // More methods in:
        // https://beginnersbook.com/2022/10/java-stringbuffer-class/
        
    }
}
