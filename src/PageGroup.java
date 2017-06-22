/**
 * 美工组
 * @author qiaojy
 *
 */
public class PageGroup extends Group{

	@Override
	public void find() {
		System.out.println("找到美工组");
	}

	@Override
	public void add() {
		System.out.println("美工组增加一个页面");
	}

	@Override
	public void delete() {
		System.out.println("美工组删除一个页面");
	}

	@Override
	public void change() {
		System.out.println("美工组改变一个页面");
	}

	@Override
	public void plan() {
		System.out.println("美工组改变一个计划");
	}

}
