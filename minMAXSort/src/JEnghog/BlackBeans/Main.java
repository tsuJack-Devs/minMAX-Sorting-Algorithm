package JEnghog.BlackBeans;
import JEnghog.BlackBeans.Utility.minMAX;

public class Main {
   public static void main(String[] args) {
      if (args.length > 0 && args[0].equals("--minMAXSortVersion")) {
         System.out.printf("%s", minMAX.getVersion());
      }
   }
}
