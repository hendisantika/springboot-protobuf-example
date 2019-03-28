package com.hendisantika.springbootprotobufexample.domain;

/**
 * Created by IntelliJ IDEA.
 * Project : springboot-protobuf-example
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 2019-03-28
 * Time: 23:30
 */
public class PhoneNumber {
    private int areaCode;
    private int phoneNumber;

    public PhoneNumber(int areaCode, int phoneNumber) {
        this.areaCode = areaCode;
        this.phoneNumber = phoneNumber;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getAreaCode() {
        return areaCode;
    }
}
