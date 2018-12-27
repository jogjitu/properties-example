package properties;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:${env}.properties" // mention the property file name
})
public interface Environment extends Config {

    String url();

    String username();

    String password();

    @Key("username")
    String getUsername();

    @Key("password")
    String getPassword();

    @Key("db.hostname")
    String getDBHostname();

    @Key("db.port")
    int getDBPort();

    @Key("db.username")
    String getDBUsername();

    @Key("db.password")
    String getDBPassword();

}