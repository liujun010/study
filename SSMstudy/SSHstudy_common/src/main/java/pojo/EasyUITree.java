package pojo;

/**
 * Created by liujun on 2019/3/31.
 */
public class EasyUITree {
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return Text;
    }

    public void setText(String text) {
        Text = text;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private int id;
    private String Text;
    private  String state;
}
