public class hw {
  public static void main (String[] args){
    //1
    int sum=0;
    for (int x=1; x<=50;x++){
      sum += x;
    }
    System.out.println(sum);
    //2
    for (int y=0; y<=100;){
      if ((y+1)%5==0){
        System.out.println(y);
      }
      y += 2;
    }
    //3
    int score=67;
    if (score>=1 && score<=60){
      System.out.println("F");
    }
    else if (score>=61 && score<=70){
      System.out.println("D");
    }
    else if (score>=71 && score<=80){
      System.out.println("C");
    }
    else if (score>=81 && score<=90){
      System.out.println("B");
    }
    else {
      System.out.println("A");
    }
    //4
    for (int z=1; z<=100;){
      if ((z%3==0)^(z%12==0)){
        System.out.println(z);
      }
      else if ((z%4==0)^(z%12==0)){
        System.out.println(z);
      }
      z++;
    }
  }
}
