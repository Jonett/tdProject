package data;

import org.newdawn.slick.opengl.Texture;

import static helpers.Artist.*;

public class Tile {

	private float x, y, widht, height;
	private Texture texture;
	private TileType type;
	
	public Tile(float x, float y, float width, float height, TileType type) {
		this.x = x;
		this.y = y;
		this.height = height;
		this.widht = width;
		this.texture = QuickLoad(type.textureName);
	}
	
	public void Draw()
	{
		DrawQuadTex(texture, x, y, widht, height);
	};

	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public float getWidht() {
		return widht;
	}

	public void setWidht(float widht) {
		this.widht = widht;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public Texture getTexture() {
		return texture;
	}

	public void setTexture(Texture texture) {
		this.texture = texture;
	}

	public TileType getType() {
		return type;
	}

	public void setType(TileType type) {
		this.type = type;
	}
	
	
	
	
	
}
