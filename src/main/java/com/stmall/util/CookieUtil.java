package com.stmall.util;

import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by liweqnaun on 2019/7/9.
 */
@Slf4j
public class CookieUtil {
    private final static String COOKIE_DOMAIN = ".stmall.com";
    private final static String COOKIE_NAME = "stmall_login_token";

    public static String readLoginToken(HttpServletRequest request) {
        Cookie[] cks = request.getCookies();
        if(cks != null) {
            for(Cookie ck : cks) {
                log.info("read cookieName: {}, cookieValue: {}", ck.getName(), ck.getValue());
                if(StringUtils.equals(ck.getName(),COOKIE_NAME)) {
                    log.info("return cookieName: {}, cookieValue: {}", ck.getName(), ck.getValue());
                    return ck.getValue();
                }
            }
        }
        return null;
    }
    public static void writeLoginToken(HttpServletResponse response, String token) {
        Cookie ck = new Cookie(COOKIE_NAME, token);
        ck.setDomain(COOKIE_DOMAIN);
        ck.setPath("/"); //代表根目录
        ck.setMaxAge(60 * 60 * 24 * 365);//-1永久，不写的话只在内存有效
        log.info("write cookieName: {}, cookieValue: {}", ck.getName(), ck.getValue());
        response.addCookie(ck);
    }
    public static void delLoginToken(HttpServletResponse response, HttpServletRequest request) {
        Cookie[] cks = request.getCookies();
        if(cks != null) {
            for(Cookie ck : cks) {
                if(StringUtils.equals(ck.getName(), COOKIE_NAME)) {
                    ck.setDomain(COOKIE_DOMAIN);
                    ck.setPath("/");
                    ck.setMaxAge(0);
                    log.info("del cookieName: {}, cookieValue: {}", ck.getName(), ck.getValue());
                    response.addCookie(ck);
                    return;
                }
            }
        }
    }

}





