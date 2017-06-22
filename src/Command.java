/**
 * 抽象命令类
 * @author qiaojy
 *
 */
public abstract class Command {

	//需求组
	protected RequirementGroup rg = new RequirementGroup();
	//美工组
	protected PageGroup pg = new PageGroup();
	
	public abstract void execute();
}
