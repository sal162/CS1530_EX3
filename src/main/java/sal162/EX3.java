package sal162;

public class EX3 {
	
    public static long lazy(long c)
	{
    	return (c*c + c + 2)/2;
    }
    public static long tri(long c)
	{
    	return c*(c + 1)/2;
    }
    
    public static void main(String[] args)
	{
    	if (args.length != 2)
    	{
    		System.out.println("Incorrect number of inputs");
    		System.exit(3);
    	}
		
    	int c = 0;
    	try{
			c = Integer.parseInt(args[1]);
	    } 
		catch (NumberFormatException ex) {
			System.out.println("Enter an integer for the second arg");
			System.exit(2);
	    }

	    if (args[0].equals("lazy"))
	    {
	    	System.out.println("lazy(" + c + ") = " + lazy(c));
	    }
	    else if (args[0].equals("tri"))
	    {
	    	System.out.println("tri(" + c + ") = " + tri(c));
	    }
	    else
	    {
	    	System.out.println("First arg should be 'lazy' or 'tri'");	
	    	System.exit(1);
	    }
	}
}