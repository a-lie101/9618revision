package oct21_41_2;

import java.io.*;
import java.util.Scanner;
//unfinished, need to do g
public class Picture {
	private String Description;
	private int Width;
	private int Height;
	private String FrameColour;
	public static Picture[] arr = new Picture[100];
	public Picture(String DescriptionP, int WidthP, int HeightP, String FrameColourP) {
		this.Description = DescriptionP;
		this.Width = WidthP;
		this.Height = HeightP;
		this.FrameColour = FrameColourP;
	}

	public static void main(String args[]) {
		ReadData();
		System.out.println(arr[0].Description);
		
	}

	public static void ReadData() {
		Picture tempPic = new Picture("", 0, 0, "");
		try {
			FileReader f = new FileReader("Pictures.txt");
			BufferedReader reader = new BufferedReader(f);
			
			for(int i = 0; i <21; i++) {
				tempPic.Description = reader.readLine();
				tempPic.Width = reader.read();
				tempPic.Height = reader.read();
				tempPic.FrameColour = reader.readLine();
				arr[i] = tempPic;
				
			}
			
		} catch (IOException e) {
			System.exit(-1);
			System.err.println("error");
		}

	}

	public String getDescription() {
		return Description;
	}

	public int getWidth() {
		return Width;
	}

	public int getHeight() {
		return Height;
	}

	public String getFrameColour() {
		return FrameColour;
	}

	public void SetDescription(String newDescription) {
		this.Description = newDescription;
	}
}
