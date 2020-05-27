package com.qzgcsfcc.st.api;

import com.qzgcsfcc.st.model.ClassInfo;
import com.qzgcsfcc.st.model.Library;
import com.qzgcsfcc.st.model.param.ApiResult;
import com.qzgcsfcc.st.service.ClassService;
import com.qzgcsfcc.st.service.LibraryService;
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
@RequestMapping("/library")
public class LibraryController {

    @Autowired
    LibraryService libraryService;

    @ResponseBody
    @RequestMapping("/add")
    public ApiResult add(@RequestBody Library library) {
        return libraryService.add(library);
    }

    @ResponseBody
    @RequestMapping("/edit")
    public ApiResult edit(@RequestBody Library library) {
        return libraryService.edit(library);
    }

    @ResponseBody
    @GetMapping("/delete")
    public ApiResult del(Integer id) {
        return libraryService.delete(id);
    }
}
