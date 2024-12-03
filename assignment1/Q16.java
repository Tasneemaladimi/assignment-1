public class Q16 {
    public static String punctuation(String S){
        StringBuilder result = new StringBuilder();
        for(char c : S.toCharArray()){
            if(Character.isLetter(c)|| Character.isWhitespace(c)){
                result.append(c);
            }
        }
        return result.toString();
    }

    public static void main(String[] args) {
        String input = "Let's try Mike!";
        String output = punctuation(input);
        System.out.println(output);
    }
}
