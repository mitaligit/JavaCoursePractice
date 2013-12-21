import java.util.*;

public class Sudoku {

	
	
	public static void main(String args[]) {
		//put elements in hash set
				testSudoku();
	}

	//returns set of { 1,2,3...9 }
	public static Set<Integer> giveSet() {
		int[] ex = { 1,2,3,4,5,6,7,8,9};
		Set<Integer> set_ex = new HashSet<Integer>();
		for ( int i : ex) set_ex.add(i);
		return set_ex;
	}
	
	public static void testSudoku() {
		/* make a bad sudoku
		 * 1: only one row has one number repeated
		 * 2: Only one column has one number repeated
		 * 3: One grid has one number repeated
		 * Good cases :
		 * Valid sudoku
		 * Null case 
		 * if size is not 9 
		 * if size is not square 
		 */ 
		int[][] valid = {{5,3,4,6,7,8,9,1,2},
		         {6,7,2,1,9,5,3,4,8},
		         {1,9,8,3,4,2,5,6,7},
		         {8,5,9,7,6,1,4,2,3},
		         {4,2,6,8,5,3,7,9,1},
		         {7,1,3,9,2,4,8,5,6},
		         {9,6,1,5,3,7,2,8,4},
		         {2,8,7,4,1,9,6,3,5},
		         {3,4,5,2,8,6,1,7,9}};
		
		boolean res = checkSudoku(valid);
		if ( res != true) {
			System.out.println("sudoku failed");
		} else {
			System.out.println("sudoku passed");
		}
	}
	public static boolean checkSudoku( int[][] sudoku) {
	
		// each row should contain number only once 
		for ( int i=0 ; i < sudoku.length ; i++) {
			Set<Integer> ss = giveSet();
			for ( int j=0; j< sudoku.length ; j++) {
				ss.remove(sudoku[i][j]);
			}
			if( !ss.isEmpty()) {
				return false;
			}
			 
		}
		//each col should contain number only once
		for ( int i=0 ; i < sudoku.length ; i++) {
			Set<Integer> ss = giveSet();
			for ( int j=0; j< sudoku.length ; j++) {
				ss.remove(sudoku[j][i]);
			}
			if( !ss.isEmpty()) {
				return false;
			}
		}
		//each 3*3 grid should contain number only once
		for ( int i=0 ; i <9 ; i = i+3) {
			for ( int j=0; j<9 ; j = j+3) {
				//check grid starting at i,j
				Set<Integer> ss = giveSet();
				ss.remove(sudoku[i][j]);
				ss.remove(sudoku[i][j+1]);
				ss.remove(sudoku[i][j+2]);
				ss.remove(sudoku[i+1][j]);
				ss.remove(sudoku[i+1][j+1]);
				ss.remove(sudoku[i+1][j+2]);
				ss.remove(sudoku[i+2][j]);
				ss.remove(sudoku[i+2][j+1]);
				ss.remove(sudoku[i+2][j+2]);
				if( !ss.isEmpty()) {
					return false;
				}
			}
		}
		return true;
	}
	
}
