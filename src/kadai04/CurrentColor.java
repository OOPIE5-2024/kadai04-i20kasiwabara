package kadai04;

import java.awt.Color;

public class CurrentColor {
	int red = 0;
	int blue = 0;
	int green = 0;
	Color changeRed() {
		red = nextBright(red);
		return new Color(red, green, blue);
	}
	Color changeBlue() {
		blue = nextBright(blue);
		return new Color(red, green, blue);
	}
	Color changeGreen() {
		green = nextBright(green);
		return new Color(red, green, blue);
	}
	int nextBright(int b) {
		if(b==0) {
			b = 128;
		}
		else if(b==128) {
			b = 255;
		}
		else if(b==255){
			b = 0;
		}
		return b;
	}
}
