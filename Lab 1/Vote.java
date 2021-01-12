import java.*;


/**
 * Name: Vu Nhat Nguyen Student Number: T00612390 Seminar Number: 1 Due Date:
 * September 17, 2019
 * <p>
 * Program Description: This program computes, then displays the corresponding
 * vote data to the respective candidate, and subdivision, then calculates the
 * totals it. **
 */
public class Vote {


    private String[] candidates;

    private String[] subDiv;

    private int[] candTotal;

    private int[] subDivTotal;

    private int[][] voteData;


    //start of main method
    public static void main (String[] args) {

	   int totalRow = 0;
	   int totalCol = 0;

	   File file = new File("votedata.txt");
	   BufferedReader reader = null;

	   try {
		  reader = new BufferedReader(new FileReader(file));
		  System.out.println(totalRow);

	   } catch(IOException e) {
		  System.out.println();
	   }


//          String[] candidatesNames = {"Audrey", "Brian", "Elizabeth", "Peter", "Zachary"};
//
//          int[][] voteTotal = {{600, 800, 800, 800}, {700, 700, 700, 900}, {800, 700, 800, 700}, {400, 450, 300, 1300}, {900, 900, 900, 1000}};
//
//          String[] subDivisions = {"Aberdeen", "Brock", "Sahali", "Valleyview"};

//          Vote x = new Vote();
//          x.initData(candidatesNames, subDivisions, voteTotal);
//          x.subDivisionTotal();
//          x.printResults();

    }

    //initData method initializes the data inputed
    public void initData (String[] names, String[] subNames, int[][] voteCount) {
	   candidates = names;
	   subDiv = subNames;
	   voteData = voteCount;

    }

    //totalVotes calculates the total votes per candidate
    public void totalVotes () {
	   candTotal = new int[candidates.length];


	   int sum1 = 0;
	   for (int row = 0; row < voteData.length; row++) {
		  for (int col = 0; col < voteData[0].length; col++) {
			 sum1 = sum1 + voteData[row][col];
		  }
		  candTotal[row] = sum1;
		  sum1 = 0;
	   }
    }

    //subDivisionTotal calculates the total votes per subDivision area
    public void subDivisionTotal () {

	   subDivTotal = new int[subDiv.length];

	   int sum2 = 0;

	   for (int col = 0; col < voteData[0].length; col++) {

		  for (int row = 0; row < voteData.length; row++) {

			 sum2 = sum2 + voteData[row][col];

		  }

		  subDivTotal[col] = sum2;
		  sum2 = 0;
	   }
    }

    //printResults displays the information
    public void printResults () {

	   System.out.printf("%-30s  %-30s %-30s %n", "Candidates", "Subdivisions", "Total");
	   System.out.print("           ");

	   for (int col = 0; col < voteData[0].length; col++) {
		  System.out.print("   ");
		  System.out.printf("%5s", subDiv[col]);

	   }


	   System.out.printf("\nTotal          ");
	   for (int row = 0; row < subDiv.length; row++) {
		  System.out.printf("%-10s", subDivTotal[row]);
	   }

    }

}
