package com.example.designdemo.builder;

public class MacBook extends Computer {


    public MacBook(String os, String broad, String display) {
        this.os = os;
        this.broad = broad;
        this.display = display;
    }

    public static class MacBookBuilder extends Builder{


        public String os;
        public String broad;
        public String display;


        @Override
        public Builder buildOs(String os) {

            this.os = os;
            return this;
        }

        @Override
        public Builder buildBroad(String broad) {
            this.broad = broad;
            return this;
        }

        @Override
        public Builder buildDisplay(String display) {
            this.display = display;
            return this;
        }

        @Override
        public Computer build() {
            return new MacBook(os,broad,display);
        }
    }
}
