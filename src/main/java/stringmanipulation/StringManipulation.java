package stringmanipulation;

public class StringManipulation {

    public String everyEvenCharacter(String s) {
        char[] characters = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < characters.length; i = i + 2) {
            sb.append(characters[i]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        StringManipulation stringManipulation = new StringManipulation();

        System.out.println(stringManipulation.everyEvenCharacter("This is a String")); //Ti saSrn
    }
}
