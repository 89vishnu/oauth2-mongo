package com.miworld.mi.auth.config;//package com.miworld.mi.auth.config;
//
//import org.springframework.core.Ordered;
//import org.springframework.core.annotation.Order;
//import org.springframework.stereotype.Component;
//
//import javax.servlet.*;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@Component
//@Order(Ordered.HIGHEST_PRECEDENCE)
//public class SimpleCorsFilter implements Filter {
//
//    public SimpleCorsFilter() {
//    }
//
//    @Override
//    public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) throws IOException, ServletException {
//        HttpServletResponse response = (HttpServletResponse) res;
//        HttpServletRequest request = (HttpServletRequest) req;
//////        response.setHeader("Access-Control-Allow-Origin", "*");
//////        response.setHeader("Access-Control-Allow-Methods", "*");
//////        response.setHeader("Access-Control-Allow-Headers", "*");
//////
//////        if ("OPTIONS".equalsIgnoreCase(request.getMethod())) {
//////            response.setStatus(HttpServletResponse.SC_OK);
//////        } else {
//////            chain.doFilter(req, res);
//////        }
////        chain.doFilter(req, res);
//
////        response.setHeader("Access-Control-Allow-Origin", "*");
////        response.setHeader("Access-Control-Allow-Methods", "GET, POST, PUT, DELETE, OPTIONS");
////        response.setHeader("Access-Control-Max-Age", "3600");
////        response.setHeader("Access-Control-Allow-Headers", "X-PINGOTHER,Content-Type,X-Requested-With,accept,Origin,Access-Control-Request-Method,Access-Control-Request-Headers,Authorization");
////        response.addHeader("Access-Control-Expose-Headers", "xsrf-token");
////        if ("OPTIONS".equals(request.getMethod())) {
////            response.setStatus(HttpServletResponse.SC_OK);
////        } else {
//            chain.doFilter(req, res);
//        //}
//    }
//
//    @Override
//    public void init(FilterConfig filterConfig) {
//    }
//
//    @Override
//    public void destroy() {
//    }
//}
