package com.spring.basic.web;

import com.spring.basic.common.MyLogger;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LogDemoService {

//    private final ObjectProvider<MyLogger> myLoggerProvider;
    private final MyLogger myLogger;

    public void logic(String id) {
//        MyLogger myLogger = myLogger.getObject();
        myLogger.log("service id = " + id);
    }
}
