### **Real-Time Data Synchronization Between Databases**
**Problem Statement**: Your organization needs to synchronize customer data between two databases: an old legacy system (MySql)
and a modern CRM (MongoDB). Any update on one system should reflect in the other.

**Solution**:
- Use Camel to listen to changes on both systems using Camel’s JDBC component for Oracle and MongoDB component.
- Set up routes that detect changes and perform updates on the other database.
- Use the `IdempotentConsumer` pattern to prevent duplicate updates.
