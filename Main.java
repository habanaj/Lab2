class Main {
  public static void main(String[] args) {
    System.out.println("M&M Color Counts");

    int totalMnMs;
    totalMnMs = 55 * 11;
     
    
    double blueMnMs;
    blueMnMs = totalMnMs * .24;
    System.out.println("Blue M&Ms: " + blueMnMs);

    double brownMnMs;
    brownMnMs = totalMnMs * .13;
    System.out.println("Brown M&Ms: "+brownMnMs);
    
    double greenMnMs;
    greenMnMs = totalMnMs * .16;
    System.out.println("Green M&Ms: "+greenMnMs);

    double orangeMnMs;
    orangeMnMs = totalMnMs * .2;
    System.out.println("Orange M&Ms: "+orangeMnMs);

    double redMnMs;
    redMnMs = totalMnMs * .13;
    System.out.println("Red M&Ms: "+redMnMs);

    double yellowMnMs;
    yellowMnMs = totalMnMs * .14;
    System.out.println("Yellow M&Ms: "+yellowMnMs);

    double sumColors;
    sumColors = blueMnMs + brownMnMs + greenMnMs + orangeMnMs + redMnMs + yellowMnMs;
    System.out.println("Total M&Ms: " + sumColors);

    if(blueMnMs < brownMnMs && redMnMs > orangeMnMs){
    System.out.println("Blue under Brown and Red over Orange");
    }


    if(brownMnMs >= greenMnMs){
    System.out.println("Brown is greater than or equal to Green");
    }


   if(sumColors == totalMnMs){
   System.out.println("Numbers match");
   }
      
    

    

    

  }
}