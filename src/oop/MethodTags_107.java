package oop;

/**
 * This is a good class
 */

public class MethodTags_107 {
    /**
     *
     * @param args These are arguments supplied to the command line
     */
    public static void main(String[] args) {
        System.out.println("I am main method");
    }

    /**
     *Hello this is a method
     * @param i This is the forst number to add
     * @param j This is the second number to add
     * @returnSum of two number as integer
     * @throws Exception if i is 0
     * @deprecated This method is deprecated please use + operator
     */
    public int add(int i, int j)throws Exception{
        if(i==0){
            throw new Exception();
        }
        int c;
        c=i+j;
        return c;
    }
}
