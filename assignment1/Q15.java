import sun.java2d.cmm.lcms.LCMS;

public class Q15 {
    public static int vowels(String input){
        int count = 0;
        String LowerCaseInput = input.toLowerCase();
        for(char C : LowerCaseInput.toCharArray()){
            if(C == 'a' || C =='e' || C == 'i' || C =='o' || C =='u'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(vowels("Hello World"));
        System.out.println(vowels("java programming"));
    }
}
