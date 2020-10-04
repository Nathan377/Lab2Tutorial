public class Main {
    public static void main(String[] args)
    {
        Add numbers = new Add(3,4);
        Subtract moreNumbers = new Subtract(5,4);
	Multiply evenMoreNumbers = new Multiply (2, 2);
        int result = numbers.doAddition();
        int result2 = moreNumbers.doSubtraction();
	int result3 = evenMoreNumbers.doMultiplication();
        System.out.println("Result 1: " + result);
	System.out.println("Result 2: " + result2);
	System.out.println("Result 3: " + result3);
    }
}
