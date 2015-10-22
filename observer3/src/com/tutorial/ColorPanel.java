package com.tutorial;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public abstract class ColorPanel extends JPanel{
    private Color color;
    private float hue, saturation, brightness;
    
    
    public ColorPanel(float hue, float saturation, float brightness){
    	this.color = Color.getHSBColor(hue, saturation, brightness);
    	this.hue = hue;
    	this.saturation = saturation;
    	this.brightness = brightness;
    }

    public void setColor(Color newColor){
		this.color = newColor;
		repaint();
    }
    public Color getColor(){
    	return this.color;
    }
    public float getHue() {
		return hue;
	}

	public void setHue(float hue) {
		this.hue = hue;
	}

	public float getSaturation() {
		return saturation;
	}

	public void setSaturation(float saturation) {
		this.saturation = saturation;
	}

	public float getBrightness() {
		return brightness;
	}

	public void setBrightness(float brightness) {
		this.brightness = brightness;
	}

	protected void paintComponent(Graphics g){
		this.setBackground(color);
		super.paintComponent(g);
    }
}
