import org.example.MoodAnalyser;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestMoodAnalyser {
    MoodAnalyser mood = new MoodAnalyser("I am in Sad Mood");
    MoodAnalyser mTwo = new MoodAnalyser("I am in Happy Mood");

    @Test
    public void testAnalyseMood(){
        assertEquals("SAD", MoodAnalyser.analyseMood("I am in Sad Mood"));
        assertEquals("HAPPY", MoodAnalyser.analyseMood("I am in Any Mood"));
        assertEquals("HAPPY", MoodAnalyser.analyseMood("I am in Mood"));
        assertEquals("SAD",MoodAnalyser.analyseMood(mood.getMsg()));
        assertEquals("HAPPY",MoodAnalyser.analyseMood(mTwo.getMsg()));
    }

}
