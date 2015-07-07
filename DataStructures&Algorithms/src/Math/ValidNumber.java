package Math;

/**
 * Created by Rucha on 7/6/15.
 * Validate if a given string is numeric.

 Some examples:
 "0" => true
 " 0.1 " => true
 "abc" => false
 "1 a" => false
 "2e10" => true

 */
public class ValidNumber {

    public boolean isNumber(String s) {

        s = s.trim();
        if(s==null ||s.length()==0) return false;

        boolean dotFlag = false ,EFlag = false;
        for(int i=0;i<s.length();i++){
            switch(s.charAt(i)){
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    break;
                case '+':
                case '-':if((i>0 && (s.charAt(i-1)!='e' && s.charAt(i-1)!='E'))
                        || (i==s.length()-1 || !(s.charAt(i+1)>='0'&&s.charAt(i+1)<='9'||s.charAt(i+1)=='.')))
                    return false;
                    break;
                case '.':
                    if(dotFlag || EFlag
                            || ((i==0||!(s.charAt(i-1)>='0'&&s.charAt(i-1)<='9'))
                            && (i==s.length()-1||!(s.charAt(i+1)>='0'&&s.charAt(i+1)<='9'))))
                        return false;
                    dotFlag= true;
                    break;
                case 'e':
                case 'E':
                    if(i == s.length()-1 || i == 0 || EFlag){
                        return false;
                    }

                    EFlag = true;
                    break;
                default:
                    return false;


            }
        }

        return true;
    }

}
