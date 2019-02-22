package com.baizhi.controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.CircleCaptcha;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@Controller
@RequestMapping("/safeCode")
public class SafeCodeController {
    @RequestMapping("/getSafeCode")
    public void getCaptcha(HttpSession session, HttpServletResponse resp) {
        // 获得验证码的图片
        CircleCaptcha captcha = CaptchaUtil.createCircleCaptcha(80, 40, 4, 5);
        // 将验证码的图片写入到响应流中
        try {
            captcha.write(resp.getOutputStream());
        } catch (IOException e) {
            throw new RuntimeException("将验证码的图片写入到响应流中时异常", e);
        }
        // 获得验证码的字符串
        String code = captcha.getCode();
        // 放入session中
        session.setAttribute("code", code);
        System.out.println("~~~~~~验证码：" + code + "~~~~~~来自CaptchaController的getCaptcha");
    }
}
