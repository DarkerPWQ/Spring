package main.com.pwq;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author：WenqiangPu
 * @Description
 * @Date：Created in 11:44 2017/9/1
 * @Modified By：
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("spring1.xml");
        Math math = ctx.getBean("math", Math.class);
        int n1 = 100, n2 = 5;
        math.add(n1, n2);
        math.sub(n1, n2);
        math.mut(n1, n2);
        math.div(n1, n2);
        StrUtil strUtil = ctx.getBean("strUtil",StrUtil.class);
        strUtil.show();
    }
}
