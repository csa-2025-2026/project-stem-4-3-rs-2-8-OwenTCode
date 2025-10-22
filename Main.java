import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    //Problem 1

    //Problem 2
    int count = 1;

    for (int num = 16; num < 73; count++)
    {
      num++;
      System.out.print(num);
      System.out.print(" ");
      if (count%10 == 0)
      {
        System.out.println("");
      }


    }
    System.out.println("");
    
    //Problem 3
    Scanner sc = new Scanner(System.in);
    int blah = sc.nextInt();

    while (blah <= 50)
    {
      System.out.print(blah + " ");
      blah++;
      if (blah < 0)
      {
        System.out.println("error");
        return blah;
      }
    }

  }
}
