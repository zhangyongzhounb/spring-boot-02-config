package com.zyz.springboot.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * 将配置文件中配置每一个属性的值，映射到这个组件中
 * @ConfigurationProperties : 告诉SpringBoot将本类中的所有属性和配置文件中相关
 * 的配置进行绑定；
 *
 * 只有这个组件是容器中的组件，才能容器提供的@ConfigurationProperties功能；
 * @ConfigurationProperties(prefix="person")默认从全局配置文件中获取值；
 *
 * Created by yongzhou.zhang on 2019/5/13.
 */
@PropertySource(value={"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person")
@Validated
public class Person {

    /**
     * <bean class="Person">
     *     <property name="lastName" value="字面量/${key}从环境变量、配置文件中获取值/#{SpEL}"></property>
     * </bean>
     *
     */
//    @Value("${person.last-name}")
    //lastName 必须是邮箱格式
//    @Email
    private String lastName;
//    @Value("#{11*2}")
    private Integer age;
//    @Value("true")
    private Boolean boss;
    private Date birth;

//    @Value("${person.maps}")
    private Map<String,Object> maps;
    private List<Object> lists;
    private Dog dog;


    @Override
    public String toString() {
        return "Person{" +
                "lastName='" + lastName + '\'' +
                ", age=" + age +
                ", boss=" + boss +
                ", birth=" + birth +
                ", maps=" + maps +
                ", lists=" + lists +
                ", dog=" + dog +
                '}';
    }

    public String getLastName() {
        return lastName;
    }

    public Integer getAge() {
        return age;
    }

    public Boolean getBoss() {
        return boss;
    }

    public Date getBirth() {
        return birth;
    }

    public Map<String, Object> getMaps() {
        return maps;
    }

    public List<Object> getLists() {
        return lists;
    }

    public Dog getDog() {
        return dog;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setBoss(Boolean boss) {
        this.boss = boss;
    }

    public void setBirth(Date birth) {
        this.birth = birth;
    }

    public void setMaps(Map<String, Object> maps) {
        this.maps = maps;
    }

    public void setLists(List<Object> lists) {
        this.lists = lists;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
