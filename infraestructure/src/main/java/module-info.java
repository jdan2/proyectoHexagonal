module infraestructure {

    requires java.sql;
    requires org.slf4j;
    requires lombok;
    requires application;
    requires org.example.domain;

    exports infraestructure;
}