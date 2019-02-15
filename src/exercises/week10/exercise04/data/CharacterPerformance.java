package week10.exercise04.data;

public class CharacterPerformance {

    private String name;
    private String allegiances;
    private String deathyear;
    private String bookOfDeath;
    private String deathChapter;
    private String bookIntroChapter;
    private String gender;
    private String nobility;
    private String goT;
    private String coK;
    private String soS;
    private String ffC;
    private String dwD;

    public String getName() {
        return name;
    }

    public String getAllegiances() {
        return allegiances;
    }

    public String getDeathyear() {
        return deathyear;
    }

    public String getBookOfDeath() {
        return bookOfDeath;
    }

    public String getDeathChapter() {
        return deathChapter;
    }

    public String getBookIntroChapter() {
        return bookIntroChapter;
    }

    public String getGender() {
        return gender;
    }

    public String getNobility() {
        return nobility;
    }

    public String getGoT() {
        return goT;
    }

    public String getCoK() {
        return coK;
    }

    public String getSoS() {
        return soS;
    }

    public String getFfC() {
        return ffC;
    }

    public String getDwD() {
        return dwD;
    }

    public CharacterPerformance(String name, String allegiances, String deathyear, String bookOfDeath, String deathChapter, String bookIntroChapter, String gender, String nobility, String goT, String coK, String soS, String ffC, String dwD) {
        this.name = name;
        this.allegiances = allegiances;
        this.deathyear = deathyear;
        this.bookOfDeath = bookOfDeath;
        this.deathChapter = deathChapter;
        this.bookIntroChapter = bookIntroChapter;
        this.gender = gender;
        this.nobility = nobility;
        this.goT = goT;
        this.coK = coK;
        this.soS = soS;
        this.ffC = ffC;
        this.dwD = dwD;
    }

    @Override
    public String toString() {
        return "CharacterPerformance{" +
                "name='" + name + '\'' +
                ", allegiances='" + allegiances + '\'' +
                ", deathyear='" + deathyear + '\'' +
                ", bookOfDeath='" + bookOfDeath + '\'' +
                ", deathChapter='" + deathChapter + '\'' +
                ", bookIntroChapter='" + bookIntroChapter + '\'' +
                ", gender='" + gender + '\'' +
                ", nobility='" + nobility + '\'' +
                ", goT='" + goT + '\'' +
                ", coK='" + coK + '\'' +
                ", soS='" + soS + '\'' +
                ", ffC='" + ffC + '\'' +
                ", dwD='" + dwD + '\'' +
                '}';
    }
}
