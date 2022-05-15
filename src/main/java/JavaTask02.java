import java.util.Scanner;

public class JavaTask02 {
  public static void main(String[] args) {

    final int baseNum = 2; //足し引きされる数値
    final int timesCount = 5; //計算を繰り返す回数

    System.out.println(baseNum + "を" + timesCount + "回足すまたは引いた計算結果を表示します");
    System.out.println("足し算は「1」を、引き算は「2」を入力して下さい");

    Scanner scanner = new Scanner(System.in);
    String rtn = scanner.next();

    if (!(rtn.equals("1") || rtn.equals("2"))) {
      System.out.println("１もしくは２が入力されなかったため終了します。");
      System.exit(0);
    }

    Calc calc = new Calc(timesCount, baseNum);
    calc.setCalcType(rtn);
    calc.runCalc();

    System.out.println("結果は" + calc.getOutStr() + "です"); //計算結果出力

  }
}
