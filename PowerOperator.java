public  class PowerOperator
{
  public PowerOperator()
  {
  }
  
  public double power(double num, int pow)
  {
    if(pow < 1)
    {
      return 1;
    }
    else
    {
      return (num * power(num, pow - 1));
    }
  }
}
      