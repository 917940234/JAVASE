package com.atguigu.exer1;

import java.util.*;

/**
 * @description: TODO
 * @author: Youcheng_Zong
 * @email: 917940234@qq.com
 * @date: 2021-10-11 14:26
 * @version: v1.0
 */
public class DAO<T> {

    private Map<String,T> map = new HashMap<String,T>();
    //保存T类型的对象到Map成员变量中
    public void save(String id,T entity) {
        map.put(id,entity);
    }
    //从map中获取id对应的对象
    public T get(String id) {
        return map.get(id);
    }
    //替换map中key为id的内容，改为entity对象
    public void update(String id,T entity) {
        if(map.containsKey(id)) {
            map.put(id,entity);
        }
    }
    //返回map中存放的所有T对象
    public List<T> list() {
        //错误的
//        Collection<T> values = map.values();
//        return (List<T>) values;
        //正确的：
        List<T> list = new ArrayList<>();
        Collection<T> values = map.values();
        for (T t : values) {
            list.add(t);
        }
        return list;
    }
    //删除指定id对象
    public void delete(String id) {
        map.remove(id);
    }
}
