package seedu.duke.universities;

import seedu.duke.modules.Module;

import java.util.ArrayList;

public class UniversityList {

    protected ArrayList<University> list;

    public UniversityList(ArrayList<University> list) {
        this.list = list;
    }

    public UniversityList() {
        this.list = new ArrayList<>();
    }

    public void addUniversity(University addedUniversity) {
        assert addedUniversity != null;
        list.add(addedUniversity);
        assert !list.isEmpty();
    }

    public void removeUniversity(String universityName) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equals(universityName)) {
                list.remove(i);
                break;
            }
        }
    }

    public void removeUniversity(int index) {
        assert index <= list.size();
        list.remove(index);
    }

    public void listUniversities() {
        assert list.size() != 0;
        for (int i = 0; i < list.size(); i++) {
            University curr = list.get(i);
            String output = (i + 1) + ". " + curr.name;
            System.out.println(output);
        }
    }

    public int getSize() {
        return list.size();
    }

    public ArrayList<University> getList() {
        return list;
    }

    public University get(int index) {
        assert index <= list.size();
        return list.get(index);
    }

    public boolean searchUniversity(String universityName) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equals(universityName)) {
                return true;
            }
        }
        return false;
    }

    public University getUniversity(String universityName) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).name.equals(universityName)) {
                return list.get(i);
            }
        }
        return null;
    }

}