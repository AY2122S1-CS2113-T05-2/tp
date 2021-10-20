package seedu.duke.parser;

import seedu.duke.commands.Command;
import seedu.duke.constants.Constants;
import seedu.duke.modules.ModuleList;
import seedu.duke.universities.UniversityList;

import java.io.IOException;
import java.text.ParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Parser {

    private static final Pattern BASIC_COMMAND_FORMAT = Pattern.compile("(?<commandWord>\\S+)(?<arguments>.*)");
    protected UniversityList universityMasterList;
    protected ModuleList moduleMasterList;
    protected ModuleList moduleSelectedList;
    protected UniversityList universitySelectedList;

    public Parser(UniversityList universityMasterList, ModuleList moduleMasterList,
                  UniversityList universitySelectedList, ModuleList moduleSelectedList) {
        this.universityMasterList = universityMasterList;
        this.moduleMasterList = moduleMasterList;
        this.moduleSelectedList = moduleSelectedList;
        this.universitySelectedList = universitySelectedList;
    }

    public Command parseCommand(String userInput) throws ParseException, IOException {
        final Matcher matcher = BASIC_COMMAND_FORMAT.matcher(userInput.trim());
        if (!matcher.matches()) {
            throw new ParseException(Constants.ERRORMSG_PARSEEXCEPTION_MATCHERCLASS, 1);
        }

        String commandWord = matcher.group("commandWord");
        String arguments = matcher.group("arguments");

        switch (commandWord) {
        case Constants.COMMAND_LIST:
            return new ListCommandParser().parse(arguments, universityMasterList, moduleMasterList,
                    universitySelectedList, moduleSelectedList);
        case Constants.COMMAND_REMOVE:
            return new RemoveCommandParser().parse(arguments, universitySelectedList,
                    moduleSelectedList);
        case Constants.COMMAND_SEARCHMAP:
            return new SearchMapCommandParser().parse(arguments, universityMasterList,
                    universitySelectedList, moduleSelectedList);
        case Constants.COMMAND_ADD:
            return new AddCommandParser().parse(arguments, universityMasterList, moduleMasterList,
                    universitySelectedList, moduleSelectedList);
        case Constants.COMMAND_EXIT:
            return new ExitCommandParser().parse();
        default:
            throw new ParseException(Constants.ERRORMSG_PARSEEXCEPTION_INCORRECTCOMMAND, 1);
        }
    }
}
