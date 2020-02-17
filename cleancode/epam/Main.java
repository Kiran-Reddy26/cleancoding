package epam.interest;
import java.io.*;

public class Main {
	public double principle,rate,time;
	public double simpleInterestdata,compoundInterestdata;
	
	void inputData()  throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Enter principle:");
		bw.flush();
		principle = Double.parseDouble(br.readLine());
		bw.write("Enter rate:");
		bw.flush();
		rate = Double.parseDouble(br.readLine());
		bw.write("Enter time:");
		bw.flush();
		time = Double.parseDouble(br.readLine());
	}
	
	void ProcessData() {
		SimpleInterest si = new SimpleInterest(principle,rate,time);
		CompoundInterest ci = new CompoundInterest(principle,rate,time);
		simpleInterestdata = si.returnInterest();
		compoundInterestdata = ci.returnInterest();
	}
	
	void OutputData() throws IOException{
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Simple Interest:" +  simpleInterestdata + "\n");
		bw.write("Compound Interest:" + compoundInterestdata + "\n");
		bw.flush();
	}
	
	public static void main(String args[]) throws IOException{
		Main mainRun = new Main();
		try{
			mainRun.inputData();
			mainRun.ProcessData();
			mainRun.OutputData();
		}
		catch(IOException e) {
			throw e;
		}
		
	}

}