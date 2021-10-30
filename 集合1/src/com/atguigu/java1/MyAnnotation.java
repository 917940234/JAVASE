package com.atguigu.java1;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * @description: TODO
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-10-03 17:56
 * @version: v1.0
 */
@Inherited
@Repeatable(MyAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)
@Target({ ANNOTATION_TYPE , CONSTRUCTOR , FIELD , LOCAL_VARIABLE , METHOD , PACKAGE , PARAMETER , TYPE , TYPE_PARAMETER , TYPE_USE})
public @interface MyAnnotation {
    String value() default "hello";
}
