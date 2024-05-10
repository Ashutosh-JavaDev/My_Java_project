public class characterSort {
    public static String input(String value) {
        char[] charArray = value.toCharArray();
        for (int i = 0; i < charArray.length - 1; i++)
            for (int j = 0; j < charArray.length - i - 1; j++) {
                if (charArray[j] < charArray[j + 1]) {
                    char temp = charArray[j];
                    charArray[j] = charArray[j + 1];
                    charArray[j + 1] = temp;
                }
            }
        return new String(charArray);
    }
    public static void main(String[] args) {
        String str="Ashutosh";
        String res=input(str);
        System.out.println(res);
    }
}
