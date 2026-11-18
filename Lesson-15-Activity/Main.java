class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){
    String space(int N){
      for (int x = 0; x >N ; x++){
      build += " ";
    }
    return build + "done";
    }

    double harmonic (int N){
      for (x = 1; x<=N; x++){
      double result += 1./x;}
      return result;
    }
    
        double sine (int N){
      for (x = 1; x<=N; x+2){
      double result += 1./x;}
      return result;
    }
    
  }


  
}