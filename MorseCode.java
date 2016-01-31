//Shaunak Pandit
//CSI 310
/** This is a program that takes in a string and converts it to morse code */
public class MorseCode
{
  /**The string that is going to be converted*/
  private String str;
  
  /**constuctor
    * @param the string the user wants converted*/
  public MorseCode(String s)
  {
    str = s;
  }
  /** Default Constructor*/
  public MorseCode()
  {
    str = "";
  }
  
  /**getMorseCode method returns the morse code
    * @param the letter sent to be converted to morse code
    * @return the morse code of the character*/
  private String getMorseCode(String s)
  {
    
    String code = "";
    
     if(s.equalsIgnoreCase(","))
      code = "--..--";
    
     if(s.equalsIgnoreCase("."))
      code = ".-.-.-";
    
     if(s.equalsIgnoreCase("?"))
      code = "..--..";
    
     if(s.equalsIgnoreCase("0"))
      code = "-----";
    
     if(s.equalsIgnoreCase("1"))
      code = ".----";
    
     if(s.equalsIgnoreCase("2"))
      code = "..---";
    
     if(s.equalsIgnoreCase("3"))
      code = "...--";
    
     if(s.equalsIgnoreCase("4"))
      code = "....-";
    
     if(s.equalsIgnoreCase("5"))
      code = ".....";
    
     if(s.equalsIgnoreCase("6"))
      code = "-....";
    
     if(s.equalsIgnoreCase("7"))
      code = "--...";
    
     if(s.equalsIgnoreCase("8"))
      code = "---..";
    
     if(s.equalsIgnoreCase("9"))
      code = "----.";
    
     if(s.equalsIgnoreCase("A"))
      code = ".-";
    
     if(s.equalsIgnoreCase("B"))
      code = "-...";
    
     if(s.equalsIgnoreCase("C"))
      code = "-.-.";
    
     if(s.equalsIgnoreCase("D"))
      code = "-..";
    
     if(s.equalsIgnoreCase("E"))
      code = ".";
    
     if(s.equalsIgnoreCase("F"))
      code = "..-.";
    
     if(s.equalsIgnoreCase("G"))
      code = "--.";
    
     if(s.equalsIgnoreCase("H"))
      code = "....";
    
     if(s.equalsIgnoreCase("I"))
      code = "..";
    
     if(s.equalsIgnoreCase("J"))
      code = ".---";
    
     if(s.equalsIgnoreCase("K"))
      code = "-.-";
    
     if(s.equalsIgnoreCase("L"))
      code = ".-..";
    
     if(s.equalsIgnoreCase("M"))
      code = "--";
    
     if(s.equalsIgnoreCase("N"))
      code = "-.";
    
     if(s.equalsIgnoreCase("O"))
      code = "---";
    
     if(s.equalsIgnoreCase("P"))
      code = ".--.";
    
     if(s.equalsIgnoreCase("Q"))
      code = "--.-";
    
     if(s.equalsIgnoreCase("R"))
      code = ".-.";
    
     if(s.equalsIgnoreCase("S"))
      code = "...";
    
     if(s.equalsIgnoreCase("T"))
      code = "-";
    
     if(s.equalsIgnoreCase("U"))
      code =  "..-";
    
     if(s.equalsIgnoreCase("V"))
      code = "...-";
    
     if(s.equalsIgnoreCase("W"))
      code = ".--";
    
     if(s.equalsIgnoreCase("X"))
      code = "-..-";
    
     if(s.equalsIgnoreCase("Y"))
      code = "-.--";
    
     if(s.equalsIgnoreCase("Z"))
      code = "--..";
     
     if(s.equalsIgnoreCase(" "))
       code = " ";
     return code;
  }
  
  /**convert method converts the string to morse code and
    * @return returns the concatenated string of the morse code*/
  public String convert()
  {
    
    String finalForm = ""; //this isn't even...
    String letter = "";
    String morseCode = "";
    
    for(int i = 0; i < str.length(); i++)
    {
      letter = str.substring(i,i+1);
      //System.out.println(letter);
      morseCode = getMorseCode(letter);
      //System.out.println(morseCode);
      finalForm = finalForm + morseCode + " ";
    }
    //System.out.println(finalForm);
    return finalForm;
  }
}
  