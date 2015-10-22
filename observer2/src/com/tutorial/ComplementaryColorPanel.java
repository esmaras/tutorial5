package com.tutorial;

import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;

import java.awt.Color;
import java.awt.Graphics;

public class ComplementaryColorPanel extends ColorPanel{
	public ComplementaryColorPanel(float hue, float saturation, float brightness){
		super(hue, saturation, brightness);
		
	}
	public void stateChanged(ChangeEvent e){
		 JSlider slider = (JSlider)e.getSource();
		 if(slider.getName().equals("hueSlider")){
			 if(((float)slider.getValue()/100) - (float).5 < 0){
				 this.setHue((((float)slider.getValue()/100) - (float).5)+1);
			 }
			 else{
				 this.setHue(((float)slider.getValue()/100) - (float).5);
			 }
			 Color newColor = Color.getHSBColor(this.getHue(), this.getSaturation(), this.getBrightness());
			 this.setColor(newColor);
			    
		 }
		 else if(slider.getName().equals("saturationSlider")){
			 this.setSaturation((float)slider.getValue()/100);
			 Color newColor = Color.getHSBColor(this.getHue(), this.getSaturation(), this.getBrightness());
			 this.setColor(newColor);
			 
			 
		 }
		 else if(slider.getName().equals("brightnessSlider")){
			 this.setBrightness((float)slider.getValue()/100);
			 Color newColor = Color.getHSBColor(this.getHue(), this.getSaturation(), this.getBrightness());
			 this.setColor(newColor);
		 }
		 
	
	 }


}
