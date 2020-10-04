public class Main {
    public static void main(String[] args)
    {
        Add numbers = new Add(3,4);
        Subtract moreNumbers = new Subtract(5,4);
        int result = numbers.doAddition();
        int result2 = moreNumbers.doSubtraction();
        System.out.println(result + " " + result2 );
    }
}
