package com.qzgcsfcc.st.api;

import com.qzgcsfcc.st.model.Paper;
import com.qzgcsfcc.st.model.param.ApiResult;
import com.qzgcsfcc.st.model.relationship.PaperQuestion;
import com.qzgcsfcc.st.service.PaperService;
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
@RequestMapping("/paper")
public class PaperController {

    @Autowired
    PaperService paperService;

    @ResponseBody
    @RequestMapping("/add")
    public ApiResult add(@RequestBody Paper paper) {
        return paperService.add(paper);
    }

    @ResponseBody
    @RequestMapping("/edit")
    public ApiResult edit(@RequestBody Paper paper) {
        return paperService.edit(paper);
    }

    @ResponseBody
    @GetMapping("/delete")
    public ApiResult del(Integer id) {
        return paperService.delete(id);
    }

    @ResponseBody
    @RequestMapping("/addQuestion")
    public ApiResult addQuestion(@RequestBody PaperQuestion paperQuestion) {
        return paperService.addQuestion(paperQuestion);
    }

    @ResponseBody
    @RequestMapping("/editQuestion")
    public ApiResult editQuestion(@RequestBody PaperQuestion paperQuestion) {
        return paperService.editQuestion(paperQuestion);
    }

    @ResponseBody
    @RequestMapping("/delQuestion")
    public ApiResult delQuestion(@RequestBody PaperQuestion paperQuestion) {
        return paperService.delQuestion(paperQuestion);
    }
}
