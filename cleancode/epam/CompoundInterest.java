package epam.interest;
import java.lang.Math;

public class CompoundInterest {
	public double interest;
	CompoundInterest(double principle, double rate, double time){
		interest = principle*Math.pow((1 + (rate/100)), time);
	}
	double returnInterest() {
		return interest;
	}

}