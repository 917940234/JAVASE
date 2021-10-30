package com.atguigu.java1;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * @description: TODO
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-10-03 18:38
 * @version: v1.0
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({ ANNOTATION_TYPE , CONSTRUCTOR , FIELD , LOCAL_VARIABLE , METHOD , PACKAGE , PARAMETER , TYPE})
public @interface MyAnnotations {
    MyAnnotation[] value();
}
