
public class ClientMain {

	public static void main(String[] args) {
		Invoker zhangsan = new Invoker();
		Command command = new AddRequirementCommand();
		zhangsan.setCommand(command);
		zhangsan.action();
		Command command2 = new DeletePageCommand();
		zhangsan.setCommand(command2);
		zhangsan.action();
	}
}
