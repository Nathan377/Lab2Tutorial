public class Main {
    public static void main(String[] args)
    {
        Add numbers = new Add(3,4);
        Subtract moreNumbers = new Subtract(5,4);
        int result = numbers.doAddition();
        int result2 = moreNumbers.doSubtraction();
        System.out.println("Result 1: " + result);
	System.out.println("Result 2: " + result2);
    }
}
