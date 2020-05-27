package com.qzgcsfcc.st.api;

import com.qzgcsfcc.st.model.User;
import com.qzgcsfcc.st.model.param.ApiResult;
import com.qzgcsfcc.st.model.relationship.UserClass;
import com.qzgcsfcc.st.service.ClassService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * @author dxc
 * @since 2020-5-24
 */
@Controller
@RequestMapping("/class")
public class ClassController {


    @Autowired
    ClassService classService;

    @ResponseBody
    @GetMapping("/getStu")
    public ApiResult getStu(Integer id) {
        return classService.getStu(id);
    }

    @ResponseBody
    @RequestMapping("/add")
    public ApiResult add(@RequestBody UserClass userClass) {
        return classService.add(userClass);
    }

    @ResponseBody
    @RequestMapping("/delete")
    public ApiResult delete(@RequestBody UserClass userClass) {
        return classService.delete(userClass);
    }
}
