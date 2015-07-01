package Math;

/**
 * Created by Rucha on 6/28/15.
 * convert a string to an integer
 * 1.String can be empty -done
 * 2.String can contain valid numbers and negative numbers -done
 * 3.String can contain whitespace before or after the number-done
 * 4.String can contain letters-done
 * 5.String can contain numbers first and then letters in that case ignore the letters
 * 6.String can contain numbers out of range i.1 Int_MAX_Value and MIN_VALUE
 * ASCII 0: 48 and 9 : 57
 */
public class atoi {

    public static void main(String[] args){
        System.out.println("Answer is::" + atoi("111"));
    }

    public static int atoi(String str) {
        int number=0;
       if(str.isEmpty()|| str==null)
           return 0;  //empty string

        boolean negative = false;
        str.trim(); //remove whitespaces
        int index=0;
        char[] arr = str.toCharArray();
       while(index < arr.length){

            if(arr[0] == '-') {  //negative number
                negative = true;
                index++;

            }else if(arr[0]=='+'){
                negative=false;
                index++;

            }


            //check for any wildcharacters
           if(arr[index] >= 48 && arr[index]<=57 && number<=Integer.MAX_VALUE && number>=Integer.MIN_VALUE) {
//                System.out.println("Count::" + index);
//               System.out.print("Before:" +number);
                number = (arr[index]-48) + (number*10); //we have chars and we want int
              //  System.out.print("After:" + number);

            }
           index++;
        }

       if(negative) return number*-1;
       else return  number;

    }
}
