public class TaylorSeriesForSine {

	public static long factorial(int number)
	{
	long result=1;
	for(int i=1;i<=number;i++)
	{
		result *= i;
	}
	return result;
	}
	public static void main(String[] args) {
		double epsilon = 0.00000001,x = -1, result = 0,memberOfSeries=x;
		int n=1;
		do
		{
			result += memberOfSeries;
			memberOfSeries = (Math.pow(-1, n)*Math.pow(x,(2*n+1)))/(factorial(2*n+1));
			n++;
		}while(Math.abs(memberOfSeries)>epsilon);
		System.out.println("sin x = "+ result);
		System.out.println("Math.sin(x) = " + Math.sin(x));

	}

}
