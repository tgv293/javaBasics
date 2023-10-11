/** Returns a random ambiguous compliment. */
public class AmbiguousCompliment{

public static void main(String argr[]) {
    String result;   // The generated insult which will be returned
    int which = (int)(Math.random() * 4);  //  Should result in 0 to 3.

    result = switch (which) {
        case 0 -> "You look so much better than usual.";
        case 1 -> "Your work is up to its usual standards.";
        case 2 -> "You're quite competent for so little experience.";
        default -> "Oops -- something is wrong with this code.";
    };
    System.out.println(result);
}

}
