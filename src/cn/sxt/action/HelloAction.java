package cn.sxt.action;

import com.opensymphony.xwork2.*;


/**
 * Created by Administrator on 2016/3/18.
 */
public class HelloAction {
    //master上也有注释啦
    private String name;
    public  String execute(){
        System.out.println("name ="+name);
        return Action.SUCCESS;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
