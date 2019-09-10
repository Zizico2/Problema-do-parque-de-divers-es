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
		String cmd="";
		
		while (!cmd.equals("X")) {
			cmd=in.next().trim().toUpperCase();
			switch (cmd){
			case "V":procAddVisitEnd(in, c); break;
			case "T":procAddVisitIndex(in, c); break;
			case "P":procPrintAttr(in, c); break;
			case "R":procRemoveVisitIndex(c); break;
			case "N":procNoOfVisits(c); break;
			case "C":procAttrScore(c); break;
			case "X":procExit(c); break;
			default: System.out.println("Comando invalido.");
			}
		}
	}

	private static void procExit(FunPark c) {
	}

	private static void procAttrScore(FunPark c) {
	}

	private static void procNoOfVisits(FunPark c) {
	}

	private static void procRemoveVisitIndex(FunPark c) {
	}

	private static void procPrintAttr(Scanner in, FunPark c) {
	}

	private static void procAddVisitIndex(Scanner in, FunPark c) {
	}

	private static void procAddVisitEnd(Scanner in, FunPark c) {
	}

}