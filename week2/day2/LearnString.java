package week2.day2;

public class LearnString {

	public static void main(String[] args) 
	{
		// String Literal
        String strl="TestLeaf";
        String str3="TestLeaf";
        
        //Instantiation
        String str2=new String("TestLeaf");
        String str4=new String("TestLeaf");
	
	// .equals method is used to compare the values of 2 strings
    //== compare the reference address of 2 strings
        // return true or false
      //  System.out.println(str1.equals(str3));
        System.out.println(str2==str3);
        
        // To get the length of the string
        String batchname="SELENIUM";
        int lenghtOfString = batchname.length();
        System.out.println("length"+" "+ lenghtOfString);
        
        //.contains compare the partial values
        //equalIgnorecase
        //toUpperCase
        String lowerCase = batchname.toLowerCase();
        System.out.println(lowerCase);
        
        //toCharArray - Convert a string into a Character Array
        //int Array -> int num[]={1,2,3};
        //char Array -> char letter[]={'R','A','M'};
        
        String batch="Selenium"; //convert the string into char {'s','e'...}
        char[] letter = batch.toCharArray();
        System.out.println(letter[3]);
        
        //charAt - Retrieve the particular character based on the index
        char c = batch.charAt(2);
        System.out.println(c);
        
        //subString -> Convert a String into smaller String
        //ex : selenium convert into seli
                
        String month="July2025" ;
        //July2025 to ly2025
        String convertion = month.substring(2);
        System.out.println(convertion); //crop the string from begin index hence ly2025
        String substring = month.substring(2, 4); // end index will be ignored only ly. 1st it work of end index and work for begin index
        System.out.println(substring); 
        
        //split method
        //convert 1 string into multiple string
        String currentBatch ="Sel jul 2025";										//0   1    2
        String[] split = currentBatch.split("u"); // check for space and the string splited like {"sel","ju;,"2025"}
        System.out.println(split[0]); 
        
        //Parseint
        String ruppees="100";
        int int1 = Integer.parseInt(ruppees);
        System.out.println(int1+20);
        
        //replaceall
        String rs="100ruppees";
        String replace = rs.replace("ruppees"," ");
        System.out.println(replace);
        
        
	}
	

}
