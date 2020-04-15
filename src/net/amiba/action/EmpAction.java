package net.amiba.action;

import com.opensymphony.xwork2.ActionSupport;
import net.amiba.bean.Emp;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;


@Controller
@Scope("prototype")
public class EmpAction extends ActionSupport {
    private List<Emp> empList;

    public List<Emp> getEmpList() {
        return empList;
    }

    public void setEmpList(List<Emp> empList) {
        this.empList = empList;
    }

    @Override
    public String execute() throws Exception {
        empList = new ArrayList<>();

        empList.add(new Emp(9527,"zxc"));
        empList.add(new Emp(9528,"zxx"));
        empList.add(new Emp(9529,"amiba"));

        return SUCCESS;
    }
}
