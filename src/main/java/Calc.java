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
    long calcResult = 0;
    for (int i = 0; i < timesCount; i++) {
      if (calcType.equals("1")) {
        calcResult += baseNum;
      } else {
        calcResult -= baseNum;
      }
    }
    this.outStr = "結果は" + calcResult + "です";
  }
}


