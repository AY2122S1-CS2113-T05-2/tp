package seedu.duke.commands;

import seedu.duke.enumerations.ListType;
import seedu.duke.modules.ModuleList;
import seedu.duke.storage.UniversityStorage;
import seedu.duke.ui.Ui;
import seedu.duke.universities.University;
import seedu.duke.universities.UniversityList;

import java.io.IOException;

public class ListUniCommand extends Command {
    public ListUniCommand(UniversityList universityList, UniversityList universityMasterList,
                          ListType type) throws IOException {
        if (universityList.getSize() == 0) {
            assert universityList.getSize() == 0;
            System.out.println("The university list is empty!");
        } else {
            assert universityList.getSize() > 0;
            if (type == ListType.MASTER) {
                printMasterList(universityList);
            } else if (type == ListType.SELECTED) {
                printSelectedList(universityList);
//=======
//            System.out.println("Here are the universities and module mappings in the list:");
//            for (int i = 0; i < universityList.getSize(); i++) {
//                assert universityList.get(i).getName() != null;
//                Ui.printUniversity(universityList.get(i), universityMasterList);
//>>>>>>> f44e071ae00d3485101b601e76650ef74929d9bb
            }
        }
    }

    private void printSelectedList(UniversityList universityList) {
        System.out.println("Here are the universities and module mappings in the list:");
        for (int i = 0; i < universityList.getSize(); i++) {
            assert universityList.get(i).getName() != null;
            Ui.printUniversity(universityList.get(i), universityList);
            universityList.get(i).listAllMappings();
        }
    }

    private void printMasterList(UniversityList universityList) {
        System.out.println("Here are the universities and module mappings in the list:");
        for (int i = 0; i < universityList.getSize(); i++) {
            assert universityList.get(i).getName() != null;
            Ui.printUniversity(universityList.get(i), universityList);
        }
    }
}
