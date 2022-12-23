public class CaseCheck {

    //Check if a string has all uppercase letters

    public static boolean allUpper(String s){
        return s.chars().allMatch(Character::isUpperCase);
    }

    //Check if a string has all lowercase letters
    public static boolean allLower(String s){
        return s.chars().allMatch(Character::isLowerCase);
    }
    public static void main(String[] args) {
        System.out.println(allLower("jason"));
        System.out.println(allLower("JADA"));
        System.out.println(allLower("JACKSOn"));
        System.out.println(allLower("JAZZ"));

    }
}
