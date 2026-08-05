## Part A

### Scenario 1: E-Commerce Transactional Engine (OLTP)
- **Description:** A core banking/checkout transactional system with a fixed schema. It must process customer purchases, handle payment transactions with strong ACID consistency, and execute table joins (e.g. associating Customers, Orders, and Payment Tables).
- **Service Choice:** Amazon RDS is best for transactional system because it provides strong ACID compliance and consistency for purchases and payments. t uses a fixed relational schema and supports SQL joins, making it easy to manage relationships between customers, orders, and payments.
- **Architectural Justification:** Explain your choice in 3–5 sentences. Discuss consistency, schema rigidity, relationship support, and join capability.

### Scenario 2: Smart-Home IoT Sensor Streams
- **Description:** A tracking system for millions of smart-home IoT devices. Every device sends a status heartbeat payload every 10 seconds. The data structure is dynamic and changes from device to device (e.g. temperature, humidity, error codes, light status). The system requires sub-second ingestion rates and key-value query lookups by device ID.
- **Service Choice:** Amazon DynamoDB is built for high-speed key-value workloads and can handle millions of writes with automatic scaling. Its flexible schema supports different data formats from IoT devices while maintaining low-latency performance at a lower operational cost.
- **Architectural Justification:** Explain your choice in 3–5 sentences. Discuss write scalability, schema flexibility, performance under high throughput, and cost.

### Scenario 3: Quarterly Sales Analytics Reports
- **Description:** A monthly and quarterly business analytics system. It compiles historical purchase data from different sales channels over the past 5 years (containing billions of rows) to generate complex analytical queries (e.g. group sales by region, calculate rolling monthly totals). The operations are analytical (OLAP), not operational (OLTP).
- **Service Choice:** Amazon Redshift is designed for OLAP workloads and uses columnar storage with massively parallel processing to analyze large datasets quickly. It is optimized for complex queries and reporting, making it much faster than traditional OLTP databases for analytics.
- **Architectural Justification:** Explain your choice in 3–5 sentences. Discuss column-oriented storage, parallel processing, OLTP vs. OLAP architecture, and query times on large datasets.

---

## Part B

1. In cloud solutions, we often say **"use the right tool for the job."** What is the operational and financial risk of selecting a relational database like RDS for Scenario 2 (IoT stream)?
   Amazon RDS is not designed for massive IoT write workloads or changing data structures, so it can become a performance bottleneck. Scaling RDS for this use case would also increase infrastructure and maintenance costs compared to DynamoDB.
2. Why is Amazon S3 considered "object storage" rather than a database? When would you choose S3 over a database service?
   Amazon S3 stores files as objects instead of structured records and does not support SQL queries or transactions. It is best for storing backups, media files, and large data archives, while databases are better for applications that require frequent queries and updates.
