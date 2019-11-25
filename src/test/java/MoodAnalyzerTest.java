import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MoodAnalyzerTest
{
    @Test
    public void givenMessage_whenSad_shouldReturnSad() throws MoodAnalysisException {
        RealMoodAnalyzer moodAnalyzer = new RealMoodAnalyzer();
        Assert.assertEquals("SAD",moodAnalyzer.analyzeMood("THIS IS SAD MOOD ") );

    }

    @Test
     public void givenMessage_WhenHappy_shouldReturnHappy() throws MoodAnalysisException {
        RealMoodAnalyzer moodAnalyzer=new RealMoodAnalyzer();
        Assert.assertEquals("HAPPY",moodAnalyzer.analyzeMood("THIS IS HAPPY MOOD"));
    }

    @Test
    public void giveNullMood_shouldReturnHappy()
    {
        RealMoodAnalyzer moodAnalyzer=new RealMoodAnalyzer();
        try{
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(MoodAnalysisException.class);
            Assert.assertEquals("HAPPY",moodAnalyzer.analyzeMood(null));
        } catch (MoodAnalysisException e)
        {
            e.getStackTrace();
        }

    }



}
