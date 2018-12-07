 module com.lib {
    requires java.base;
    requires java.management;
    requires java.naming;
    requires java.sql;
    requires spring.web;
    requires spring.boot;
    requires tomcat.annotations.api;
    requires spring.boot.autoconfigure;
    requires spring.context;
    requires spring.beans;
    requires spring.core;
    requires spring.data.commons;
    requires com.fasterxml.jackson.core;
    requires java.persistence;
    requires java.validation;
    requires spring.data.jpa;
    requires postgresql;
    requires net.bytebuddy;
    requires java.xml.bind;
    requires spring.orm;
    requires org.hibernate.orm.core;
    opens com.lib.config to spring.core,spring.beans,spring.context,spring.web;
    opens com.lib.application to spring.core,spring.beans,spring.context,spring.web;
    opens com.lib.domain to org.hibernate.validator,org.hibernate.orm.core,spring.core;
    opens com.lib.manager to spring.core;
    opens com.lib.controller to spring.core;
    exports com.lib.valueobject;
    exports com.lib.controller;
    exports com.lib.manager;
    exports com.lib.domain;
}