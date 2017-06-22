/**
 * 增加需求命令
 * @author qiaojy
 *
 */
public class AddRequirementCommand extends Command{

	@Override
	public void execute() {
		rg.find();
		rg.add();
		rg.plan();
	}

}
