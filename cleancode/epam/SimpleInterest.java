package epam.interest;

public class SimpleInterest {
	public double interest;
	SimpleInterest(double principle, double rate, double time){
		interest = (principle*rate*time)/100;
	}
	double returnInterest() {
		return interest;
	}
}