package cn.lmf.common.server.vo;

import org.springframework.stereotype.Component;

public class SimpleUser {
    private String name;
    private String age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "SimpleUser{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
