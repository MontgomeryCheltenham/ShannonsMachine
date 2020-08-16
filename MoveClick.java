package shannon;
import java.awt.AWTException;
import java.awt.Robot;

public class MoveClick {
	private Robot r;
	private int delay;
	
	public MoveClick(){
		try {
			r = new Robot();
			r.delay(delay);
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
	}
	public void mover(int mX, int mY, int evt){
		try{
			r.delay(3000);
			r.mouseMove(mX, mY);
			r.delay(500);
			r.mousePress(evt);
			r.delay(50);
			r.mouseRelease(evt);
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public void setDelay(int delay){
		this.delay = delay;
	}

}
