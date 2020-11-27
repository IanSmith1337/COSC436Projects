package Assignment6;

import java.util.ArrayList;

public class Orders {
        private ArrayList<OrderItem> order = new ArrayList<>();

		public ArrayList<OrderItem> getOrder() {
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