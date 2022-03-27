package seedu.duke.command;

import seedu.duke.Packages;
import seedu.duke.Reservations;

public class DeleteCommand extends Command {
    private final String id;

    public DeleteCommand(String id) {
        this.id = id;
    }

    public void execute(Packages packages, Reservations r) {
        int numberOfPackages = packages.getSize();
        for (int i = 0; i < numberOfPackages; i++) {
            if (packages.getPackage(i).getID().equals(id)) {
                packages.removePackage(i);
                break;
            }
        }

    }
}
