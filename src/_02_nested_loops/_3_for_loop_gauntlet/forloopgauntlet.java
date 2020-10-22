package _02_nested_loops._3_for_loop_gauntlet;

public class forloopgauntlet {
public static void main(String[] args) {
//	for (int j = 0; j < 101; j++) {
//		System.out.println(j);
//
//}
//	for (int k = 100; k > -1; k--) {
//		System.out.println(k);
//	}
//	for (int j = 2; j< 101; j+=2) {
//		System.out.println(j);
//	}
//	for (int j = 1; j<100; j+=2) {
//		System.out.println(j);
//	}
//	for (int j = 1; j<501; j++) {
//		if (j % 2 == 1) {
//			System.out.println(j+"odd");
//		}
//		else if (j % 2 == 0) {
//			System.out.println(j+"even");
//		}
//	}
//	for (int j = 0; j<778; j++) {
//		if (j % 7 == 0) {
//			System.out.println(j);
//		}
//	}
//	for (int j = 2006; j<2021; j++) {
//		System.out.println("In"+j+", i was"+(j-2006)+"years old.");
//	}
//	for (int j = 0; j<3; j++) {
//		for (int k = 0; k<3; k++) {
//			System.out.print(j);
//			System.out.println(k);
//		}
//	}
//	int printnum = 1;
//	for (int j = 1; j<4; j++) {
//		for (int k = 1; k<4; k++) {
//			System.out.print(printnum);
//			printnum = printnum+1;
//		}
//System.out.println();
//	}
//	int printnum2 = 1;
//	for (int j = 1; j<11; j++) {
//		for (int k = 1; k<11; k++) {
//			System.out.print(printnum2+"\t");
//			printnum2 = printnum2+1;
//		}
//System.out.println();
//	}
	for (int j=1; j<7; j++) {
		for (int k=1; k<=j; k++) {
			System.out.print("*");
		}
System.out.println();
	}
}
}