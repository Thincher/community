package life.majiang.community.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller//允许类接受前端请求
public class HelloController {
    @GetMapping("/hello")
    public String greeting(@RequestParam(name="name") String name, Model model) {//@RequestParam可以接受来自页面的数据
        model.addAttribute("name", name);
        return "hello"; //会再resource.template里面找hello文件
    }
}
