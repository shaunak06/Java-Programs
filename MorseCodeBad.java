public class MorseCodeBad
{
  private String word;
  
  public MorseCode(String s)
  {
    word = s;
  }
  
  public MorseCode()
  {
    word = "";
  }
  
  private String getMorseCode(String s)
  {
    String morseCode = "";
    
    switch (s)
    {
      case "," :
      {
        morseCode = "--..--";
        break;
      }
      case "." :
      {
        morseCode = ".-.-.-";
        break;
      }
      case "?" :
      {
        morseCode = "..--..";
        break;
      }
      case "0" :
      {
        morseCode = "----";
        break;
      }
      case "1" :
      {
        morseCode = ".---";
        break;
      }
      case "2" :
      {
        morseCode = "..---";
        break;
      }
      case "3" :
      {
        morseCode = "...--";
        break;
      }
      case "4" :
      {
        morseCode = "....-";
        break;
      }case "5" :
      {
        morseCode = ".....";
        break;
      }case "6" :
      {
        morseCode = "-....";
        break;
      }case "7" :
      {
        morseCode = "--...";
        break;
      }case "8" :
      {
        morseCode = "---..";
        break;
      }case "9" :
      {
        morseCode = "----.";
        break;
      }case "A" :
      {
        morseCode = ".-";
        break;
      }case "B" :
      {
        morseCode = "-...";
        break;
      }case "C" :
      {
        morseCode = "-.-.";
        break;
      }case "D" :
      {
        morseCode = "-..";
        break;
      }case "E" :
      {
        morseCode = ".";
        break;
      }
      case "F" :
      {
        morseCode = "..-.";
        break;
      }
      case "G" :
      {
        morseCode = "--.";
        break;
      }
      case "H" :
      {
        morseCode = "....";
        break;
      }
      case "I" :
      {
        morseCode = "..";
        break;
      }
      case "J" :
      {
        morseCode = ".---";
        break;
      }
      case "K" :
      {
        morseCode = "-.-";
        break;
      }
      case "L" :
      {
        morseCode = ".-..";
        break;
      }
      case "M" :
      {
        morseCode = "--";
        break;
      }
      case "N" :
      {
        morseCode = "-.";
        break;
      }
      case "O" :
      {
        morseCode = "---";
        break;
      }
      case "P" :
      {
        morseCode = ".--.";
        break;
      }
      case "Q" :
      {
        morseCode = "--.-";
        break;
      }
      case "R" :
      {
        morseCode = ".-.";
        break;
      }
      case "S" :
      {
        morseCode = "...";
        break;
      }
      case "T" :
      {
        morseCode = "-";
        break;
      }
      case "U" :
      {
        morseCode = "..-";
        break;
      }
      case "V" :
      {
        morseCode = "...-";
        break;
      }
      case "W" :
      {
        morseCode = ".--";
        break;
      }
      case "X" :
      {
        morseCode = "-..-";
        break;
      }
      case "Y" :
      {
        morseCode = "-.--";
        break;
      }
      case "Z" :
      {
        morseCode = "--..";
        break;
      }
      default:
      {
        morseCode = " ";
      }
    }
    return morseCode;
  }
  
  public String Converter()
  {
    word.toUpperCase();
    String finalForm = ""; //this isn't even...
    
    for(int i = 0; i < word.length(); i++)
    {
      finalForm += getMorseCode(word.substring(i,(i+1))) + " ";
    }
    return finalForm;
  }
}
      