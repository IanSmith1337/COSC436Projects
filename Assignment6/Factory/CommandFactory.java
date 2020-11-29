package Assignment6.Factory;

import Assignment6.GetMenu;
import Assignment6.Interface.cmdInterface;

public class CommandFactory extends AbstractFactory {

	@Override
	public cmdInterface getCMD(String cmdType) {
        if(cmdType.equalsIgnoreCase("menu")){
            return new GetMenu(ag);
        }
      
		return null;
	}
    
}
