package com.gdufe.builderpattern.effective_java;

import lombok.Data;

/**
 * @Author: laichengfeng
 * @Description:
 * @Date: 2018/7/29 21:27
 */
public class User {

    private int id;

    private String name;

    private String email;

    private String addr;

    private String country;

    public static class Builder {
        private int id;

        private String name;

        private String email;

        private String addr;

        private String country;

        /**
         * id和name是必须属性
         * @param id
         * @param name
         */
        public Builder(int id, String name) {
            this.id = id;
            this.name = name;
        }

        public Builder setEmail(String email) {
            this.email = email;
            return this;
        }

        public Builder setAddr(String addr) {
            this.addr = addr;
            return this;
        }

        public Builder setCountry(String country) {
            this.country = country;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }

    public User(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.addr = builder.addr;
        this.email = builder.email;
        this.country = builder.country;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", addr='").append(addr).append('\'');
        sb.append(", country='").append(country).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
