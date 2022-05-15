public class Calc {
  private String outStr;
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

  public String getOutStr() {
    return outStr;
  }

  public void runCalc() {
    long calcResult = 0; //計算結果格納
    for (int i = 0; i < timesCount; i++) {
      if (calcType.equals("1")) {
        calcResult += baseNum; // 足し算の場合
      } else {
        calcResult -= baseNum; //引き算の場合
      }
    }
    this.outStr = String.valueOf(calcResult);
  }
}


