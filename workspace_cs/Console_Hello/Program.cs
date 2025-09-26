class Program
{
    public static void main(String[] args)
    {
        int[] arr = { 1, 2, 3, 4, 5 };

        foreach(int i in arr)
        {
            Console.WriteLine(i + ",");
        }

        test();
    }

    void static void test()
    {
        Console.WriteLine("test");
    }
}