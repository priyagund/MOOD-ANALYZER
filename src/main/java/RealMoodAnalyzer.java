public class RealMoodAnalyzer {
    String message;

    public RealMoodAnalyzer(String message) {
        this.message = message;
    }

    public String analyzeMood() throws MoodAnalysisException {
        return this.analyzeMood(message);
    }

    public String analyzeMood(String message) throws MoodAnalysisException {
        try {
            if (message.contains("SAD")) {
                return "SAD";
            } else {
                return "HAPPY";
            }
        } catch (NullPointerException e) {

            throw new MoodAnalysisException("please enter proper message");
        }
    }


    @Override
    public boolean equals(Object obj) {
        return (((RealMoodAnalyzer) obj).message.equals(this.message));
    }
}