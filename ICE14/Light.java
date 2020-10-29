package ICE14;

public class Light{
    private boolean on;
    public void switchOn(){
      on = true;
    }
    public void switchOff(){
      on = false;
    }

    public String getOnStatus(){
        if(this.on){
            return "on";
        } else {
            return "off";
        }
    } 
  }