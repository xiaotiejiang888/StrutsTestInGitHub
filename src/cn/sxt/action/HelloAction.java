package cn.sxt.action;

import com.opensymphony.xwork2.*;


/**
 * Created by Administrator on 2016/3/18.
 */
public class HelloAction {
                 //Creating a new branch is quick AND simple.
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
