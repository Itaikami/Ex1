package assignments.ex1;
/**
 * This class represents a simple solution for Ex1.
 * As defined here: https://docs.google.com/document/d/1AJ9wtnL1qdEs4DAKqBlO1bXCM6r6GJ_J/r/edit/edit
 * In this assignment, we will design a number formatting converter and calculator.
 * In general, we will use Strings as numbers over basis of binary till Hexa.
 * [2-16], 10-16 are represented by A,B,..G.
 * The general representation of the numbers is as a String with the following format:
 * <number><b><base> e.g., “135bA” (i.e., “135”, as 10 is the default base), “100111b2”, “12345b6”,”012b5”, “123bG”, “EFbG”.
 * The following are NOT in the format (not a valid number):
 * “b2”, “0b1”, “123b”, “1234b11”, “3b3”, “-3b5”, “3 b4”, “GbG”, "", null,
 * You should implement the following static functions:
 */
public class Ex1 {
    /**Convert the given char into the relevant number
     * if the char is a number return it as is
     * if the char is invalid return -1
     * @param dig represents a digit in the relevant number
     * num represents the number we return in the end
       @return
       */
    public static int char2Int(char dig)
    {
        int num=-1;
        switch(dig)
        {
            case 'A':
            {    num=10;
            break;}
            case 'B':
            {   num=11;
            break;}
            case 'C':
            {    num=12;
            break;}
            case 'D':
            {    num=13;
            break;}
            case 'E':
            {    num=14;
            break;}
            case 'F':
            {   num=15;
            break;}
            case 'G':
            {   num=16;
            break;}

        }
        if(dig>='0'&&dig<='9')
            num=Character.getNumericValue(dig);
        return num;
    }
        /**
         * Convert the given number (num) to a decimal representation (as int).
         * It the given number is not in a valid format returns -1.
         * @param num a String representing a number in basis [2,16]
         * @return
         */
        public static int number2Int(String num) {
            int ans = -1;
            // add your code here

            if(!isNumber(num))
            {return ans;}
            ans=0;
              if(!(num.indexOf('b')>=0))
              {
                ans=Integer.parseInt(num);
              }
              else
              {
                  String n=num.split("b")[0];
                  char base=num.split("b")[1].charAt(0);
                  int size = n.length()-1;
                  int basis,dig;
                  basis=char2Int(base);
                  for (int i = 0; i <= size; i++) {
                      char cur = n.charAt(i);
                      dig=char2Int(cur);
                      ans+=(int)(dig*Math.pow(basis,size-i));
//                      if(base>='A'&&base<='G')
//                      {
//                          if(cur>='A'&&cur<='F')
//                              ans+= (int) ((10+(cur-'A'))*(Math.pow((10+base-'A'),size-i)));
//                          else
//                          {
//                              ans+= (int)((cur-'0')*(Math.pow((10+base-'A'),size-i)));
//                          }
//                      }
//                      else
//                      {
//                          if(cur>='A'&&cur<='F')
//                          {
//                              ans+= (int) ((10+(cur-'A'))*(Math.pow((base-'0'),size-i)));
//                          }
//                          else
//                          {
//                              ans+= (int)((cur-'0')*(Math.pow((base-'0'),size-i)));
//                          }
//                      }
                  }
              }

            ////////////////////
            return ans;
        }
        /**
         * This static function checks if the given String (g) is in a valid "number" format.
         * @param a a String representing a number
         * @return true iff the given String is in a number format
         */
        public static boolean isNumber(String a) {
            boolean ans = true;
            // add your code here
            // num represents the number itself and 'base' the base the number is in ,if we dont have a base in our input
            // num is the whole string
            String num = a,base = "";
            char basis = 0;

            if(a.indexOf('b')>0&&a.lastIndexOf('b')==a.indexOf('b')) {
                num=a.split("b")[0];
                base=a.split("b")[1];
            //we set our 'basis' to be the first character of the base because its supposed to be 1 char long
                basis=base.charAt(0);
            }
            //checks the validity of the base
            if(base.length()>1||(!(basis>='2'&&basis<='9')&&!(basis>='A'&&basis<='G')&&basis!=0))
                ans = false;
            for (int i = 0; i < num.length()&&ans;i++) {
                char cur=num.charAt(i);
                //checks if both the current digit of the number and the base are digits and if the "cur" is bigger than
                // the base then its invalid
                if(cur>='0'&&cur<='9')
                {
                    if(basis>='2'&&basis<='9'&&cur>=basis) {
                        ans = false;
                    }

                }
                // if they are not both digits then they are both letters(we checked the validity of basis earlier)
                // we compare them again
                else if (cur>='A'&&cur<'G')
                {
                    if(cur>=basis)
                    {
                        ans=false;
                    }
                }
                // if the 'cur' isn't a digit or a letter between A and G then it's not a valid string
                else
                {
                    ans= false;
                }



                }



            ////////////////////
            return ans;
        }

        /**
         * Calculate the number representation (in basis base)
         * of the given natural number (represented as an integer).
         * If num<0 or base is not in [2,16] the function should return "" (the empty String).
         * @param num the natural number (include 0).
         * @param base the basis [2,16]
         * @return a String representing a number (in base) equals to num, or an empty String (in case of wrong input).
         */
        public static String int2Number(int num, int base) {
            String ans = "";
            // add your code here

            ////////////////////
            return ans;
        }

        /**
         * Checks if the two numbers have the same value.
         * @param n1 first number
         * @param n2 second number
         * @return true iff the two numbers have the same values.
         */
        public static boolean equals(String n1, String n2) {
            boolean ans = true;
            // add your code here

            ////////////////////
            return ans;
        }

        /**
         * This static function search for the array index with the largest number (in value).
         * In case there are more than one maximum - returns the first index.
         * Note: you can assume that the array is not null and is not empty, yet it may contain null or none-valid numbers (with value -1).
         * @param arr an array of numbers
         * @return the index in the array in with the largest number (in value).
         *
         */
        public static int maxIndex(String[] arr) {
            int ans = 0;
            // add your code here

            ////////////////////
            return ans;
        }
}
