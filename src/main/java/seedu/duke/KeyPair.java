package seedu.duke;

//2021.10.4 22:00 - 2021.10.4 22:49
//RIP

public class KeyPair {
    protected int index;
    protected String universityName;

    public KeyPair(int index, String universityName) {
        this.index = index;
        this.universityName = universityName;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

}
