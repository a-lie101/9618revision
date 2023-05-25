package specimen_q2;

public class puzzleBox extends hiddenBox{
	private String puzzleText;
	private String solution;
	public puzzleBox(String boxNAME, String CREATOR, String dateHIDDEN, String gameLOCATION, String puzzleText, String solution) {
		super(boxNAME, CREATOR, dateHIDDEN, gameLOCATION);
		// TODO Auto-generated constructor stub
		
		this.puzzleText = puzzleText;
		this.solution = solution;
	}
}
