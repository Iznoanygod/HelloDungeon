package main.load;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Load {
	public static float[] vault() throws ClassNotFoundException, IOException{
		float itemID[] = new float[100];
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("savedata/vault.save"));
		for(int number = 0; number < 100; number++){
		itemID[number] = (Float) in.readObject();
		}
		in.close();
		return itemID;
	}
}
