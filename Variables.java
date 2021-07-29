class Variables {
    
    public static void main(String[] args) {
        
        if(args.length == 2)
        {
            int firstNumber = Integer.parseInt(args[0]); // type conversion / casting / parse
            int secondNumber = Integer.parseInt(args[1]);

            int result = firstNumber + secondNumber;
            System.out.println("Sum is: "+result); // + : Concatenation/Joining
        }
        else {
            System.out.println("Invalid Input");
        }
       

        //local variables
        /*
        int firstNumber = 100;
        int secondNumber = 400;*/

    }   
}
