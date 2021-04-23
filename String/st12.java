package String;
class st12
{
    public static void main(String[] args)
    {
        String str = "Blue bottle is in Blue bag lying on Blue carpet";
        str += " ";
        String newStr = "";
        String word = "";
        String target = "Blue";
        String newWord = "Red";        
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                if (target.equals(word)) {
                    newStr = newStr + newWord + " ";
                }
                else 
                {
                    newStr = newStr + word + " ";
                }
                word = "";
            }
            else 
            {
                word += str.charAt(i);
            }            
        }       
        System.out.println(newStr);
    }
}