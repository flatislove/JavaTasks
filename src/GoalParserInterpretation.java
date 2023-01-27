/**
 * You own a Goal Parser that can interpret a string command. The command consists of an alphabet of "G", "()" and/or
 * "(al)" in some order. The Goal Parser will interpret "G" as the string "G", "()" as the string "o", and "(al)" as
 * the string "al". The interpreted strings are then concatenated in the original order.
 * Given the string command, return the Goal Parser's interpretation of command.
 */
public class GoalParserInterpretation {
    public static void main(String[] args) {
        String command = "G()()()()(al)";
        GoalParserInterpretation goalParserInterpretation = new GoalParserInterpretation();
        System.out.println(goalParserInterpretation.interpret(command));
    }

    public String interpret(String command) {
        int lngt = command.length();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < lngt; i++) {
            if (i < lngt - 1 && command.charAt(i)=='(' && command.charAt(i + 1)==')') {
                sb.append("o");
                i++;
            } else if (command.charAt(i)!='(' && command.charAt(i)!=')') {
                sb.append(command.charAt(i));
            }
        }
        return sb.toString();
    }
}
