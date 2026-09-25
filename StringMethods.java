public class StringMethods {
    public static void main(String[] args) {
        
        String name = "Bro";

        // boolean result = name.equals("Bro"); // ture

        // boolean result = name.equalsIgnoreCase("bro"); // true

        // int result = name.length(); // 3

        // char result = name.charAt(0); // B

        // int result = name.indexOf("B"); // 0

        // boolean result = name.isEmpty(); // false
        // even if there is "space" inside the double quotes " ", this will return false

        // boolean result = name.isBlank(); // false
        // but .isBlank() returns true even if there is space like " ".

        // String result = name.toLowerCase(); // bro

        // String result = name.toUpperCase(); // BRO

        // String result = name.trim(); // Bro

        String result = name.replace('o', 'm'); // Brm 

        System.out.println(result);
    }
}
