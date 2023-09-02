package haste.commands;

import haste.data.TaskList;
import haste.ui.Ui;

public class DeleteCommand extends Command {
    private int index;

    public DeleteCommand(int index) {
        this.index = index;
    }

    @Override
    public void execute(TaskList tasks, Ui ui) {
        String desc = tasks.getTask(index).toString();
        tasks.deleteTask(index);
        ui.delete(desc, tasks);
    }
}
