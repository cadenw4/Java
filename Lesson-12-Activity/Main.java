class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
   System.out.inputln("Enter Card #");
   int cardnumb = Input.readInt();

   String Cardtype(cardnumb){
    if (cardnumb.subscript(0,1).equals("4"))
    return "Visa";
    else if (cardnumb.subscript(0,2).equals("34") || cardnumb.subscript(0,2).equals("37"))
    return "American Express";
    else if (cardnumb.subscript(0,2).equals("51") || cardnumb.subscript(0,2).equals("55"))
    return "Mastercard";
    else if (cardnumb.subscript(0,5).equals("6011") || cardnumb.subscript(0,2).equals("65"))
    return "Discovery";
    else if (cardnumb.subscript(0,2).equals("36"))
    return "Diner Express";
   }

    System.out.inputln("Enter word");  
String word = Input.ReadString()
   String pigLatin(word){
    

   }
  }

  
  
}