package com.qzgcsfcc.st.api;

import com.qzgcsfcc.st.model.Answer;
import com.qzgcsfcc.st.model.Exam;
import com.qzgcsfcc.st.model.param.ApiResult;
import com.qzgcsfcc.st.service.ExamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author dxc
 * @date 2020/5/27 22:15
 */

@Controller
@RequestMapping("/exam")
public class ExamController {

    @Autowired
    ExamService examService;

    @ResponseBody
    @RequestMapping("/add")
    public ApiResult add(@RequestBody Exam exam) {
        return examService.add(exam);
    }

    @ResponseBody
    @RequestMapping("/edit")
    public ApiResult edit(@RequestBody Exam exam) {
        return examService.edit(exam);
    }

    @ResponseBody
    @GetMapping("/delete")
    public ApiResult del(Integer id) {
        return examService.delete(id);
    }

    @ResponseBody
    @GetMapping("/getByClass")
    public ApiResult getByClass(Integer classId) {
        return examService.getByClass(classId);
    }

    @ResponseBody
    @GetMapping("/getByUser")
    public ApiResult getByUser(Integer userId) {
        return examService.getByUser(userId);
    }

    @ResponseBody
    @GetMapping("/openExam")
    public ApiResult openExam(Integer id) {
        return examService.openExam(id);
    }
}
