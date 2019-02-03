package com.tslcq.springboot.controller;

import com.sun.org.apache.regexp.internal.RE;
import com.tslcq.springboot.domain.User;
import org.springframework.web.bind.annotation.*;
import sun.jvm.hotspot.debugger.Page;
import sun.text.resources.cldr.mr.FormatData_mr;

import javax.jws.soap.SOAPBinding;
import java.util.HashMap;
import java.util.Map;

/**
 * @author yangzengchun
 * @Title: SampleController
 * @ProjectName springboot
 * @Description: TODO
 * @date 2019-02-0210:39
 */

@RestController
public class SampleController {

    private  Map<String, Object> params = new HashMap<>(  );

    @RequestMapping("/")
    public  String show(){
        return "hello world!";
    }

    @RequestMapping("test")
    public Map<String, String> mapTest(){

        Map<String, String> map = new HashMap<>(  );
        map.put( "name", "xdclass" );
        return map;

    }

    /**
     * http://localhost:8080/v1/page_user1?from=10&size=12
     * @param from
     * @param size
     * @return
     */
    @GetMapping(value = "/v1/page_user1")
    public  Object pageUser(String from, String size){
        params.clear();
        params.put( "from", from);
        params.put( "size", size );
        return params;

    }

    /**
     *http://localhost:8080/v1/page_user2?page=10&size=12
     * @param from
     * @param size
     * @return
     */
    @GetMapping(value = "v1/page_user2")
    public Object pageUser2(@RequestParam(defaultValue = "0", name = "page")int from, int size){
        params.clear();
        params.put( "from", from);
        params.put( "size", size );
        return params;
    }

    @PostMapping("/v1/save_user")
    public Object saveUser(@RequestBody User user) {
        params.clear();
        params.put( "user", user );
        return params;
    }

    @GetMapping(value = "/v1/get_header")
    public  Object getheader(@RequestHeader("access_token") String accessToken, @RequestParam(required = true) String id){
        params.clear();
        params.put( "access_token", accessToken );
        params.put( "id", id );
        return params;
    }





}
