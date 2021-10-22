package model;

public class Checkbox implements Component{
    static int i =0;
    @Override
    public String render() {
        i++;
        return "checkbox"+i;
    }
}
