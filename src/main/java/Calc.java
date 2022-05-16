public class Calc {

  private String calcType;

  private int baseNum;
  private int timesCount;

  public Calc(int baseNum, int timesCount) {
    this.baseNum = baseNum;
    this.timesCount = timesCount;
  }

  public void setCalcType(String calcType) {
    this.calcType = calcType;
  }

  public int runCalc() throws Exception {
    int calcResult = 0; //計算結果格納

    for (int i = 0; i < timesCount; i++) {
      if (calcType.equals("1")) {
        calcResult += baseNum; // 足し算の場合
      } else if (calcType.equals("2")) {
        calcResult -= baseNum; //引き算の場合
      } else {
        throw new Exception("１または２以外が入力されました。終了します。");
      }
    }

    return calcResult;
  }
}


