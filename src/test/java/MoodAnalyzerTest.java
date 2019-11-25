import com.bridgelabz.RealMoodAnalyzer;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyzerTest
{
    @Test
    public void givenMessage_whenSad_shouldReturnSad()
    {
        RealMoodAnalyzer moodAnalyzer = new RealMoodAnalyzer();
        Assert.assertEquals("SAD",moodAnalyzer.analyzeMood("THIS IS SAD MOOD ") );

    }

    @Test
     public void givenMessage_WhenHappy_shouldReturnHappy(){
        RealMoodAnalyzer moodAnalyzer=new RealMoodAnalyzer();
        Assert.assertEquals("HAPPY",moodAnalyzer.analyzeMood("THIS IS HAPPY MOOD"));
    }

    @Test
    public void giveNullMood_shouldReturnHappy()
    {
        RealMoodAnalyzer moodAnalyzer=new RealMoodAnalyzer();
        Assert.assertEquals("HAPPY",moodAnalyzer.analyzeMood(null));
    }
}
