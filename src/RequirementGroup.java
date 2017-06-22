/**
 * 需求组
 * @author qiaojy
 *
 */
public class RequirementGroup extends Group{

	@Override
	public void find() {
		System.out.println("找到需求组");
	}

	@Override
	public void add() {
		System.out.println("需求组增加一项需求");
	}

	@Override
	public void delete() {
		System.out.println("需求组删除一项需求");
	}

	@Override
	public void change() {
		System.out.println("需求组改变一项需求");
	}

	@Override
	public void plan() {
		System.out.println("需求组变更记划");
	}
	
	
}
