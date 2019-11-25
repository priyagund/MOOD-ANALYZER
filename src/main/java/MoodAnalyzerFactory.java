import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class MoodAnalyzerFactory
{

    public static RealMoodAnalyzer moodAnalyzer() {
        Object obj = null;
        try {
            Class<?> moodAnalyzerClass = Class.forName("RealMoodAnalyzer");
            Constructor<?> constructor = moodAnalyzerClass.getConstructor(String.class);
            obj = constructor.newInstance("I am Happy");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return (RealMoodAnalyzer) obj;
    }

}

