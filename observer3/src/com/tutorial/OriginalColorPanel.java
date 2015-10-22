package com.tutorial;

import java.awt.Color;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class OriginalColorPanel extends ColorPanel implements ChangeListener{
	
	
	
	
	public OriginalColorPanel(float hue, float saturation, float brightness) {
		super(hue, saturation, brightness);
		
		
	}

	 public void stateChanged(ChangeEvent e){
		 JSlider slider = (JSlider)e.getSource();
		 if(slider.getName().equals("hueSlider")){
			    
			 this.setHue((float)slider.getValue()/100);
			 
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
