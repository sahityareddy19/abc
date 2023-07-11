public class third {
    public static void main(String[] args) {
        third th=new third();
        th.computePayment(10000, 2, 2, 2);
    
    }
    public double computePayment(
                  double loanAmt,
                  double rate,
                  double futureValue,
                  int numPeriods) {
    double interest = rate / 100.0;
    double partial1 = Math.pow((1 + interest), 
                    - numPeriods);
    double denominator = (1 - partial1) / interest;
    double answer = (-loanAmt / denominator)
                    - ((futureValue * partial1) / denominator);
    
    System.out.println(answer);
    return answer;
}
    
}
