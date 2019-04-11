import java.util.Scanner;

public class Lab1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String eventType;
		int partySize;
		String foodOption = "nothing";
		String prep = "nowhere";
		Scanner scnr = new Scanner(System.in);
		System.out.println("what type of event:");
		String event = scnr.nextLine();
		switch (event) {
		case "casual":
		case "casual ":
		case "Casual":
			eventType = "casual";
			break;
		case "semi-formal":
		case "Semi-formal":
		case "semi formal":
		case "Semi formal":
		case "semiformal":
			eventType = "semi-formal";
			break;
		case "Formal":
		case "formal":
			eventType = "formal";
			break;
		default:
			eventType = "unknown";
			System.out.println("event type unknown");
		}
		System.out.println("how many people:");
		int ppl = scnr.nextInt();
		scnr.close();
		if (ppl == 1) {
			partySize = 0;
		} else if (ppl < 13) {
			partySize = 1;
		} else {
			partySize = 2;
		}
		if (eventType == "casual") {
			foodOption = "Sandwiches";
		}
		if (eventType == "semi-formal") {
			foodOption = "fried chicken";
		}
		if (eventType == "formal") {
			foodOption = "chicken parmesan";
		}
		if ((partySize == 0) && (eventType == "casual")) {
			// foodOption = "chicken parmesan";
			prep = "in the microwave";
		} else if (partySize == 0) {

			prep = "in your kitchen";
		}
		if (partySize == 1) {
			// foodOption = "chicken parmesan";
			prep = "in your kitchen";
		}
		if (partySize == 2) {
			//
			prep = "by a caterer";
		}
		//
		String result = "for a " + eventType + " event with " + ppl + " people, I recommend: " + foodOption + " " + prep
				+ ".";
		System.out.println(result);
	}

}
