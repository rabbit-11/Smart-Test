package com.qzgcsfcc.st.api;

import com.qzgcsfcc.st.model.Message;
import com.qzgcsfcc.st.model.Question;
import com.qzgcsfcc.st.model.param.ApiResult;
import com.qzgcsfcc.st.service.MessageService;
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
@RequestMapping("/message")
public class MessageController {

    @Autowired
    MessageService messageService;

    @ResponseBody
    @GetMapping("/getList")
    public ApiResult getList(Integer id) {
        return messageService.getList(id);
    }

    @ResponseBody
    @RequestMapping("/add")
    public ApiResult add(@RequestBody Message message) {
        return messageService.add(message);
    }

    @ResponseBody
    @RequestMapping("/edit")
    public ApiResult edit(@RequestBody Message message) {
        return messageService.edit(message);
    }

    @ResponseBody
    @GetMapping("/delete")
    public ApiResult del(Integer id) {
        return messageService.delete(id);
    }
}
