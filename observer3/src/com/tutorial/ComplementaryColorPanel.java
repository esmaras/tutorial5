package com.tutorial;

import java.awt.Color;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

import javax.swing.JSlider;
import javax.swing.event.ChangeEvent;

public class ComplementaryColorPanel extends ColorPanel implements PropertyChangeListener{
	
	
	public ComplementaryColorPanel(float hue, float saturation, float brightness){
		super(hue, saturation, brightness);
		
	}
	
	@Override
	public void propertyChange(PropertyChangeEvent evt) {
		ColorPanel prop = (ColorPanel)evt.getSource();//
		
		float hue = (prop.getHue()/100) - (float).5;
		if(hue < 0){
			 this.setHue(hue + 1);
		 }
		 else{
			 this.setHue(hue);
		 }
		
		this.setSaturation((prop.getSaturation()/100));
		this.setBrightness((prop.getBrightness()/100));
		
		Color newColor = Color.getHSBColor(this.getHue(), this.getSaturation(), this.getBrightness());
		this.setColor(newColor);
		
	
		
	}


}
