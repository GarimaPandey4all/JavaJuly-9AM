class CommandLineInput {
    
    public static void main(String arr[]) {
        
        int sum = 0;
        /*
        //Traditional Loop
        for(int i = 0; i < arr.length; i++)
        {
            sum += Integer.parseInt(arr[i]);
        }*/

        // Enhanced Loop or For Each Loop
        for(String i : arr)
        {
            sum += Integer.parseInt(i);
        }

        System.out.println("sum is: "+sum);

    }
}
