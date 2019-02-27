package pkg018_recursion_factorial;

/**
 *
 * @author compsci
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            
        //System.out.println("Enter a whole number to get the factorial:");
        int input = 8;
        System.out.println(factorCycle(input));
       
    }
    
    /**
     * External Factor Cycle
     * 
     * To be called regularly by outside methods; Starts the recursive factor system.
     * 
     * @param input
     * @return 
     */
    private static int factorCycle(int input) {
        if (input <= 1) {
            return input;
        } else if (input >= 2) {
            return factorCycle(input, input - 1);
        }
        return 0;
    }
    
    /**
     * Internal Factor cycle
     * 
     * To be called in special cases and by factorCycle(int) only.
     * 
     * @Overload
     * @param input
     * @param mult
     * @return 
     */
    private static int factorCycle(int input,int mult) {
        if (mult <= 1) {
            return input;
        } else if (mult >= 2) {
            input *= mult;
            mult += -1;
            return factorCycle(input, mult);
        }
        return 0;
    }
}
