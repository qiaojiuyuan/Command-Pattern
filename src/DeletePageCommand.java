/**
 * 删除界面命令
 * @author qiaojy
 *
 */
public class DeletePageCommand extends Command{

	@Override
	public void execute() {
		pg.find();
		rg.delete();
		rg.plan();
	}

}
