import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
<<<<<<< HEAD
    public static void main(String[] args) {
        System.out.println("This will be printed");
=======
  public static void main(String[] args) {

    System.out.println("Enter something here : ");

    try{
        BufferedReader bufferRead = new BufferedReader(new InputStreamReader(System.in));
        String s = bufferRead.readLine();

        System.out.println(s);
>>>>>>> branch1
    }
    catch(IOException e)
    {
        e.printStackTrace();
    }

  }
}
