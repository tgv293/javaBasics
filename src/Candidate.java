public class Candidate {
    String id;
    String name;
    String dob;
    double mathScore;
    double literatureScore;
    double englishScore;

    public Candidate(String id, String name, String dob, double mathScore, double literatureScore, double englishScore) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.mathScore = mathScore;
        this.literatureScore = literatureScore;
        this.englishScore = englishScore;
    }

    public double getTotalScore() {
        return this.mathScore + this.literatureScore + this.englishScore;
    }

    @Override
    public String toString() {
        return "ID: " + this.id + ", Name: " + this.name + ", DOB: " + this.dob + ", Total Score: " + getTotalScore();
    }
}