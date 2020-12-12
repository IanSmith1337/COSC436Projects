package Assignment6.Memento;

import Assignment6.Orders;

public class Originator {

    private Orders order; 

    public void setOrder(Orders order){
        this.order = order; 
    }

    public Orders getOrders(){
        return order; 
    }

    public Memento saveOrderToMemento(){
        return new Memento(this.order);
    }

    public void restoreOrderFromMemento(Memento memento){
        order = memento.getOrder();
    }

    public class Memento {
        private final Orders order;
    
        public Memento(Orders orderToSave) {
            this.order = orderToSave;
        }
    
        public Orders getOrder(){
            return order; 
        }
        
    }

}
