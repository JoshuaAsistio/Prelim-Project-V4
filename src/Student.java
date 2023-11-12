public class Student {
    private String name;
    private float examScore;
    private float examRating;
    private float quizAvg;
    private float recitationGrade;
    private float projectGrade;
    private float classStanding;
    private float classAverage;
    private float lectureGrade;
    private float labGrade;
    private float prelimGrade;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setExamScore(float examScore) {
        this.examScore = examScore;
    }

    public float getExamScore() {
        return examScore;
    }

    public void setExamRating(int examItems) {
        this.examRating = Computations.computeExamRating(examScore, examItems);
    }

    public float getExamRating() {
        return examRating;
    }

    public void setQuizAvg(float[] quizScores) {
        this.quizAvg = Computations.computeQuizAverage(quizScores);
    }

    public float getQuizAvg() {
        return quizAvg;
    }

    public void setRecitationGrade(float recitationGrade) {
        this.recitationGrade = recitationGrade;
    }

    public float getRecitationGrade() {
        return recitationGrade;
    }

    public void setProjectGrade(float projectGrade) {
        this.projectGrade = projectGrade;
    }

    public float getProjectGrade() {
        return projectGrade;
    }

    public void setClassStanding(String sub) {
        if (sub.equals("lab")) {
            this.classStanding = Computations.computeClassStanding(sub, quizAvg, recitationGrade, 0);
        } else {
            this.classStanding = Computations.computeClassStanding(sub, quizAvg, recitationGrade, projectGrade);
        }
        
    }

    public float getClassStanding() {
        return classStanding;
    }

    public void setClassAverage() {
        this.classAverage = Computations.computeClassAverage(classStanding, examRating);  
    }

    public float getClassAverage() {
        return classAverage;
    }

    public void setLectureGrade() {
        this.lectureGrade = Computations.computeLectureGrade(classAverage);
    }

    public float getLectureGrade() {
        return classAverage;
    }

    public void setLabGrade() {
        this.labGrade = Computations.computeLabGrade(projectGrade);
    }

    public float getLabGrade() {
        return labGrade;
    }

    public void setPrelimGrade(String sub) {
        if (sub.equals("lab")) {
            this.prelimGrade = Computations.computePrelimGrade("lab", lectureGrade, labGrade, 0, 0);
        } else {
            this.prelimGrade = Computations.computePrelimGrade("non lab", 0, 0, classStanding, examRating);
        }
    }

    public float getPrelimGrade() {
        return prelimGrade;
    }

    public void toString(String sub) {
        if (sub.equals("lab")) {
            Display.display(examScore, examRating, quizAvg, recitationGrade, classStanding, classAverage, lectureGrade, projectGrade, labGrade, prelimGrade, name);
        } else {
            Display.display(examScore, examRating, quizAvg, recitationGrade, projectGrade, classStanding, prelimGrade, name);
        }
    }
}