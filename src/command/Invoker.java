/**
 * @author shadow
 * @Date 2016��8��7������8:46:46
 * @Fun
 **/
package command;

public class Invoker {

	private ICommand command;
	
	public Invoker(ICommand command){
		this.command = command;
	}
	
	public void invoke(){
		this.command.execute();
	}
}
