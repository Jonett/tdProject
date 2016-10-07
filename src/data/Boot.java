package data;

import org.lwjgl.opengl.Display;
import org.newdawn.slick.opengl.Texture;

import static helpers.Artist.*;
import static data.TileType.*;



public class Boot {
	
	public Boot() {
		
		BeginSession();
		
		
		TileGrid grid = new TileGrid();
	
		while(!Display.isCloseRequested()) {
			
			grid.Draw();
			
			
			
			
			
			
			Display.update();
			Display.sync(60);
			
			
		}
		
		Display.destroy();
		
	}
	
	public static void main(String[] args){
		new Boot();

	}		

}
