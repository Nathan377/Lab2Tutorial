public class Main {
    public static void main(String[] args)
    {
        Add numbers = new Add(3,4);
        Subtract moreNumbers = new Subtract(5,4);
        int result = numbers.doAddition();
        int result2 = moreNumbers.doSubtraction();
        System.out.println(result + " " + result2 );
        
        Multiply evenMoreNumbers = new Multiply(6, 5);
        int result3 = evenMoreNumbers.doMultiplication();
        System.out.println(result3);
        
    }
}
