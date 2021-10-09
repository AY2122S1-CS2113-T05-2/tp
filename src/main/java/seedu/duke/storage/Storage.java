package seedu.duke.storage;

import seedu.duke.modules.Module;
import seedu.duke.modules.ModuleMapping;
import seedu.duke.universities.University;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class Storage {
    private static final String UNIVERSITY_FILEPATH = "data/University.csv";
    private static final String MODULE_FILEPATH = "data/modules.csv";

    public static ArrayList<University> loadUniversities() throws IOException {
        return readUniversitiesFromCsv();
    }

    public static ArrayList<Module> loadModules() throws IOException {
        return readModulesFromCsv();
    }

    private static ArrayList<University> readUniversitiesFromCsv() throws IOException {
        ArrayList<University> universityList = new ArrayList<>();
        ArrayList<ModuleMapping> moduleMappingList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(UNIVERSITY_FILEPATH));
        String line = br.readLine();
        String curr = " ";
        while (line != null) {
            String[] attributes = extractUniversityAttributes(line);
            if (curr.equals(" ")) {
                curr = attributes[0];
            } else if (!curr.equals(attributes[0])) {
                universityList.add(new University(curr, moduleMappingList));
                curr = attributes[0];
                moduleMappingList.clear();
            }
            Module local = new Module(attributes[1], attributes[2], parseInt(attributes[3]));
            Module mapped = new Module(attributes[4], attributes[5], parseDouble(attributes[6]));
            moduleMappingList.add(new ModuleMapping(local, mapped));
            line = br.readLine();
        }
        return universityList;
    }

    private static ArrayList<Module> readModulesFromCsv() throws IOException {
        ArrayList<Module> moduleList = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader(MODULE_FILEPATH));
        String line = br.readLine();
        while (line != null) {
            String[] attributes = line.split(";");
            moduleList.add(new Module(attributes[0], attributes[1], parseInt(attributes[2])));
            line = br.readLine();
        }
        return moduleList;
    }

    private static String[] extractUniversityAttributes(String line) {
        String[] attributes = line.split(",");
        if (attributes.length == 7) {
            return attributes;
        }
        String[] updatedAttributes = new String[7];
        int i = 0;
        int j = 0;
        boolean flag = false;
        while (j < 7) {
            if (!flag) {
                updatedAttributes[j] = attributes[i];
                j++;
            } else {
                updatedAttributes[j - 1] += ("," + attributes[i]);
            }
            if (attributes[i].startsWith("\"") && !flag) {
                flag = true;
                updatedAttributes[j - 1] = updatedAttributes[j - 1].substring(1);
            }
            if (attributes[i].endsWith("\"") && flag) {
                flag = false;
                int length = updatedAttributes[j - 1].length();
                updatedAttributes[j - 1] = updatedAttributes[j - 1].substring(0, length - 1);
            }
            i++;
        }
        return updatedAttributes;
    }
}