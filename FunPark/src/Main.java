import java.util.Scanner;

import funPark.FunPark;
import funPark.CFunPark;

/**
 * @author AED 2019_20
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FunPark funPark;
		Scanner in = new Scanner(System.in);
		int noOfAvailableAttractions, kidId;
		noOfAvailableAttractions = in.nextInt();
		kidId = in.nextInt();
		in.nextLine();
		funPark = new CFunPark(noOfAvailableAttractions, kidId);
		shell(in,funPark);
		System.out.println("Fim programa.");
		in.close();
	}

	private static void shell(Scanner in, FunPark c) {
		String cmd = "";
		
		while (!cmd.equals("X")) {
			cmd = in.next().trim().toUpperCase();
			switch (cmd) {
				case "V":procAddVisitEnd(in, c); break;
				case "T":procAddVisitIndex(in, c); break;
				case "P":procPrintVisitedAttrs(in, c); break;
				case "R":procRemoveVisitIndex(in, c); break;
				case "N":procNoOfVisitedAttrs(c); break;
				case "C":procAttrScore(in, c); break;
				case "X":procExit(c); break;
			default: System.out.println("Comando invalido.");
			}
		}
	}

	private static void procExit(FunPark c) {
	}

	private static void procAttrScore(Scanner in, FunPark c) {
	}

	private static void procNoOfVisitedAttrs(FunPark c) {
		c.getNoOfVisitedAttrs();
	}

	private static void procRemoveVisitIndex(Scanner in, FunPark c) {
	}

	private static void procPrintVisitedAttrs(Scanner in, FunPark c) {
	}

	private static void procAddVisitIndex(Scanner in, FunPark c) {
		int index = in.nextInt();
		int attraction_id = in.nextInt();
		int score = in.nextInt();
		in.nextLine();
		
		c.addVisitIndex(index, attraction_id, score);
	}

	private static void procAddVisitEnd(Scanner in, FunPark c) {
		int attraction_id = in.nextInt();
		int score = in.nextInt();
		in.nextLine();
		
		c.addVisitEnd(attraction_id, score);
	}
}