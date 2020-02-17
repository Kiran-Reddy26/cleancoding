
import java.io.*;

public class MainClass {
	int choice;
	double houseArea;
	double constructionCost;
	boolean fullyAutomated=false;
	
	public void inputData() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Select the Material Standard:\n"
				+ "1.Standard Material\n"
				+ "2.Above Standard Material\n"
				+ "3.High Standard Material\n");
		bw.flush();
		choice = Integer.parseInt(br.readLine());
		if(choice==3) {
			bw.write("Do you want your home to be funny Automated?(y/n)\n");
			bw.flush();
			String ans = br.readLine();
			if(ans.equals("y") || ans.equals("Y")) {
				fullyAutomated = true;
			}
		}
		bw.write("Enter total house Area:\n");
		bw.flush();
		houseArea = Double.parseDouble(br.readLine());
	}
	
	public void processData() {
		switch(choice) {
		case 1: constructionCost = houseArea * 1200;
				break;
		case 2: constructionCost = houseArea * 1500;
				break;
		}
		if(choice==3 && !fullyAutomated) {
			constructionCost = houseArea * 1800;
		}
		else if(choice==3 && fullyAutomated) {
			constructionCost = houseArea * 2500;
		}
	}
	
	public void outputData() throws IOException {
		BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Total cost of construction of house is:" + constructionCost);
		bw.flush();
	}
	
	public static void main(String args[]) throws IOException{
		MainClass mainObject = new MainClass();
		mainObject.inputData();
		mainObject.processData();
		mainObject.outputData();
	}

	

}