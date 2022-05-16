public class Beyonce extends Artist{
    public void song() {
        System.out.println("Sorry");
    }
}

class Main {
    public static void main(String[] args) {
      Beyonce beyonce = new Beyonce();
      beyonce.song();
    }
  }