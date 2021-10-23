package seedu.duke.modules;

import java.util.ArrayList;

public class ModuleList {
    protected ArrayList<Module> list;

    public ModuleList(ArrayList<Module> list) {
        this.list = list;
    }

    public ModuleList() {
        this.list = new ArrayList<>();
    }

    public void addModule(Module module) {
        assert module != null;
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

    public int getSize() {
        return list.size();
    }

    public Module get(int index) {
        assert index <= list.size();
        return list.get(index);
    }

    public boolean isModuleExist(String moduleCode) {
        for (Module module : list) {
            if (module.moduleCode.equals(moduleCode)) {
                return true;
            }
        }
        return false;
    }

    public Module getModule(String moduleCode) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).moduleCode.equals(moduleCode)) {
                return list.get(i);
            }
        }
        return null;
    }

    public ArrayList<Module> getList() {
        return list;
    }
}