package hello.hellospirng.controller;

import org.springframework.ui.Model;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @GetMapping("hello")
    public String hello(Model model){
        model.addAttribute("data","hello!!");
        return "hello";
    }//localhost:8080에서 실행

    @GetMapping("hello-mvc")
    public String helloMvc(@RequestParam("name") String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }
    //localhost:8080/hello-mvc?name=spring  에서 실행
    @GetMapping("hello-string")
    @ResponseBody //html body 부분에 직접 넣어주겠다
    public String helloString(@RequestParam("name") String name){
        return "hello " + name; //hello 뭐시기 로 바로 바뀜
    }
    //localhost:8080/hello-string?name=spring  에서 실행 결과 소스페이지도 확인

    @GetMapping("hello-api")
    @ResponseBody
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }
    //http://localhost:8080/hello-api?name=spring!! 실행
    static class Hello{
        private String name;
        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        
        //alt insert로 단축키
    }
    
}