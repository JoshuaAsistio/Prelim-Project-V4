public class Computations {
    public static float computeExamRating(float grade, int items) {
        return ((grade/items) * (float) 50) + (float) 50;
    }

    public static float computeQuizAverage(float[] quizScores) {
        float result = 0;

        for (int i = 0; i < quizScores.length; i++) {
            result += quizScores[i];
        }

        return result / quizScores.length;
    }

    public static float computeClassStanding(String sub, float quizScore, float recitationScore, float projectGrade) {
        if (sub.equals("lab")) {
            return (quizScore + recitationScore) / 2;
        } else {
            return (quizScore + recitationScore + projectGrade) / 3;
        }
        
    }

    public static float computeClassAverage(float classStanding, float examRating) {
        return ( ( classStanding * 2 ) + examRating ) / 3;
    }

    public static float computeLectureGrade(float classAvg) {
        return classAvg * (float) 0.6;
    }

    public static float computeLabGrade(float projectGrade) {
        return projectGrade * (float) 0.4;
    }

    public static float computePrelimGrade(String sub, float lectureGrade, float labGrade, float classStanding, float examRating) {
        if (sub.equals("lab")) {
            return lectureGrade + labGrade;
        } else {
            return ( ( classStanding * 2 ) + examRating ) / 3;
        }
        
    }
}