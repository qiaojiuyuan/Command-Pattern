/**
 * 发出命令的负责人
 * @author qiaojy
 *
 */
public class Invoker {

	private Command command;
	
	/**
	 * 设置命令，依赖倒置原则
	 * @param command
	 */
	public void setCommand(Command command) {
		this.command = command;
	}
	
	/**
	 * 执行命令
	 */
	public void action() {
		command.execute();
	}
}
