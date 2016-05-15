class Test
{
    public static void main(String[] args)
    {
        testSum();
    }

    private static void testSum()
    {
        int a = 5;
        int b = 6;
        int expected = 11;
        BasicMath bm = new BasicMath();
        int result = bm.sum(a, b);
        if (result == expected)
        {
            System.out.println("Sum: OK");
        }
        else
        {
            System.out.println("Sum: Failed, expected = " + expected + ", result = " + result);
        }
    }
    
     private static void testsubtract()
    {
        int a = 7;
        int b = 6;
        int expected = 1;
        BasicMath bm = new BasicMath();
        int result = bm. subtract(a, b);
        if (result == expected)
        {
            System.out.println(" subtract: OK");
        }
        else
        {
            System.out.println(" subtract: Failed, expected = " + expected + ", result = " + result);
        }
    }
    
     private static void testmultiply()
    {
        int a = 5;
        int b = 6;
        int expected =30;
        BasicMath bm = new BasicMath();
        int result = bm. multiply(a, b);
        if (result == expected)
        {
            System.out.println(" multiply: OK");
        }
        else
        {
            System.out.println(" multiply: Failed, expected = " + expected + ", result = " + result);
        }
    }
    
     private static void testdivide()
    {
        int a = 30;
        int b = 6;
        int expected =5;
        BasicMath bm = new BasicMath();
        int result = bm. divide(a, b);
        if (result == expected)
        {
            System.out.println(" divide: OK");
        }
        else
        {
            System.out.println(" divide: Failed, expected = " + expected + ", result = " + result);
        }
    }
}
