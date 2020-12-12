package Assignment6;

import java.util.ArrayList;
import java.util.List;

import Assignment6.CommandPattern.Classes.SystemInterface;

public class Orders {
        private List<OrderItem> order = new ArrayList<>();

		public List<OrderItem> getOrder() {
			return order;
		}

		public void addItems(OrderItem item) {
			if (menuHasItem(item.getItemNumber(), SystemInterface.getMenu())) {
				this.order.add(item);
			}
			
		}

		public boolean menuHasItem(int number, Menu menu) {
			for (MenuItem menuItem : menu.getMenu()) {
				if(menuItem.getItemNumber() == number) {
					return true;
				}
			}
			return false;
		}
}
//The Orders objelct indicates what menu items were ordered