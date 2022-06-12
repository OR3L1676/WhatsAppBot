import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import javax.swing.*;
import java.awt.*;
import java.net.URL;

public class Main extends JFrame {
    private int WINDOW_WIDTH = 800;
    private int WINDOW_HEIGHT = 500;
    private String urlWhatsApp = "https://web.whatsapp.com/";



    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\chromedriver\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        Main main = new Main();


    }

    public Main() {//מטודות חובה לפתיחת חלון גרפי
        this.setVisible(true);
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null);
        this.setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
        this.setResizable(false);
        // טקסט שמאל למעלה ברוך הבא
        Font font1 = new Font("Ariel", Font.BOLD, 20);
        JLabel title1 = new JLabel("Welcome to WhatsAppBot");
        title1.setBounds((WINDOW_WIDTH/100), (WINDOW_HEIGHT/100),250,20);
        title1.setFont(font1);
        this.add(title1);
        System.out.println(title1.getHeight());
        //כפתור שנכנס לוואצאפ
        JButton buttonToWhatsApp = new JButton("Enter WhatsApp");
        buttonToWhatsApp.setBounds(WINDOW_WIDTH-210, WINDOW_HEIGHT/2, 140, 50);
        this.add(buttonToWhatsApp);
        buttonToWhatsApp.addActionListener((event) ->{
            enterWhatsApp(urlWhatsApp);

        });


    }

    public static void enterWhatsApp(String urlString) {
        try {
            Desktop.getDesktop().browse(new URL(urlString).toURI());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
