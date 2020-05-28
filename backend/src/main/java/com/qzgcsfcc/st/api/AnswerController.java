package com.qzgcsfcc.st.api;

import com.qzgcsfcc.st.model.Answer;
import com.qzgcsfcc.st.model.param.ApiResult;
import com.qzgcsfcc.st.service.AnswerService;
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
@RequestMapping("/answer")
public class AnswerController {

    @Autowired
    AnswerService answerService;

    @ResponseBody
    @RequestMapping("/getByUser")
    public ApiResult getByUser(@RequestBody Answer answer) {
        return answerService.getByUser(answer);
    }

    @ResponseBody
    @RequestMapping("/add")
    public ApiResult add(@RequestBody Answer answer) {
        return answerService.add(answer);
    }

    @ResponseBody
    @RequestMapping("/edit")
    public ApiResult edit(@RequestBody Answer answer) {
        return answerService.edit(answer);
    }

    @ResponseBody
    @GetMapping("/delete")
    public ApiResult del(Integer id) {
        return answerService.delete(id);
    }
}
