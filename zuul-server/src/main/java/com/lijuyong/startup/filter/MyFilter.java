package com.lijuyong.startup.filter;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.lijuyong.startup.auth.model.JwtUser;
import com.lijuyong.startup.auth.model.LocalAuthUser;
import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

/**
 * Created by john on 2017/2/25.
 */
@Service
public class MyFilter extends ZuulFilter {
    private Logger mylog = LoggerFactory.getLogger(this.getClass());

    public MyFilter() {
        mylog.error("这是一个构造函数");

    }

    @Override
    public String filterType() {

        return "pre";
    }

    @Override
    public int filterOrder() {
        mylog.error("999");
        return 1;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        String requestUri = ctx.getRequest().getRequestURI();

        mylog.error("shouldFilter "+ requestUri);

        return requestUri.startsWith("/user-service");

    }

    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();

//        JwtUser jwtUser = (JwtUser)SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//
//        ObjectMapper mapper = new ObjectMapper();
//        try {
//            String json = mapper.writeValueAsString(jwtUser);
//            ctx.addZuulRequestHeader("x-youbang-user", json);
//        }
//        catch (Exception ex){
//            mylog.error(ex.getMessage());
//        }

        mylog.error("run zuul filter");
        return null;
    }
}
