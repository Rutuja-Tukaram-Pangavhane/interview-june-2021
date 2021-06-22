package exam;

public class CountCombinations 
{

  public int getNumberOfWays(final int total, final int k)
  {
    return fact(n) / (fact(r) *
                  fact(n - r));
    
  }
  static int fact(int n)
  {
    int res = 1;
    for (int i = 2; i <= n; i++)
        res = res * i;
    return res;
  }
}
