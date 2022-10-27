
class Util {
    public static String capitalize(String str) {
        String result;
        System.out.println("Before: " + str);
        if (str == null || str.isBlank()) {
            System.out.println("After: " + str);
            return str;
        }

        if (str.length() == 1) {
            result = str.toUpperCase();
            System.out.println("After: " + result);
            return result;
        }
        result = Character.toUpperCase(str.charAt(0)) + str.substring(1);
        System.out.println("After: " + result);
        return result;
    }
}