import java.util.Random;
import javafx.scene.control.Label;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
public class MainController {
    @FXML
    private Label MyMessage;

    public void generateRandom(ActionEvent ev){
        String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String randomString = "";
        String randomSentence = "";
        Random rand = new Random();

        int length = 10;


        char[] text = new char[length];

        for (int l=0;l<5;l++){

            for(int i=0; i<length; i++){
                text[i] = characters.charAt(rand.nextInt(characters.length()));
            }

            for(int i=0;i<text.length; i++){
                randomString += text[i];
            }
            randomSentence=randomSentence + randomString + " ";
        }


        MyMessage.setText(randomSentence);
        System.out.println(randomString);
        System.out.println(randomSentence);











    }
}
