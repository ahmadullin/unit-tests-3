package seminars.third.tdd;

public class MoodAnalyser {
    public String analyseMood(String mood) {
        if (mood == null) {
            throw new IllegalArgumentException("Mood cannot be null");
        }
        if (mood.toLowerCase().contains("happy")) {
            return "I am happy";
        } else if (mood.toLowerCase().contains("sad")) {
            return "I am sad";
        } else {
            return "I don't know";
        }
    }
}