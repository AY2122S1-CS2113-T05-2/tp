package seedu.duke.Classes;

import java.util.ArrayList;

public class SelectedModuleList {
    protected ArrayList<Module> list;

    public SelectedModuleList(ArrayList<Module> list) {
        this.list = list;
    }

    public void addModule(Module module) {
        list.add(module);
    }

    public void removeModule(String moduleCode) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).moduleCode.equals(moduleCode)) {
                list.remove(i);
                break;
            }
        }
    }

}
