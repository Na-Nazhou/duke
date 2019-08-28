package duke.command;

import duke.Storage;
import duke.TaskList;
import duke.Ui;

public class ExitCommand extends Command {

    public ExitCommand() {
        this.isExit = true;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) {
        ui.showExit();
    }
}