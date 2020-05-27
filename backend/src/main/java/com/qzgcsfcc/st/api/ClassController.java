package com.qzgcsfcc.st.api;

import com.qzgcsfcc.st.model.ClassInfo;
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
    @RequestMapping("/addStu")
    public ApiResult addStu(@RequestBody UserClass userClass) {
        return classService.addStu(userClass);
    }

    @ResponseBody
    @RequestMapping("/deleteStu")
    public ApiResult deleteStu(@RequestBody UserClass userClass) {
        return classService.deleteStu(userClass);
    }

    @ResponseBody
    @RequestMapping("/add")
    public ApiResult add(@RequestBody ClassInfo classInfo) {
        return classService.add(classInfo);
    }

    @ResponseBody
    @RequestMapping("/edit")
    public ApiResult edit(@RequestBody ClassInfo classInfo) {
        return classService.edit(classInfo);
    }

    @ResponseBody
    @GetMapping("/delete")
    public ApiResult del(Integer id) {
        return classService.delete(id);
    }
}
