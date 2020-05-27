package com.qzgcsfcc.st.api;

import com.qzgcsfcc.st.model.Question;
import com.qzgcsfcc.st.model.param.ApiResult;
import com.qzgcsfcc.st.service.QuestionService;
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
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    QuestionService questionService;

    @ResponseBody
    @RequestMapping("/add")
    public ApiResult add(@RequestBody Question question) {
        return questionService.add(question);
    }

    @ResponseBody
    @RequestMapping("/edit")
    public ApiResult edit(@RequestBody Question question) {
        return questionService.edit(question);
    }

    @ResponseBody
    @GetMapping("/delete")
    public ApiResult del(Integer id) {
        return questionService.delete(id);
    }
}
