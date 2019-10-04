package duke.parser.order;

import duke.command.AddOrderCommand;
import duke.command.DeleteOrderCommand;
import duke.command.EditOrderCommand;
import duke.command.OrderCommand;
import duke.parser.SubCommandParser;
import duke.parser.exceptions.ParseException;

public class OrderCommandParser implements SubCommandParser<OrderCommand> {

    @Override
    public OrderCommand parse(String subCommandAndArgs) throws ParseException {
        String subCommand = SubCommandParser.getSubCommandWord(subCommandAndArgs);
        String args = SubCommandParser.getArgs(subCommandAndArgs);

        switch (subCommand) {
            case AddOrderCommand.COMMAND_WORD:
                return new AddOrderCommandParser().parse(args);
            case DeleteOrderCommand.COMMAND_WORD:
                return new DeleteOrderCommandParser().parse(args);
            case EditOrderCommand.COMMAND_WORD:
                return new EditOrderCommandParser().parse(args);
        }
        return null;
    }
}
