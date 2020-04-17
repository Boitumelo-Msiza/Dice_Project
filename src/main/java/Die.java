public class Die {

    private static Object String;
    private int Side;
    private final int MAX = 6;

        public int roll(){

            Side = (int)(Math.random() * MAX) + 1;
            return Side;
        }

        //  Face value mutator.
    public void set_Side (int value)
    {
        Side = value;
    }

    //  Face value accessor.

    public int getFaceValue()
    {
        return Side;
    }

    // Returns a string representation of this die.
    public String toString()
    {
        String result = Integer.toString(Side);
        return result;
    }

    public static void main (String[] args) {
            Die die1, die2, die3;
        int sum;

        die1 = new Die();
        die2 = new Die();

        die1.roll();
        die2.roll();
        System.out.println("Die One: " + die1 + ", Die Two: " + die2);
        int x = die1.roll();

        Integer[] probabilities = new Integer[] {1, 2, 3, 4, 5, 6};

            for(int i = 0; i < probabilities.length; i++) {
                if(probabilities[i] > 0){
                    System.out.println("negative probabilities not allowed");
                }
            }
            sum = 0;
            for( int num : probabilities) {
            sum = sum+num;
            if(sum > 1){
                System.out.println("probability sum must be greater than 0");
            }
        }

        if(probabilities==String){
            System.out.println("only integer values allowed");
        }
    }
}


