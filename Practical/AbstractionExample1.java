// Abstract class
abstract class Recorder {
  public abstract void record();
  
// Regular method
  public void capture() {
    System.out.println("Photo captured: Snap!");
  }
}

// Subclass 
class ScreenRecorder extends Recorder {
  public void record() {
    System.out.println("Your Screen is being recorded");
  }
}

class AbstractionExample1 {
  public static void main(String[] args) {
    ScreenRecorder sr = new ScreenRecorder(); // 
    sr.record();
    sr.capture();
  }
}
