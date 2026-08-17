import jakarta.annotation.*;


public class ConnectionPool {
    String url;
    String username;
    int poolSize;

    public ConnectionPool() {
        System.out.println("[Constructor] ConnectionPool instantiated.");
    }

    public ConnectionPool(String url, String username, int poolSize) {
        System.out.println("[Constructor] ConnectionPool instantiated.");
        this.url = url;
        this.username = username;
        this.poolSize = poolSize;
    }

    public void executeQuery(String sql) {
        System.out.println("[Operation] Executing query: [" +  sql + "] on [" +  url +"]");
    }

    @PostConstruct
    public void init() {
        System.out.println("[Lifecycle] Initializing ConnectionPool with URL: [" + url + "] and Pool Size: [" + poolSize + "]");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("[Lifecycle] Closing all connections in pool for URL: [" + url + "]");
    }
}
