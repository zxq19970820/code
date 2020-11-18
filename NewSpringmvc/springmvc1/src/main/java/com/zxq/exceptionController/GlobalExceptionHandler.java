package com.zxq.exceptionController;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.multipart.MaxUploadSizeExceededException;

/**
 * 2 * @Author: zxq
 * 3 * @Date: 2020/9/14 18:54
 * 4
 */
@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(MaxUploadSizeExceededException.class)
    public String MaxUploadSizeExceededException(MaxUploadSizeExceededException e, Model model) {
        model.addAttribute("MaxUploadSizeExceededException", e.getMessage());
        return "MaxUploadSizeExceededException";
    }




    @ExceptionHandler(Exception.class)
    public String OtherException(Exception e, Model model) {
        model.addAttribute("Exception", e.getMessage());
        return "otherException";
    }
}
