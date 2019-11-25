import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyzerTest
{

    @Test
    public void givenMoodAnalyzerObject_whenProper_shouleReturnObject()
    {
        MoodAnalyzerFactory.moodAnalyzer();
        Constructor<?> constructor;
       try {
           constructor = Class.forName("RealMoodAnalyzer").getConstructor(String.class);

           Object myObj=constructor.newInstance("i am in Happy mood");
           RealMoodAnalyzer moodAnalyzer=(RealMoodAnalyzer) myObj;

               String mood=moodAnalyzer.analyzeMood();
               Assert.assertEquals("HAPPY",mood);

       } catch (IllegalAccessException e) {
           e.printStackTrace();
       } catch (InstantiationException e) {
           e.printStackTrace();
       } catch (MoodAnalysisException e) {
           e.printStackTrace();
       } catch (InvocationTargetException e) {
           e.printStackTrace();
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       } catch (NoSuchMethodException e) {
           e.printStackTrace();
       }
    }

    @Test
    public void givenMessage_whenSad_shouldReturnSad() throws MoodAnalysisException {
        RealMoodAnalyzer moodAnalyzer = new RealMoodAnalyzer("THIS IS SAD MOOD");
        Assert.assertEquals("SAD",moodAnalyzer.analyzeMood("THIS IS SAD MOOD ") );

    }

    @Test
     public void givenMessage_WhenHappy_shouldReturnHappy() throws MoodAnalysisException {
        RealMoodAnalyzer moodAnalyzer=new RealMoodAnalyzer("THIS IS HAPPY MOOD");
        Assert.assertEquals("HAPPY",moodAnalyzer.analyzeMood("THIS IS HAPPY MOOD"));
    }

    @Test
    public void giveNullMood_shouldReturnHappy()
    {
        RealMoodAnalyzer moodAnalyzer=new RealMoodAnalyzer("HAPPY");
        try{
            ExpectedException expectedException = ExpectedException.none();
            expectedException.expect(MoodAnalysisException.class);
            Assert.assertEquals("HAPPY",moodAnalyzer.analyzeMood(null));
        } catch (MoodAnalysisException e)
        {
            e.getStackTrace();
        }

    }

    @Test
    public void checkEqualObject() {
        RealMoodAnalyzer moodAnalyzer = MoodAnalyzerFactory.moodAnalyzer();
        Assert.assertEquals(new RealMoodAnalyzer("I am Happy"),moodAnalyzer);
    }
}
