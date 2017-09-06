package main.com.pwq;

import org.springframework.stereotype.Service;

/**
 * @Author：WenqiangPu
 * @Description
 * @Date：Created in 11:40 2017/9/1
 * @Modified By：
 */
@Service("math")
public class Math implements Imath
{
    //加
    public int add(int n1,int n2){
        int result=n1+n2;
        System.out.println(n1+"+"+n2+"="+result);
        System.out.println("master的提交，和devmerge后还在不在？");
        System.out.println("master上的提交，在本地打tag，不push");
        return result;
    }

    //减
    public int sub(int n1,int n2){
        int result=n1-n2;
        System.out.println(n1+"-"+n2+"="+result);
        return result;
    }

    //乘
    public int mut(int n1,int n2){
        int result=n1*n2;
        System.out.println(n1+"X"+n2+"="+result);
        return result;
    }

    //除
    public int div(int n1,int n2){
        int result=n1/n2;
        System.out.println(n1+"/"+n2+"="+result);
        return result;
    }
}
