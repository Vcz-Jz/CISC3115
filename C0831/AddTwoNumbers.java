public class AddTwoNumbers {
    public static void main(String[] args) {
        /*
        for (int i=0; i<args.length; i++) {
            System.out.println("args[" + i + "] = " + args[i]);
        }
        */
        int op1 = Integer.parseInt(args[0]);
        int op2 = Integer.parseInt(args[1]);
        int sum = addTwoNumbers(op1, op2);
        System.out.println(args[0] + " + " + args[1] + " = " + sum);
    }
    
    public static int addTwoNumbers(int n1, int n2) {
        int sum = n1 + n2;
        return sum;
    }
    
    public static int addTwoNumbers(String s1, String s2) {
        int n1 = Integer.parseInt(s1);
        int n2 = Integer.parseInt(s2);
        int sum = n1 + n2;
        return sum;
    }
}
