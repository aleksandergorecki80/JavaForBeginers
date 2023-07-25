public class StringMethods {
    public static void main(String[] args) {
        String name = "kki";
        String name2 = "";

        boolean result = name.equals("kki");
        boolean result2 = name2.isEmpty();
  
        char charAt = name.charAt(0);

        System.out.println(result);
        System.out.println(charAt);
        System.out.println(result2);
    }
}
